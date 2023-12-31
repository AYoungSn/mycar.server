INSERT INTO car (id, name, type, code) values(1, '더 뉴 아반떼', 'SEDAN', 'CN01');
INSERT INTO car (id, name, type, code) values(2, '투싼', 'SUV', 'NX01');

INSERT INTO trim (id, car_id, name) values(1, 1, 'Smart');
INSERT INTO trim (id, car_id, name) values(2, 1, 'Modern');
INSERT INTO trim (id, car_id, name) values(3, 1, 'Inspiration');

INSERT INTO trim (id, car_id, name) values(4, 2, 'Modern');
INSERT INTO trim (id, car_id, name) values(5, 2, 'Premium');
INSERT INTO trim (id, car_id, name) values(6, 2, 'Inspiration');

-- INSERT INTO engines (id, name, img_uri, contents) values(1, '가솔린 1.6', 'https://www.hyundai.com/contents/spec/guide/cn_smartstreamg1.6_s.jpg', '차세대 스마트스트림 엔진을 적용하여 연비 효율이 우수하고, 안정감 있는 주행 성능을 제공합니다');
-- INSERT INTO engines (id, name, img_uri, contents) values(2, 'LPG 1.6', 'https://www.hyundai.com/contents/spec/guide/cn_lpg1.6_s.jpg', '높은 효율의 연비와 비교적 저렴한 연료비용으로 경제성이 우수합니다');
-- INSERT INTO engines (id, name, img_uri, contents) values(3, '1.6 가솔린 터보', 'https://www.hyundai.com/contents/spec/guide/nx_smartstreamg1.6t_s.jpg', '차세대 스마트스트림 엔진을 적용하여 연비 효율이 우수하고, 안정감 있는 주행 성능을 제공합니다');
-- INSERT INTO engines (id, name, img_uri, contents) values(4, '디젤', 'https://www.hyundai.com/contents/spec/guide/nx_diesel2.0_s.jpg','높은 토크로 파워풀한 드라이빙이 가능하며, 차급대비 연비 효율이 우수합니다');
--
-- INSERT INTO gearbox (id, name, img_uri, contents) values(1, 'A/T', 'https://www.hyundai.com/contents/spec/guide/nx_smartstreamivt_s.jpg', '운전자가 직접 변속을 하지 않고 적정한 변속 시점에 자동으로 변속해주는 시스템으로, 변속 충격이 작고 부드러우면서 선형적인 가속 감각과 편안한 승차감이 특징입니다');
-- INSERT INTO gearbox (id, name, img_uri, contents) values(2, 'DCT','https://www.hyundai.com/contents/spec/guide/nx_7dct_d_s.jpg','두 개의 클러치를 사용해 연속적인 변속으로 다이내믹한 변속감을 제공하고, 빠른 변속이 가능하여 연비 효율이 우수합니다');
--
-- INSERT INTO driving (id, name, img_uri, contents) values(1, '2WD', 'https://www.hyundai.com/contents/spec/guide/nx_7dct_h_s.jpg','엔진에서 전달되는 동력이 전/후륜 바퀴 중 한쪽으로만 전달되어 차량을 움직이는 방식입니다.차체가 가벼워 연료 효율이 높습니다');
-- INSERT INTO driving (id, name, img_uri, contents) values(2, '4WD', 'https://www.hyundai.com/contents/spec/guide/4WD.JPG','전자식 상시 4륜 구동 시스템 입니다. 도로의 상황이나 주행 환경에 맞춰 전후륜 구동력을 자동배분하여 주행 안전성을 높여줍니다.');

