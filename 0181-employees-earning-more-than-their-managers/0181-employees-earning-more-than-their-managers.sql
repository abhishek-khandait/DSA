SELECT e.name as Employee FROM Employee e JOIN Employee m ON e.managerId = m.id WHERE e.salary > m.salary ;

--  ON e.managerId = m.id 
-- is used to establish connection between e which we are considering employee table and manager table which is m 

-- ON e.managerId = m.id connects each employee row to its corresponding manager row from the same table