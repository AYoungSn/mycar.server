INSERT INTO car (id, name, type) values(1, '투싼', 'SUV');
INSERT INTO car (id, name, type) values(2, '더 뉴 아반떼', 'SEDAN');

INSERT INTO trim (id, car_id, name) values(1, 1, 'Smart');
INSERT INTO trim (id, car_id, name) values(2, 1, 'Modern');
INSERT INTO trim (id, car_id, name) values(3, 1, 'Inspiration');

INSERT INTO trim (id, car_id, name) values(4, 2, 'Modern');
INSERT INTO trim (id, car_id, name) values(5, 2, 'Premium');
INSERT INTO trim (id, car_id, name) values(6, 2, 'Inspiration');

INSERT INTO engines (id, name, img_uri, contents) values(1, '가솔린 1.6', 'https://www.hyundai.com/contents/spec/guide/cn_smartstreamg1.6_s.jpg', '차세대 스마트스트림 엔진을 적용하여 연비 효율이 우수하고, 안정감 있는 주행 성능을 제공합니다');
INSERT INTO engines (id, name, img_uri, contents) values(2, 'LPG 1.6', 'https://www.hyundai.com/contents/spec/guide/cn_lpg1.6_s.jpg', '높은 효율의 연비와 비교적 저렴한 연료비용으로 경제성이 우수합니다');
INSERT INTO engines (id, name, img_uri, contents) values(3, '1.6 가솔린 터보', 'https://www.hyundai.com/contents/spec/guide/nx_smartstreamg1.6t_s.jpg', '차세대 스마트스트림 엔진을 적용하여 연비 효율이 우수하고, 안정감 있는 주행 성능을 제공합니다');
INSERT INTO engines (id, name, img_uri, contents) values(4, '디젤', 'https://www.hyundai.com/contents/spec/guide/nx_diesel2.0_s.jpg','높은 토크로 파워풀한 드라이빙이 가능하며, 차급대비 연비 효율이 우수합니다');

INSERT INTO gearbox (id, name, img_uri, contents) values(1, 'A/T', 'https://www.hyundai.com/contents/spec/guide/nx_smartstreamivt_s.jpg', '운전자가 직접 변속을 하지 않고 적정한 변속 시점에 자동으로 변속해주는 시스템으로, 변속 충격이 작고 부드러우면서 선형적인 가속 감각과 편안한 승차감이 특징입니다');
INSERT INTO gearbox (id, name, img_uri, contents) values(2, 'DCT','https://www.hyundai.com/contents/spec/guide/nx_7dct_d_s.jpg','두 개의 클러치를 사용해 연속적인 변속으로 다이내믹한 변속감을 제공하고, 빠른 변속이 가능하여 연비 효율이 우수합니다');

INSERT INTO driving (id, name, img_uri, contents) values(1, '2WD', 'https://www.hyundai.com/contents/spec/guide/nx_7dct_h_s.jpg','엔진에서 전달되는 동력이 전/후륜 바퀴 중 한쪽으로만 전달되어 차량을 움직이는 방식입니다.차체가 가벼워 연료 효율이 높습니다');
INSERT INTO driving (id, name, img_uri, contents) values(2, '4WD', 'https://www.hyundai.com/contents/spec/guide/4WD.JPG','전자식 상시 4륜 구동 시스템 입니다. 도로의 상황이나 주행 환경에 맞춰 전후륜 구동력을 자동배분하여 주행 안전성을 높여줍니다.');

INSERT INTO model (id, name, basic_info, price, trim_id, engine_displacement, fuel_efficiency)
values(1, '더 뉴 아반떼 자가용 가솔린 1.6 Smart A/T', '자가용 가솔린 1.6 A/T', 19970000, 1, '1,598cc', '15.3 km/ℓ');
INSERT INTO model (id, name, basic_info, price, trim_id, engine_displacement, fuel_efficiency)
values(2, '더 뉴 아반떼 자가용 LPG 1.6 Smart A/T', '자가용 LPG 1.6 A/T', 21380000, 1, '1,591cc', '10.5 km/ℓ');
INSERT INTO model (id, name, basic_info, price, trim_id, engine_displacement, fuel_efficiency)
values(3, '더 뉴 아반떼 자가용 가솔린 1.6 Modern A/T', '자가용 가솔린 1.6 A/T', 22980000, 2, '1,598cc', '14.8 km/ℓ');
INSERT INTO model (id, name, basic_info, price, trim_id)
values (4, '더 뉴 아반떼 자가용 LPG 1.6 Modern A/T', '자가용 LPG 1.6 A/T', 24390000, 2);
INSERT INTO model (id, name, basic_info, price, trim_id)
values (5, '더 뉴 아반떼 자가용 가솔린 1.6 Inspiration A/T', '자가용 가솔린 1.6 A/T', 27210000, 3);
INSERT INTO model (id, name, basic_info, price, trim_id)
values (6, '더 뉴 아반떼 자가용 LPG 1.6 Inspiration A/T', '자가용 LPG 1.6 A/T', 28490000, 3);