INSERT INTO model (id, name, basic_info, price, trim_id, engine_displacement, fuel_efficiency)
values(1, '더 뉴 아반떼 자가용 가솔린 1.6 Smart A/T', '자가용 가솔린 1.6 A/T', 19750000, 1, '1,598cc', '15.3 km/ℓ');
INSERT INTO model (id, name, basic_info, price, trim_id, engine_displacement, fuel_efficiency)
values(2, '더 뉴 아반떼 자가용 LPG 1.6 Smart A/T', '자가용 LPG 1.6 A/T', 21150000, 1, '1,591cc', '10.5 km/ℓ');
INSERT INTO model (id, name, basic_info, price, trim_id, engine_displacement, fuel_efficiency)
values(3, '더 뉴 아반떼 자가용 가솔린 1.6 Modern A/T', '자가용 가솔린 1.6 A/T', 22730000, 2, '1,598cc', '14.8 km/ℓ');
INSERT INTO model (id, name, basic_info, price, trim_id)
values (4, '더 뉴 아반떼 자가용 LPG 1.6 Modern A/T', '자가용 LPG 1.6 A/T', 24120000, 2);
INSERT INTO model (id, name, basic_info, price, trim_id)
values (5, '더 뉴 아반떼 자가용 가솔린 1.6 Inspiration A/T', '자가용 가솔린 1.6 A/T', 26910000, 3);
INSERT INTO model (id, name, basic_info, price, trim_id)
values (6, '더 뉴 아반떼 자가용 LPG 1.6 Inspiration A/T', '자가용 LPG 1.6 A/T', 28180000, 3);

INSERT INTO model (id, name, basic_info, price, trim_id)
values(7, '투싼 디젤 Modern 2WD A/T', '디젤 2WD A/T', 28190000, 4);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(8, '투싼 디젤 Modern 4WD A/T', '디젤 4WD A/T', 30420000, 4);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(9, '투싼 1.6 가솔린 터보 Modern 2WD DCT', '1.6 가솔린 터보 2WD DCT', 26030000, 4);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(10, '투싼 1.6 가솔린 터보 Modern 4WD DCT', '1.6 가솔린 터보 4WD DCT', 28010000, 4);

INSERT INTO model (id, name, basic_info, price, trim_id)
values(11, '투싼 디젤 Premium 2WD A/T', '디젤 2WD A/T', 31100000, 5);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(12, '투싼 디젤 Premium 4WD A/T', '디젤 4WD A/T', 33330000, 5);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(13, '투싼 1.6 가솔린 터보 Premium 2WD DCT', '1.6 가솔린 터보 2WD DCT', 28940000, 5);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(14, '투싼 1.6 가솔린 터보 Premium 4WD DCT', '1.6 가솔린 터보 4WD DCT', 30920000, 5);

INSERT INTO model (id, name, basic_info, price, trim_id)
values(15, '투싼 디젤 Inspiration 2WD A/T', '디젤 2WD A/T', 34780000, 6);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(16, '투싼 디젤 Inspiration 4WD A/T', '디젤 4WD A/T', 37010000, 6);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(17, '투싼 1.6 가솔린 터보 Inspiration 2WD DCT', '1.6 가솔린 터보 2WD DCT', 32620000, 6);
INSERT INTO model (id, name, basic_info, price, trim_id)
values(18, '투싼 1.6 가솔린 터보 Inspiration 4WD DCT', '1.6 가솔린 터보 4WD DCT', 34600000, 6);

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

