-- Lv4. 가장 높은 월급을 받는 직원은?
-- 1. 각 직원의 이름, 부서, 월급, 그리고 그 직원이 속한 부서에서 가장 높은 월급을 받고 있는 직원의 이름과 월급을 조회하는 SQL 쿼리를 작성해주세요.
select e1.Name as Name,
       e1.Department as Department,
       e1.Salary as Salary,
       e2.Name as Top_Earner,
       e2.Salary as Top_Salary
from Employees e1
join Employees e2 on e1.Department = e2.Department
where e2.Salary = (
    select max(e3.Salary)
    from Employees e3
    where e1.Department = e3.Department
         )

-- 2. 부서별로 평균 월급이 가장 높은 부서의 이름과 해당 부서의 평균 월급을 조회하는 SQL 쿼리를 작성해주세요.

select Department,
       avg(Salary) as Avg_Salary
from Employees e1
group by Department
having Avg_Salary =
       (select max(avg)
        from (
    select avg(Salary) as avg
    from Employees e2
    group by Department
    ) a
        )