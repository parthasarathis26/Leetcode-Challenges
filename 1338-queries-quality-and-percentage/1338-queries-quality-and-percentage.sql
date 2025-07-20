# Write your MySQL query statement below
select query_name,round(avg(rating/position),2) as quality,ROUND(AVG(rating < 3) * 100, 2) AS poor_query_percentage 
from Queries group by query_name;