insert into exterior(id, name, img_uri) values(1, '실키 브론즈 메탈릭', 'https://www.hyundai.com/contents/vr360/NX05/exterior/B6S/colorchip-exterior.png');
insert into exterior(id, name, img_uri) values(2, '쉬머링 실버 메탈릭', 'https://www.hyundai.com/contents/vr360/NX05/exterior/R2T/colorchip-exterior.png');
insert into exterior(id, name, img_uri) values(3, '크리미 화이트 펄', 'https://www.hyundai.com/contents/vr360/NX05/exterior/TW3/colorchip-exterior.png');
insert into exterior(id, name, img_uri) values(4, '아마존 그레이 메탈릭', 'https://www.hyundai.com/contents/vr360/NX05/exterior/A5G/colorchip-exterior.png');
insert into exterior(id, name, img_uri) values(5, '티탄 그레이 메탈릭', 'https://www.hyundai.com/contents/vr360/NX05/exterior/R4G/colorchip-exterior.png');
insert into exterior(id, name, img_uri) values(6, '오션 인디고 펄', 'https://www.hyundai.com/contents/vr360/NX05/exterior/PS8/colorchip-exterior.png');
insert into exterior(id, name, img_uri) values(7, '팬텀 블랙 펄', 'https://www.hyundai.com/contents/vr360/NX05/exterior/TCM/colorchip-exterior.png');
insert into exterior(id, name, img_uri, price) values(8, '티타늄 그레이 매트', 'https://www.hyundai.com/contents/vr360/NX05/exterior/Y3G/colorchip-exterior.png', 300000);
-- avante
insert into exterior(id, name, img_uri) values(9, '아마존 그레이 메탈릭', 'https://www.hyundai.com/contents/vr360/CN12/exterior/A5G/colorchip-exterior.png');
insert into exterior(id, name, img_uri) values(10, '에코트로닉 그레이펄', 'https://www.hyundai.com/contents/vr360/CN12/exterior/PE2/colorchip-exterior.png');
insert into exterior(id, name, img_uri) values(11, '플루이드 그레이 메탈릭', 'https://www.hyundai.com/contents/vr360/CN12/exterior/M6T/colorchip-exterior.png');
insert into exterior(id, name, img_uri) values(12, '메타블루펄', 'https://www.hyundai.com/contents/vr360/CN12/exterior/PM2/colorchip-exterior.png');
insert into exterior(id, name, img_uri) values(13, '인텐스 블루 펄', 'https://www.hyundai.com/contents/vr360/CN12/exterior/YP5/colorchip-exterior.png');
insert into exterior(id, name, img_uri) values(14, '아틀라스 화이트', 'https://www.hyundai.com/contents/vr360/CN12/exterior/SAW/colorchip-exterior.png');
insert into exterior(id, name, img_uri) values(15, '얼티메이트 레드 메탈릭', 'https://www.hyundai.com/contents/vr360/CN12/exterior/R2P/colorchip-exterior.png');
insert into exterior(id, name, img_uri) values(16, '어비스블랙펄', 'https://www.hyundai.com/contents/vr360/CN12/exterior/A2B/colorchip-exterior.png');
insert into exterior(id, name, img_uri) values(17, '사이버 그레이 메탈릭', 'https://www.hyundai.com/contents/vr360/CN12/exterior/C5G/colorchip-exterior.png');

insert into interior(id, name, img_uri) values(1, '블랙모노톤', 'https://www.hyundai.com/contents/vr360/NX05/interior/I34/colorchip-interior.png');
insert into interior(id, name, img_uri) values(2, '블랙 모노톤(가죽 시트)', 'https://www.hyundai.com/contents/vr360/NX05/interior/I35/colorchip-interior.png');
insert into interior(id, name, img_uri) values(3, '블랙/그레이 투톤(그레이 가죽시트)', 'https://www.hyundai.com/contents/vr360/NX05/interior/I36/colorchip-interior.png');
insert into interior(id, name, img_uri) values(4, '네이비 원톤(인디고 모노톤)', 'https://www.hyundai.com/contents/vr360/NX05/interior/I37/colorchip-interior.png');
insert into interior(id, name, img_uri) values(5, '블랙모노톤(레드스티치)', 'https://www.hyundai.com/contents/vr360/NX05/interior/I38/colorchip-interior.png');
insert into interior(id, name, img_uri) values(6, '블랙 / 브라운 투톤(브라운 가죽시트)', 'https://www.hyundai.com/contents/vr360/NX05/interior/PRF/colorchip-interior.png');
-- avante
insert into interior(id, name, img_uri) values(7, '블랙모노톤', 'https://www.hyundai.com/contents/vr360/CN12/interior/NNB/colorchip-interior.png');
insert into interior(id, name, img_uri) values(8, '세이지그린', 'https://www.hyundai.com/contents/vr360/CN12/interior/SSS/colorchip-interior.png');
insert into interior(id, name, img_uri) values(9, '캐쉬미어 베이지', 'https://www.hyundai.com/contents/vr360/CN12/interior/VHC/colorchip-interior.png');

