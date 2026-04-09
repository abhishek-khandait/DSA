# Write your MySQL query statement below
select c.name as Customers from Customers AS c left join Orders o on c.id = o.customerId where CustomerId is null;;