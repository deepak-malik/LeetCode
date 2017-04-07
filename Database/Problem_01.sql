-- Problem_01.sql
--
-- Write a SQL query to find all duplicate email's in a table named Person.
--
-- +----+---------+
-- | Id | Email   |
-- +----+---------+
-- | 1  | a@b.com |
-- | 2  | c@d.com |
-- | 3  | a@b.com |
-- +----+---------+
--
-- For example, your query should return the following for the above table:
--
-- +---------+
-- | Email   |
-- +---------+
-- | a@b.com |
-- +---------+
-- Note: All email's are in lower case.

SELECT Email 
	FROM Person
GROUP BY Email 
	HAVING COUNT(*) > 1;
