INSERT INTO tooltips (id, type, name, img_uri, contents) values(1, 'ENGINE', '가솔린 1.6', 'https://www.hyundai.com/contents/spec/guide/cn_smartstreamg1.6_s.jpg', '차세대 스마트스트림 엔진을 적용하여 연비 효율이 우수하고, 안정감 있는 주행 성능을 제공합니다');
INSERT INTO tooltips (id, type, name, img_uri, contents) values(2, 'ENGINE', 'LPG 1.6', 'https://www.hyundai.com/contents/spec/guide/cn_lpg1.6_s.jpg', '높은 효율의 연비와 비교적 저렴한 연료비용으로 경제성이 우수합니다');
INSERT INTO tooltips (id, type, name, img_uri, contents) values(3, 'ENGINE', '1.6 가솔린 터보', 'https://www.hyundai.com/contents/spec/guide/nx_smartstreamg1.6t_s.jpg', '차세대 스마트스트림 엔진을 적용하여 연비 효율이 우수하고, 안정감 있는 주행 성능을 제공합니다');
INSERT INTO tooltips (id, type, name, img_uri, contents) values(4, 'ENGINE', '디젤', 'https://www.hyundai.com/contents/spec/guide/nx_diesel2.0_s.jpg','높은 토크로 파워풀한 드라이빙이 가능하며, 차급대비 연비 효율이 우수합니다');

INSERT INTO tooltips (id, type, name, img_uri, contents) values(5, 'GEARBOX', 'A/T', 'https://www.hyundai.com/contents/spec/guide/nx_smartstreamivt_s.jpg', '운전자가 직접 변속을 하지 않고 적정한 변속 시점에 자동으로 변속해주는 시스템으로, 변속 충격이 작고 부드러우면서 선형적인 가속 감각과 편안한 승차감이 특징입니다');
INSERT INTO tooltips (id, type, name, img_uri, contents) values(6, 'GEARBOX', 'DCT','https://www.hyundai.com/contents/spec/guide/nx_7dct_d_s.jpg','두 개의 클러치를 사용해 연속적인 변속으로 다이내믹한 변속감을 제공하고, 빠른 변속이 가능하여 연비 효율이 우수합니다');

INSERT INTO tooltips (id, type, name, img_uri, contents) values(7, 'DRIVING', '2WD', 'https://www.hyundai.com/contents/spec/guide/nx_7dct_h_s.jpg','엔진에서 전달되는 동력이 전/후륜 바퀴 중 한쪽으로만 전달되어 차량을 움직이는 방식입니다.차체가 가벼워 연료 효율이 높습니다');
INSERT INTO tooltips (id, type, name, img_uri, contents) values(8, 'DRIVING', '4WD', 'https://www.hyundai.com/contents/spec/guide/4WD.JPG','전자식 상시 4륜 구동 시스템 입니다. 도로의 상황이나 주행 환경에 맞춰 전후륜 구동력을 자동배분하여 주행 안전성을 높여줍니다.');
-- driving
INSERT INTO model_tooltips (tooltips_id, model_id) values (7, 7);
INSERT INTO model_tooltips (tooltips_id, model_id) values (8, 8);
INSERT INTO model_tooltips (tooltips_id, model_id) values (7, 9);
INSERT INTO model_tooltips (tooltips_id, model_id) values (8, 10);
INSERT INTO model_tooltips (tooltips_id, model_id) values (7, 11);
INSERT INTO model_tooltips (tooltips_id, model_id) values (8, 12);
INSERT INTO model_tooltips (tooltips_id, model_id) values (7, 13);
INSERT INTO model_tooltips (tooltips_id, model_id) values (8, 14);
INSERT INTO model_tooltips (tooltips_id, model_id) values (7, 15);
INSERT INTO model_tooltips (tooltips_id, model_id) values (8, 16);
INSERT INTO model_tooltips (tooltips_id, model_id) values (7, 17);
INSERT INTO model_tooltips (tooltips_id, model_id) values (8, 18);
-- gearbox
INSERT INTO model_tooltips (tooltips_id, model_id) values (5, 7);
INSERT INTO model_tooltips (tooltips_id, model_id) values (5, 8);
INSERT INTO model_tooltips (tooltips_id, model_id) values (6, 9);
INSERT INTO model_tooltips (tooltips_id, model_id) values (6, 10);
INSERT INTO model_tooltips (tooltips_id, model_id) values (5, 11);
INSERT INTO model_tooltips (tooltips_id, model_id) values (5, 12);
INSERT INTO model_tooltips (tooltips_id, model_id) values (6, 13);
INSERT INTO model_tooltips (tooltips_id, model_id) values (6, 14);
INSERT INTO model_tooltips (tooltips_id, model_id) values (5, 15);
INSERT INTO model_tooltips (tooltips_id, model_id) values (5, 16);
INSERT INTO model_tooltips (tooltips_id, model_id) values (6, 17);
INSERT INTO model_tooltips (tooltips_id, model_id) values (6, 18);
-- engines
INSERT INTO model_tooltips (tooltips_id, model_id) values (1, 1);
INSERT INTO model_tooltips (tooltips_id, model_id) values (2, 2);
INSERT INTO model_tooltips (tooltips_id, model_id) values(1, 3);
INSERT INTO model_tooltips (tooltips_id, model_id) values (2, 4);
INSERT INTO model_tooltips (tooltips_id, model_id) values (1, 5);
INSERT INTO model_tooltips (tooltips_id, model_id) values (2, 6);
-- # 가솔린 터보 - 3 디젤 - 4
INSERT INTO model_tooltips (tooltips_id, model_id) values (4, 7);
INSERT INTO model_tooltips (tooltips_id, model_id) values (4, 8);
INSERT INTO model_tooltips (tooltips_id, model_id) values (3, 9);
INSERT INTO model_tooltips (tooltips_id, model_id) values (3, 10);
INSERT INTO model_tooltips (tooltips_id, model_id) values (4, 11);
INSERT INTO model_tooltips (tooltips_id, model_id) values (4, 12);
INSERT INTO model_tooltips (tooltips_id, model_id) values (3, 13);
INSERT INTO model_tooltips (tooltips_id, model_id) values (3, 14);
INSERT INTO model_tooltips (tooltips_id, model_id) values (4, 15);
INSERT INTO model_tooltips (tooltips_id, model_id) values (4, 16);
INSERT INTO model_tooltips (tooltips_id, model_id) values (3, 17);
INSERT INTO model_tooltips (tooltips_id, model_id) values (3, 18);