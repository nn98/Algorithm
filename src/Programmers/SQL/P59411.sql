-- 코드를 입력하세요
SELECT i.animal_id, i.name
from animal_ins i
         join animal_outs o
              using (animal_id)
order by o.datetime - i.datetime desc limit 2;

-- # SELECT animal_id, name
--     # from animal_ins
--                # where animal_id = (
--                                     #     SELECT i.animal_id, i.name, o.datetime - i.datetime as period
-- #     from animal_ins i
-- #     join animal_outs o
-- #     using (animal_id)
-- #     order by period desc
-- # );
-- # SELECT i.animal_id, i.name, i.datetime as Idate, o.datetime as Odate, o.datetime - i.datetime as period
--       # from animal_ins i
--       # join animal_outs o
-- # using (animal_id)
-- # order by period desc
--       # limit 2
--       # ;