--To write a  Cursor to display the list of employees who are Working as a Managers or Analyst.
set serveroutput on;
declare
    emprec emp%rowtype;
    cursor mycur is select * from emp where job in('MANAGER','ANALYST');
   
begin
    open mycur;
    loop
    fetch mycur into emprec;
    exit when mycur%NOTFOUND;    
    dbms_output.put_line(emprec.empno || '     ' || emprec.ename || '    ' || emprec.deptno || '    ' || emprec.sal || '    ' || emprec.job); 
    end loop;
    close mycur;
end;


--Write PL/SQL code in Cursor to display employee names and salary
set serveroutput on;
declare     
    empName emp.ename%type;    
    salary emp.sal%type;
    
    cursor mycur is select ename,nvl(sal,0) from emp;
begin
    if not mycur%ISOPEN then
		open mycur;
    end if;
    loop
		fetch mycur into empName, salary ;
		exit when mycur%NOTFOUND;    
		dbms_output.put_line(empName || ' => ' ||  salary ); 
		end loop;
    close mycur;
end;

--Write PL/SQL code in Procedure to find the Reverse of the number

set serveroutput on;

declare
	number1 varchar2(10):=&number1;
	length1 int;
    result1 varchar2(10);
begin
    length1:=length(number1);
    for i in reverse 1..length1 loop
        result1 := result1 || substr(number1,i,1);
        end loop;
    dbms_output.put_line(number1 || ' Reverse Number : ' || result1);
end;