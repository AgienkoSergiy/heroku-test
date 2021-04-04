INSERT INTO PUBLIC.TEST(ID, TEST_NAME)
SELECT * FROM (VALUES
               (1, 'black'),
               (2, 'grey'),
               (3, 'green')) as DEFAULT_VALUES
WHERE NOT EXISTS (SELECT * FROM PUBLIC.TEST);