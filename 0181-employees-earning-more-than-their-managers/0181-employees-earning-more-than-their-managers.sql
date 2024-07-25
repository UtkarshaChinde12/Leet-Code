# Write your MySQL query statement below
#select e.name as Employee from Employee e where e.salary > (select y.salary from Employee y where e.managerId=y.id);
#OR
select e.name as Employee from Employee e, Employee y where e.managerId=y.id and e.salary>y.salary;
