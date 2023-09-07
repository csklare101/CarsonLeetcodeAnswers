# Write your MySQL query statement below
Select emp.name as Employee
from Employee man
inner join Employee emp on man.id = emp.managerID
where man.salary < emp.salary
