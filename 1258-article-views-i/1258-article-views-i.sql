# Write your MySQL query statement below
-- select distinct author_id as id from Views v where exists (select viewer_id from Views e where v.author_id=e.viewer_id) order by author_id;

SELECT DISTINCT author_id as id FROM Views WHERE author_id=viewer_id ORDER BY id;