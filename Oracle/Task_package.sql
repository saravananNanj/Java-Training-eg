CREATE OR replace PACKAGE emp_pack
IS
  PROCEDURE update_salary(
    ijob    IN VARCHAR2,
    min_sal IN NUMBER,
    max_sal IN NUMBER);
  FUNCTION Get_service_years(
    eno IN NUMBER)
  RETURN NUMBER;
END emp_pack; 


CREATE OR replace PACKAGE BODY
  emp_pack
AS
PROCEDURE Update_salary(ijob    IN VARCHAR2,
                        min_sal IN NUMBER,
                        max_sal IN NUMBER)
IS
  salaryexp EXCEPTION;
  joba empa.job%TYPE;
  invalidjob EXCEPTION;
  currsal empa.sal%TYPE;
BEGIN
  SELECT   job,
           Min(sal)
  INTO     joba,
           currsal
  FROM     empa
  WHERE    job = ijob
  GROUP BY job;
  
  IF ( joba != ijob ) THEN
    Raise_application_error(-20457, 'Invalid JOB');
  END IF;
  IF ( min_sal > max_sal ) THEN
    Raise_application_error(-20456, 'Max sal is less than min sal');
  ELSIF ( min_sal < max_sal )THEN
    UPDATE empa
    SET    sal = max_sal
    WHERE  job = ijob
    AND    sal < max_sal;
    
    dbms_output.Put_line(' Max salary is updated :'
    || currsal);
  END IF;
EXCEPTION
WHEN salaryexp THEN
  Raise_application_error(-20456, 'Max salary is less than Min salary') ;
  dbms_output.Put_line('Max salary is less than Min salary ');
  Raise_application_error(-20457, 'Invalid JOB');
  dbms_output.Put_line('Invalid Job ');
END update_salary;
FUNCTION Get_service_years(eno IN NUMBER)
  RETURN NUMBER
IS
  vyear NUMBER:=0;
BEGIN
  SELECT trunc((SYSDATE,hiredate)/365) year
  INTO   vyear
  FROM   empa
  WHERE  empno=eno;
  
  RETURN vyear;
EXCEPTION
WHEN no_data_found THEN
  dbms_output.Put_line(eno
  || ' Employee no not found');
  RETURN vyear;
END get_service_years;
END emp_pack;

/
--execute Emp_Pack.Update_Salary('MANAGER',5500,7000);
