# Write your MySQL query statement below
-- delete p from Person p, Person q where p.email=q.email and p.id>q.id;
delete p from Person p join Person q on p.email=q.email where p.id!=q.id and p.id>q.id;