-- avante - 1
-- smart - 1
insert into color_combi(id, trim_id, exterior_id, interior_id) values(1, 1, 9, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(2, 1, 10, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(3, 1, 11, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(4, 1, 12, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(5, 1, 13, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(6, 1, 14, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(7, 1, 15, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(8, 1, 16, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(9, 1, 17, 7);

-- modern - 2
insert into color_combi(id, trim_id, exterior_id, interior_id) values(10, 2, 9, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(11, 2, 10, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(12, 2, 11, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(13, 2, 12, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(14, 2, 13, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(15, 2, 14, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(16, 2, 15, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(17, 2, 16, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(18, 2, 17, 7);

insert into color_combi(id, trim_id, exterior_id, interior_id) values(19, 2, 9, 8);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(20, 2, 10, 8);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(21, 2, 11, 8);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(22, 2, 14, 8);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(23, 2, 16, 8);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(24, 2, 17, 8);
-- inspiration - 3
insert into color_combi(id, trim_id, exterior_id, interior_id) values(25, 3, 9, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(26, 3, 10, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(27, 3, 11, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(28, 3, 12, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(29, 3, 13, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(30, 3, 14, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(31, 3, 15, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(32, 3, 16, 7);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(33, 3, 17, 7);

insert into color_combi(id, trim_id, exterior_id, interior_id) values(34, 3, 9, 8);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(35, 3, 10, 8);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(36, 3, 11, 8);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(37, 3, 14, 8);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(38, 3, 16, 8);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(39, 3, 17, 8);

insert into color_combi(id, trim_id, exterior_id, interior_id) values(40, 3, 9, 9);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(41, 3, 10, 9);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(42, 3, 11, 9);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(43, 3, 12, 9);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(44, 3, 13, 9);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(45, 3, 14, 9);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(46, 3, 16, 9);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(47, 3, 17, 9);
-- tuscon - 2
-- Modern - 4
insert into color_combi(id, trim_id, exterior_id, interior_id) values(48, 4, 1, 1);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(49, 4, 2, 1);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(50, 4, 3, 1);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(51, 4, 4, 1);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(52, 4, 5, 1);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(53, 4, 6, 1);
insert into color_combi(id, trim_id, exterior_id, interior_id) values(54, 4, 7, 1);

-- premium - 5
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 1, 1);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 2, 1);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 3, 1);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 4, 1);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 5, 1);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 6, 1);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 7, 1);

insert into color_combi(trim_id, exterior_id, interior_id) values(5, 1, 2);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 2, 2);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 3, 2);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 4, 2);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 5, 2);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 6, 2);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 7, 2);

insert into color_combi(trim_id, exterior_id, interior_id) values(5, 1, 3);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 2, 3);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 3, 3);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 4, 3);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 5, 3);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 6, 3);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 7, 3);

insert into color_combi(trim_id, exterior_id, interior_id) values(5, 3, 5);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 5, 5);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 7, 5);
insert into color_combi(trim_id, exterior_id, interior_id) values(5, 8, 5);
-- inspiration - 6
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 1, 2);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 2, 2);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 3, 2);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 4, 2);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 5, 2);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 6, 2);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 7, 2);

insert into color_combi(trim_id, exterior_id, interior_id) values(6, 1, 3);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 2, 3);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 3, 3);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 4, 3);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 5, 3);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 6, 3);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 7, 3);

insert into color_combi(trim_id, exterior_id, interior_id) values(6, 2, 4);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 3, 4);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 5, 4);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 6, 4);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 7, 4);

insert into color_combi(trim_id, exterior_id, interior_id) values(6, 3, 5);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 5, 5);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 7, 5);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 8, 5);

insert into color_combi(trim_id, exterior_id, interior_id) values(6, 1, 6);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 2, 6);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 3, 6);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 4, 6);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 5, 6);
insert into color_combi(trim_id, exterior_id, interior_id) values(6, 7, 6);

