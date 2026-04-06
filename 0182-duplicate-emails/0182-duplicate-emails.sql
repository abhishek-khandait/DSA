# Write your MySQL query statement belows
select email as Email from Person group by email having count(*)>1;