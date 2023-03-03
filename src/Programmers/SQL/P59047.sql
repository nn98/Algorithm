-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE (NAME LIKE '%EL%'
    or NAME LIKE '%el%' )
  and ANIMAL_TYPE = 'Dog'
order by NAME;

    # select name from animal_ins
                           # where name
          # like '%el%'
# or '%EL%'
# and animal_type = 'dog'