insert into options(id, category, name, price) values(1, 'DETAIL', '파노라마 선루프 + 루프랙 + LED 실내등(맵램프,룸램프)', 1240000);
insert into options(id, category, name, price) values(2, 'DETAIL', '하이패스 + ECM 룸미러', 250000);
insert into options(id, category, name, price) values(3, 'DETAIL', '멀티미디어 내비 Ⅰ', 1290000);
insert into options(id, category, name, price) values(4, 'DETAIL', '인테리어 디자인 Ⅰ', 250000);
insert into options(id, category, name, price) values(5, 'DETAIL', '컨비니언스', 540000);
insert into options(id, category, name, price) values(6, 'DETAIL', '익스테리어 Ⅰ', 690000);
insert into options(id, category, name, price) values(7, 'DETAIL', '익스테리어 Ⅰ 플러스', 940000);
insert into options(id, category, name, price) values(8, 'DETAIL', '현대 스마트센스', 890000);
insert into options(id, category, name, price) values(9, 'DETAIL', '빌트인 캠(보조배터리 포함)', 640000); -- 투싼
insert into options(id, category, name, price) values(10, 'DETAIL', '파노라마 선루프 + LED 실내등(맵램프,룸램프)', 1140000);
insert into options(id, category, name, price) values(11, 'DETAIL', '인테리어 디자인 Ⅱ', 590000);
insert into options(id, category, name, price) values(12, 'DETAIL', '컴포트', 1140000);
insert into options(id, category, name, price) values(13, 'DETAIL', '익스테리어 Ⅱ', 690000);
insert into options(id, category, name, price) values(14, 'DETAIL', '플래티넘 Ⅰ', 2230000); -- 가솔린
insert into options(id, category, name, price) values(15, 'DETAIL', '플래티넘 Ⅱ', 2520000); -- 디젤
insert into options(id, category, name, price) values(16, 'DETAIL', '파노라마 선루프', 1090000);
insert into options(id, category, name, price) values(17, 'DETAIL', '플래티넘 Ⅲ', 1480000); -- 가솔린
insert into options(id, category, name, price) values(18, 'DETAIL', '플래티넘 Ⅳ', 1780000); -- 디젤
insert into options(id, category, name, price) values(19, 'DETAIL', '컨비니언스 I', 690000);
insert into options(id, category, name, price) values(20, 'DETAIL', '인포테인먼트 내비', 790000);
insert into options(id, category, name, price) values(21, 'DETAIL', '현대스마트센스 III', 690000);
insert into options(id, category, name, price) values(22, 'DETAIL', '17인치 알로이 휠 & 타이어 I', 490000); --smart
insert into options(id, category, name, price) values(23, 'DETAIL', '선루프', 450000);
insert into options(id, category, name, price) values(24, 'DETAIL', '파킹 어시스트 플러스', 1290000);
insert into options(id, category, name, price) values(25, 'DETAIL', '현대스마트센스 Ⅰ', 940000);
insert into options(id, category, name, price) values(26, 'DETAIL', '익스테리어 디자인', 450000);
insert into options(id, category, name, price) values(27, 'DETAIL', '컴포트 I', 1140000);
insert into options(id, category, name, price) values(28, 'DETAIL', '17인치 알로이 휠 & 타이어 Ⅱ', 300000);
insert into options(id, category, name, price) values(29, 'DETAIL', '세이지그린 인테리어 컬러', 150000);
insert into options(id, category, name, price) values(30, 'DETAIL', '빌트인 캠(보조배터리 포함)', 690000); -- 아반떼
insert into options(id, category, name, price) values(31, 'DETAIL', '컴포트 Ⅱ', 990000);
insert into options(id, category, name, price) values(32, 'DETAIL', '어드벤처패키지', 790000);

insert into options(id, category, name, price) values(33, 'HGA', 'LED 라이팅 패키지', 320000);
insert into options(id, category, name, price) values(34, 'HGA', '사이드 스텝', 340000);
insert into options(id, category, name, price) values(35, 'HGA', '어드벤처 전용 사이드 스텝', 340000);
insert into options(id, category, name, price) values(36, 'HGA', '러기지 패키지', 120000);
insert into options(id, category, name, price) values(37, 'HGA', '프로텍션 매트 패키지', 230000);
insert into options(id, category, name, price) values(38, 'HGA', '빌트인 공기청정기', 400000);
insert into options(id, category, name, price) values(39, 'HGA', '적외선 무릎 워머', 300000);

