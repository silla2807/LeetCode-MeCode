CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    RETURN (
        SELECT salary
        FROM (
            SELECT salary, DENSE_Rank() OVER (ORDER BY salary DESC) AS rankk
            FROM Employee
        ) ranks
        WHERE rankk = N
        LIMIT 1
    );
END;
