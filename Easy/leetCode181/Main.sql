with ids(id) as
(select e1.id from employee e1 join employee e2
on e1.managerid = e2.id where
e1.salary > e2.salary)
select name as Employee from employee where id in (select * from ids);
