-- LV3. 이용자의 포인트 조회하기
select u.user_id,
       u.email,
       coalesce(point,0) as point
from users u
left join point_users p on u.user_id = p.user_id
order by point desc