INSERT INTO model (id, name, basic_info, price, trim_id)
values(7, '투싼 디젤 Modern 2WD A/T', '디젤 2WD A/T', 28500000, 4);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(8, '투싼 디젤 Modern 4WD A/T', '디젤 4WD A/T', 30750000, 4);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(9, '투싼 1.6 가솔린 터보 Modern 2WD DCT', '1.6 가솔린 터보 2WD DCT', 26320000, 4);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(10, '투싼 1.6 가솔린 터보 Modern 4WD DCT', '1.6 가솔린 터보 4WD DCT', 28320000, 4);

INSERT INTO model (id, name, basic_info, price, trim_id)
values(11, '투싼 디젤 Premium 2WD A/T', '디젤 2WD A/T', 31440000, 5);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(12, '투싼 디젤 Premium 4WD A/T', '디젤 4WD A/T', 33690000, 5);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(13, '투싼 1.6 가솔린 터보 Premium 2WD DCT', '1.6 가솔린 터보 2WD DCT', 29260000, 5);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(14, '투싼 1.6 가솔린 터보 Premium 4WD DCT', '1.6 가솔린 터보 4WD DCT', 31260000, 5);

INSERT INTO model (id, name, basic_info, price, trim_id)
values(15, '투싼 디젤 Inspiration 2WD A/T', '디젤 2WD A/T', 35160000, 6);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(16, '투싼 디젤 Inspiration 4WD A/T', '디젤 4WD A/T', 37410000, 6);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(17, '투싼 1.6 가솔린 터보 Inspiration 2WD DCT', '1.6 가솔린 터보 2WD DCT', 32980000, 6);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(18, '투싼 1.6 가솔린 터보 Inspiration 4WD DCT', '1.6 가솔린 터보 4WD DCT', 34980000, 6);

-- INSERT INTO model_driving (driving_id, model_id) values (1, 7);
-- INSERT INTO model_driving (driving_id, model_id) values (2, 8);
-- INSERT INTO model_driving (driving_id, model_id) values (1, 9);
-- INSERT INTO model_driving (driving_id, model_id) values (2, 10);
-- INSERT INTO model_driving (driving_id, model_id) values (1, 11);
-- INSERT INTO model_driving (driving_id, model_id) values (2, 12);
-- INSERT INTO model_driving (driving_id, model_id) values (1, 13);
-- INSERT INTO model_driving (driving_id, model_id) values (2, 14);
-- INSERT INTO model_driving (driving_id, model_id) values (1, 15);
-- INSERT INTO model_driving (driving_id, model_id) values (2, 16);
-- INSERT INTO model_driving (driving_id, model_id) values (1, 17);
-- INSERT INTO model_driving (driving_id, model_id) values (2, 18);
--
-- INSERT INTO model_gearbox (gearbox_id, model_id) values (1, 7);
-- INSERT INTO model_gearbox (gearbox_id, model_id) values (1, 8);
-- INSERT INTO model_gearbox (gearbox_id, model_id) values (2, 9);
-- INSERT INTO model_gearbox (gearbox_id, model_id) values (2, 10);
-- INSERT INTO model_gearbox (gearbox_id, model_id) values (1, 11);
-- INSERT INTO model_gearbox (gearbox_id, model_id) values (1, 12);
-- INSERT INTO model_gearbox (gearbox_id, model_id) values (2, 13);
-- INSERT INTO model_gearbox (gearbox_id, model_id) values (2, 14);
-- INSERT INTO model_gearbox (gearbox_id, model_id) values (1, 15);
-- INSERT INTO model_gearbox (gearbox_id, model_id) values (1, 16);
-- INSERT INTO model_gearbox (gearbox_id, model_id) values (2, 17);
-- INSERT INTO model_gearbox (gearbox_id, model_id) values (2, 18);
--
-- INSERT INTO model_engine (engine_id, model_id) values (1, 1);
-- INSERT INTO model_engine (engine_id, model_id) values (2, 2);
-- INSERT INTO model_engine (engine_id, model_id) values(1, 3);
-- INSERT INTO model_engine (engine_id, model_id) values (2, 4);
-- INSERT INTO model_engine (engine_id, model_id) values (1, 5);
-- INSERT INTO model_engine (engine_id, model_id) values (2, 6);
-- -- # 가솔린 터보 - 3 디젤 - 4
-- INSERT INTO model_engine (engine_id, model_id) values (4, 7);
-- INSERT INTO model_engine (engine_id, model_id) values (4, 8);
-- INSERT INTO model_engine (engine_id, model_id) values (3, 9);
-- INSERT INTO model_engine (engine_id, model_id) values (3, 10);
-- INSERT INTO model_engine (engine_id, model_id) values (4, 11);
-- INSERT INTO model_engine (engine_id, model_id) values (4, 12);
-- INSERT INTO model_engine (engine_id, model_id) values (3, 13);
-- INSERT INTO model_engine (engine_id, model_id) values (3, 14);
-- INSERT INTO model_engine (engine_id, model_id) values (4, 15);
-- INSERT INTO model_engine (engine_id, model_id) values (4, 16);
-- INSERT INTO model_engine (engine_id, model_id) values (3, 17);
-- INSERT INTO model_engine (engine_id, model_id) values (3, 18);