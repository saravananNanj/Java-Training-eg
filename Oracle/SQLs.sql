/*
No 25:
129. List the most recently hired employee of Grade 3 belongs to the Loc CHICAGO.
130. List the emps with their Dept names.
131. List the emps who are not working in ‘Sales’ dept.
*/
--129
select * from (
select emp.ename,emp.sal,emp.hiredate,dname,loc,grade from emp  inner join dept
on emp.deptno = dept.deptno and dept.loc='CHICAGO'
INNER join salgrade on emp.sal between losal and hisal and
grade = 3 order by emp.hiredate desc )
WHERE rownum = 1;

--130
select emp.*,dname from emp inner join dept
on emp.deptno=dept.deptno;

--131
select emp.*,dname from emp inner join dept
on emp.deptno=dept.deptno
where dname<>'SALES';