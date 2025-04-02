-- LV5. 예산이 가장 큰 프로젝트는?
-- 1. 각 직원이 속한 부서에서 가장 높은 월급을 받는 직원들만 포함된 결과를 조회하는 SQL 쿼리를 작성해주세요.
select Name,
       Department,
       Salary
from Employees e1
where Salary = (
    select max(e2.Salary) as max
    from Employees e2
    where e1.Department = e2.Department
    )

-- 2. 직원이 참여한 프로젝트 중 예산이 10,000 이상인 프로젝트만을 조회하는 SQL 쿼리를 작성해주세요.
select Name,
       ProjectName,
       Budget
from Employees e
join EmployeeProjects ep on e.EmployeeID = ep.EmployeeID
join Projects p on ep.ProjectID = p.ProjectID
where p.Budget >= 10000
