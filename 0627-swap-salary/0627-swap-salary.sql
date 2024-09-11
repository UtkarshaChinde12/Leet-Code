# Write your MySQL query statement below
-- update Salary 
-- set sex=(
-- CASE
-- WHEN sex='f' THEN 'm'
-- ELSE 'f'
-- END
-- );

UPDATE salary
SET sex=
CASE sex
    WHEN 'm' THEN 'f'
    ELSE 'm'
END;