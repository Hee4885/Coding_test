-- 코드를 입력하세요
SELECT FACTORY_ID, FACTORY_NAME, ADDRESS FROM FOOD_FACTORY WHERE ADDRESS LIKE "강원도%" ORDER BY FACTORY_ID ASC

-- "%"는  이어지는 값들
-- "LIKE" 는 포함한 값들
-- 오름차순 정렬은 "ASC" / 내림차순은 "DESC"
-- 정렬 사용 시 "ORDER BY"