insert into options(id, category, name, price) values(40, 'NPF', '19인치 매트 블랙 경량휠', 1150000);
insert into options(id, category, name, price) values(41, 'NPF', '모노블록 브레이크+19인치 매트 블랙 경량휠 패키지', 2250000);

-- insert into options(id, category, name, price) values(42, 'DETAIL', '어드벤처패키지', 790000);

insert into option_interior(interior_id, option_id) values (8, 29);
insert into option_interior(interior_id, option_id) values (3, 11);
insert into option_interior(interior_id, option_id) values (2, 11);

insert into model_option(model_id, option_id) values(1, 19);
insert into model_option(model_id, option_id) values(1, 20);
insert into model_option(model_id, option_id) values(1, 2);
insert into model_option(model_id, option_id) values(1, 21);
insert into model_option(model_id, option_id) values(1, 22);

insert into model_option(model_id, option_id) values(2, 19);
insert into model_option(model_id, option_id) values(2, 20);
insert into model_option(model_id, option_id) values(2, 2);
insert into model_option(model_id, option_id) values(2, 21);
insert into model_option(model_id, option_id) values(2, 22);

insert into model_option(model_id, option_id) values(3, 23);
insert into model_option(model_id, option_id) values(3, 2);
insert into model_option(model_id, option_id) values(3, 24);
insert into model_option(model_id, option_id) values(3, 25);
insert into model_option(model_id, option_id) values(3, 26);
insert into model_option(model_id, option_id) values(3, 27);
insert into model_option(model_id, option_id) values(3, 28);
insert into model_option(model_id, option_id) values(3, 29);

insert into model_option(model_id, option_id) values(4, 23);
insert into model_option(model_id, option_id) values(4, 2);
insert into model_option(model_id, option_id) values(4, 24);
insert into model_option(model_id, option_id) values(4, 25);
insert into model_option(model_id, option_id) values(4, 26);
insert into model_option(model_id, option_id) values(4, 28);
insert into model_option(model_id, option_id) values(4, 29);
insert into model_option(model_id, option_id) values(4, 31);

insert into model_option(model_id, option_id) values(5, 23);
insert into model_option(model_id, option_id) values(5, 30);
insert into model_option(model_id, option_id) values(5, 28);
insert into model_option(model_id, option_id) values(5, 29);

insert into model_option(model_id, option_id) values(6, 23);
insert into model_option(model_id, option_id) values(6, 28);
insert into model_option(model_id, option_id) values(6, 29);

-- insert into model_option(model_id, option_id) values(7, 23);
-- insert into model_option(model_id, option_id) values(4, 2);
-- insert into model_option(model_id, option_id) values(4, 24);
-- insert into model_option(model_id, option_id) values(4, 25);
-- insert into model_option(model_id, option_id) values(4, 26);
-- insert into model_option(model_id, option_id) values(4, 28);
-- insert into model_option(model_id, option_id) values(4, 29);
-- insert into model_option(model_id, option_id) values(4, 31);
-- tuscon modern
insert into model_option(model_id, option_id) values(7, 1);
insert into model_option(model_id, option_id) values(7, 2);
insert into model_option(model_id, option_id) values(7, 3);
insert into model_option(model_id, option_id) values(7, 4);
insert into model_option(model_id, option_id) values(7, 5);
insert into model_option(model_id, option_id) values(7, 6);
insert into model_option(model_id, option_id) values(7, 7);
insert into model_option(model_id, option_id) values(7, 8);
-- hga
insert into model_option(model_id, option_id) values(7, 34);
insert into model_option(model_id, option_id) values(7, 36);
insert into model_option(model_id, option_id) values(7, 37);
insert into model_option(model_id, option_id) values(7, 39);

insert into model_option(model_id, option_id) values(8, 1);
insert into model_option(model_id, option_id) values(8, 2);
insert into model_option(model_id, option_id) values(8, 3);
insert into model_option(model_id, option_id) values(8, 4);
insert into model_option(model_id, option_id) values(8, 5);
insert into model_option(model_id, option_id) values(8, 6);
insert into model_option(model_id, option_id) values(8, 7);
insert into model_option(model_id, option_id) values(8, 8);

