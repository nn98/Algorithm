-- https://school.programmers.co.kr/learn/courses/30/lessons/59044?language=mysql
-- # SELECT name, datetime from animal_outs;
-- # select * from animal_ins;
-- # select * from animal_outs;
--
-- # select * from animal_ins
--                       # where animal_id not in (
--     #     select animal_id from animal_outs order by datetime);

select i.name, i.datetime
from animal_outs o
         right join animal_ins i
                    on o.animal_id = i.animal_id
where o.name is null
  and i.name is not null
order by i.datetime limit 3;