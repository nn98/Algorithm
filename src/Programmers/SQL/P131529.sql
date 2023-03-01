-- 코드를 입력하세요
-- # SELECT product_code, SUBSTRING(product_code,1,2) from product;
SELECT left(product_code,2) as category, count(*) as products from product group by category;
-- # select * from product