insert into model_option(model_id, option_id) values(8, 34);
insert into model_option(model_id, option_id) values(8, 36);
insert into model_option(model_id, option_id) values(8, 37);
insert into model_option(model_id, option_id) values(8, 39);

insert into model_option(model_id, option_id) values(9, 1);
insert into model_option(model_id, option_id) values(9, 2);
insert into model_option(model_id, option_id) values(9, 3);
insert into model_option(model_id, option_id) values(9, 4);
insert into model_option(model_id, option_id) values(9, 5);
insert into model_option(model_id, option_id) values(9, 6);
insert into model_option(model_id, option_id) values(9, 7);
insert into model_option(model_id, option_id) values(9, 8);

insert into model_option(model_id, option_id) values(9, 34);
insert into model_option(model_id, option_id) values(9, 36);
insert into model_option(model_id, option_id) values(9, 37);
insert into model_option(model_id, option_id) values(9, 39);

insert into model_option(model_id, option_id) values(10, 1);
insert into model_option(model_id, option_id) values(10, 2);
insert into model_option(model_id, option_id) values(10, 3);
insert into model_option(model_id, option_id) values(10, 4);
insert into model_option(model_id, option_id) values(10, 5);
insert into model_option(model_id, option_id) values(10, 6);
insert into model_option(model_id, option_id) values(10, 7);
insert into model_option(model_id, option_id) values(10, 8);

insert into model_option(model_id, option_id) values(10, 34);
insert into model_option(model_id, option_id) values(10, 36);
insert into model_option(model_id, option_id) values(10, 37);
insert into model_option(model_id, option_id) values(10, 39);
-- tuscon premium
insert into model_option(model_id, option_id) values(11, 8);
insert into model_option(model_id, option_id) values(11, 9);
insert into model_option(model_id, option_id) values(11, 10);
insert into model_option(model_id, option_id) values(11, 11);
insert into model_option(model_id, option_id) values(11, 12);
insert into model_option(model_id, option_id) values(11, 13);
insert into model_option(model_id, option_id) values(11, 15);

insert into model_option(model_id, option_id) values(11, 34);
insert into model_option(model_id, option_id) values(11, 36);
insert into model_option(model_id, option_id) values(11, 37);
insert into model_option(model_id, option_id) values(11, 38);
insert into model_option(model_id, option_id) values(11, 39);

insert into model_option(model_id, option_id) values(12, 8);
insert into model_option(model_id, option_id) values(12, 9);
insert into model_option(model_id, option_id) values(12, 10);
insert into model_option(model_id, option_id) values(12, 11);
insert into model_option(model_id, option_id) values(12, 12);
insert into model_option(model_id, option_id) values(12, 13);
insert into model_option(model_id, option_id) values(12, 15);

insert into model_option(model_id, option_id) values(12, 34);
insert into model_option(model_id, option_id) values(12, 36);
insert into model_option(model_id, option_id) values(12, 37);
insert into model_option(model_id, option_id) values(12, 38);
insert into model_option(model_id, option_id) values(12, 39);

insert into model_option(model_id, option_id) values(13, 8);
insert into model_option(model_id, option_id) values(13, 9);
insert into model_option(model_id, option_id) values(13, 10);
insert into model_option(model_id, option_id) values(13, 11);
insert into model_option(model_id, option_id) values(13, 12);
insert into model_option(model_id, option_id) values(13, 13);
insert into model_option(model_id, option_id) values(13, 14);

insert into model_option(model_id, option_id) values(13, 34);
insert into model_option(model_id, option_id) values(13, 36);
insert into model_option(model_id, option_id) values(13, 37);
insert into model_option(model_id, option_id) values(13, 38);
insert into model_option(model_id, option_id) values(13, 39);

insert into model_option(model_id, option_id) values(14, 8);
insert into model_option(model_id, option_id) values(14, 9);
insert into model_option(model_id, option_id) values(14, 10);
insert into model_option(model_id, option_id) values(14, 11);
insert into model_option(model_id, option_id) values(14, 12);
insert into model_option(model_id, option_id) values(14, 13);
insert into model_option(model_id, option_id) values(14, 14);

insert into model_option(model_id, option_id) values(14, 34);
insert into model_option(model_id, option_id) values(14, 36);
insert into model_option(model_id, option_id) values(14, 37);
insert into model_option(model_id, option_id) values(14, 38);
insert into model_option(model_id, option_id) values(14, 39);

-- tuscon inspiration

insert into model_option(model_id, option_id) values(15, 9);
insert into model_option(model_id, option_id) values(15, 16);
insert into model_option(model_id, option_id) values(15, 18);

insert into model_option(model_id, option_id) values(15, 33);
insert into model_option(model_id, option_id) values(15, 34);
insert into model_option(model_id, option_id) values(15, 36);
insert into model_option(model_id, option_id) values(15, 37);
insert into model_option(model_id, option_id) values(15, 38);
insert into model_option(model_id, option_id) values(15, 39);

insert into model_option(model_id, option_id) values(15, 40);
insert into model_option(model_id, option_id) values(15, 41);

insert into model_option(model_id, option_id) values(16, 9);
insert into model_option(model_id, option_id) values(16, 16);
insert into model_option(model_id, option_id) values(16, 18);

insert into model_option(model_id, option_id) values(16, 33);
insert into model_option(model_id, option_id) values(16, 34);
insert into model_option(model_id, option_id) values(16, 36);
insert into model_option(model_id, option_id) values(16, 37);
insert into model_option(model_id, option_id) values(16, 38);
insert into model_option(model_id, option_id) values(16, 39);

insert into model_option(model_id, option_id) values(16, 40);
insert into model_option(model_id, option_id) values(16, 41);

insert into model_option(model_id, option_id) values(17, 9);
insert into model_option(model_id, option_id) values(17, 16);
insert into model_option(model_id, option_id) values(17, 17);

insert into model_option(model_id, option_id) values(17, 33);
insert into model_option(model_id, option_id) values(17, 34);
insert into model_option(model_id, option_id) values(17, 36);
insert into model_option(model_id, option_id) values(17, 37);
insert into model_option(model_id, option_id) values(17, 38);
insert into model_option(model_id, option_id) values(17, 39);

insert into model_option(model_id, option_id) values(17, 40);
insert into model_option(model_id, option_id) values(17, 41);

insert into model_option(model_id, option_id) values(18, 9);
insert into model_option(model_id, option_id) values(18, 16);
insert into model_option(model_id, option_id) values(18, 17);

insert into model_option(model_id, option_id) values(18, 33);
insert into model_option(model_id, option_id) values(18, 34);
insert into model_option(model_id, option_id) values(18, 36);
insert into model_option(model_id, option_id) values(18, 37);
insert into model_option(model_id, option_id) values(18, 38);
insert into model_option(model_id, option_id) values(18, 39);

insert into model_option(model_id, option_id) values(18, 40);
insert into model_option(model_id, option_id) values(18, 41);
-- dependency_id 선택해야 option_id 선택 가능
insert into dependency_option(option_id, dependency_id) values(20, 19);
insert into dependency_option(option_id, dependency_id) values(35, 32);
insert into dependency_option(option_id, dependency_id) values(33, 1);
insert into dependency_option(option_id, dependency_id) values(33, 10);
insert into dependency_option(option_id, dependency_id) values(40, 7);
insert into dependency_option(option_id, dependency_id) values(41, 7);
insert into dependency_option(option_id, dependency_id) values(40, 13);
insert into dependency_option(option_id, dependency_id) values(41, 13);

insert into del_option(option_id, del_id) values(32, 40);
insert into del_option(option_id, del_id) values(32, 41);
insert into del_option(option_id, del_id) values(32, 34);

insert into duplicate_option(option_id, duplicate_id) values(40, 41);
insert into duplicate_option(option_id, duplicate_id) values(41, 40);
insert into duplicate_option(option_id, duplicate_id) values(2, 3);
insert into duplicate_option(option_id, duplicate_id) values(3, 2);
insert into duplicate_option(option_id, duplicate_id) values(6, 7);
insert into duplicate_option(option_id, duplicate_id) values(7, 6);
