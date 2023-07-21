INSERT INTO car (id, name, type, code) values(1, '더 뉴 아반떼', 'SEDAN', 'AT01');
INSERT INTO car (id, name, type, code) values(2, '투싼', 'SUV', 'TC01');

INSERT INTO trim (id, car_code, name, code) values(1, 'AT01', 'Smart', 'ATS');
INSERT INTO trim (id, car_code, name, code) values(2, 'AT01', 'Modern', 'ATM');
INSERT INTO trim (id, car_code, name, code) values(3, 'AT01', 'Inspiration', 'ATI');

INSERT INTO trim (id, car_code, name, code) values(4, 'TC01', 'Modern', 'TCM');
INSERT INTO trim (id, car_code, name, code) values(5, 'TC01', 'Premium', 'TCP');
INSERT INTO trim (id, car_code, name, code) values(6, 'TC01', 'Inspiration', 'TCI');

INSERT INTO model (id, name, basic_info, price, trim_code, engine_displacement, fuel_efficiency)
values(1, '더 뉴 아반떼 자가용 가솔린 1.6 Smart A/T', '자가용 가솔린 1.6 A/T', 19750000, 'ATS', '1,598cc', '15.3 km/ℓ');
INSERT INTO model (id, name, basic_info, price, trim_code, engine_displacement, fuel_efficiency)
values(2, '더 뉴 아반떼 자가용 LPG 1.6 Smart A/T', '자가용 LPG 1.6 A/T', 21150000, 'ATS', '1,591cc', '10.5 km/ℓ');
INSERT INTO model (id, name, basic_info, price, trim_code, engine_displacement, fuel_efficiency)
values(3, '더 뉴 아반떼 자가용 가솔린 1.6 Modern A/T', '자가용 가솔린 1.6 A/T', 22730000, 'ATM', '1,598cc', '14.8 km/ℓ');
INSERT INTO model (id, name, basic_info, price, trim_code)
values (4, '더 뉴 아반떼 자가용 LPG 1.6 Modern A/T', '자가용 LPG 1.6 A/T', 24120000, 'ATM');
INSERT INTO model (id, name, basic_info, price, trim_code)
values (5, '더 뉴 아반떼 자가용 가솔린 1.6 Inspiration A/T', '자가용 가솔린 1.6 A/T', 26910000, 'ATI');
INSERT INTO model (id, name, basic_info, price, trim_code)
values (6, '더 뉴 아반떼 자가용 LPG 1.6 Inspiration A/T', '자가용 LPG 1.6 A/T', 28180000, 'ATI');

INSERT INTO model (id, name, basic_info, price, trim_code)
values(7, '투싼 디젤 Modern 2WD A/T', '디젤 2WD A/T', 28190000, 'TCM');
INSERT INTO model (id, name, basic_info, price, trim_code)
values(8, '투싼 디젤 Modern 4WD A/T', '디젤 4WD A/T', 30420000, 'TCM');
INSERT INTO model (id, name, basic_info, price, trim_code)
values(9, '투싼 1.6 가솔린 터보 Modern 2WD DCT', '1.6 가솔린 터보 2WD DCT', 26030000, 'TCM');
INSERT INTO model (id, name, basic_info, price, trim_code)
values(10, '투싼 1.6 가솔린 터보 Modern 4WD DCT', '1.6 가솔린 터보 4WD DCT', 28010000, 'TCM');

INSERT INTO model (id, name, basic_info, price, trim_code)
values(11, '투싼 디젤 Premium 2WD A/T', '디젤 2WD A/T', 31100000, 'TCP');
INSERT INTO model (id, name, basic_info, price, trim_code)
values(12, '투싼 디젤 Premium 4WD A/T', '디젤 4WD A/T', 33330000, 'TCP');
INSERT INTO model (id, name, basic_info, price, trim_code)
values(13, '투싼 1.6 가솔린 터보 Premium 2WD DCT', '1.6 가솔린 터보 2WD DCT', 28940000, 'TCP');
INSERT INTO model (id, name, basic_info, price, trim_code)
values(14, '투싼 1.6 가솔린 터보 Premium 4WD DCT', '1.6 가솔린 터보 4WD DCT', 30920000, 'TCP');

INSERT INTO model (id, name, basic_info, price, trim_code)
values(15, '투싼 디젤 Inspiration 2WD A/T', '디젤 2WD A/T', 34780000, 'TCI');
INSERT INTO model (id, name, basic_info, price, trim_code)
values(16, '투싼 디젤 Inspiration 4WD A/T', '디젤 4WD A/T', 37010000, 'TCI');
INSERT INTO model (id, name, basic_info, price, trim_code)
values(17, '투싼 1.6 가솔린 터보 Inspiration 2WD DCT', '1.6 가솔린 터보 2WD DCT', 32620000, 'TCI');
INSERT INTO model (id, name, basic_info, price, trim_code)
values(18, '투싼 1.6 가솔린 터보 Inspiration 4WD DCT', '1.6 가솔린 터보 4WD DCT', 34600000, 'TCI');

insert into exterior(id, name, img_uri, code) values(1, '실키 브론즈 메탈릭', 'https://www.hyundai.com/contents/vr360/NX05/exterior/B6S/colorchip-exterior.png', 'B6S');
insert into exterior(id, name, img_uri, code) values(2, '쉬머링 실버 메탈릭', 'https://www.hyundai.com/contents/vr360/NX05/exterior/R2T/colorchip-exterior.png', 'R2T');
insert into exterior(id, name, img_uri, code) values(3, '크리미 화이트 펄', 'https://www.hyundai.com/contents/vr360/NX05/exterior/TW3/colorchip-exterior.png', 'TW3');
insert into exterior(id, name, img_uri, code) values(4, '아마존 그레이 메탈릭', 'https://www.hyundai.com/contents/vr360/NX05/exterior/A5G/colorchip-exterior.png', 'A5G');
insert into exterior(id, name, img_uri, code) values(5, '티탄 그레이 메탈릭', 'https://www.hyundai.com/contents/vr360/NX05/exterior/R4G/colorchip-exterior.png', 'R4G');
insert into exterior(id, name, img_uri, code) values(6, '오션 인디고 펄', 'https://www.hyundai.com/contents/vr360/NX05/exterior/PS8/colorchip-exterior.png', 'PS8');
insert into exterior(id, name, img_uri, code) values(7, '팬텀 블랙 펄', 'https://www.hyundai.com/contents/vr360/NX05/exterior/TCM/colorchip-exterior.png', 'TCM');
insert into exterior(id, name, img_uri, price, code) values(8, '티타늄 그레이 매트', 'https://www.hyundai.com/contents/vr360/NX05/exterior/Y3G/colorchip-exterior.png', 300000, 'Y3G');
-- avante
insert into exterior(id, name, img_uri, code) values(9, '아마존 그레이 메탈릭', 'https://www.hyundai.com/contents/vr360/CN12/exterior/A5G/colorchip-exterior.png', 'A6G');
insert into exterior(id, name, img_uri, code) values(10, '에코트로닉 그레이펄', 'https://www.hyundai.com/contents/vr360/CN12/exterior/PE2/colorchip-exterior.png', 'PE2');
insert into exterior(id, name, img_uri, code) values(11, '플루이드 그레이 메탈릭', 'https://www.hyundai.com/contents/vr360/CN12/exterior/M6T/colorchip-exterior.png', 'M6T');
insert into exterior(id, name, img_uri, code) values(12, '메타블루펄', 'https://www.hyundai.com/contents/vr360/CN12/exterior/PM2/colorchip-exterior.png', 'PM2');
insert into exterior(id, name, img_uri, code) values(13, '인텐스 블루 펄', 'https://www.hyundai.com/contents/vr360/CN12/exterior/YP5/colorchip-exterior.png', 'YP5');
insert into exterior(id, name, img_uri, code) values(14, '아틀라스 화이트', 'https://www.hyundai.com/contents/vr360/CN12/exterior/SAW/colorchip-exterior.png', 'SAW');
insert into exterior(id, name, img_uri, code) values(15, '얼티메이트 레드 메탈릭', 'https://www.hyundai.com/contents/vr360/CN12/exterior/R2P/colorchip-exterior.png', 'R2P');
insert into exterior(id, name, img_uri, code) values(16, '어비스블랙펄', 'https://www.hyundai.com/contents/vr360/CN12/exterior/A2B/colorchip-exterior.png', 'A2B');
insert into exterior(id, name, img_uri, code) values(17, '사이버 그레이 메탈릭', 'https://www.hyundai.com/contents/vr360/CN12/exterior/C5G/colorchip-exterior.png', 'C5G');

insert into interior(id, name, img_uri, code) values(1, '블랙모노톤', 'https://www.hyundai.com/contents/vr360/NX05/interior/I34/colorchip-interior.png', 'I34');
insert into interior(id, name, img_uri, code) values(2, '블랙 모노톤(가죽 시트)', 'https://www.hyundai.com/contents/vr360/NX05/interior/I35/colorchip-interior.png', 'I35');
insert into interior(id, name, img_uri, code) values(3, '블랙/그레이 투톤(그레이 가죽시트)', 'https://www.hyundai.com/contents/vr360/NX05/interior/I36/colorchip-interior.png','I36');
insert into interior(id, name, img_uri, code) values(4, '네이비 원톤(인디고 모노톤)', 'https://www.hyundai.com/contents/vr360/NX05/interior/I37/colorchip-interior.png', 'I37');
insert into interior(id, name, img_uri, code) values(5, '블랙모노톤(레드스티치)', 'https://www.hyundai.com/contents/vr360/NX05/interior/I38/colorchip-interior.png', 'I38');
insert into interior(id, name, img_uri, code) values(6, '블랙 / 브라운 투톤(브라운 가죽시트)', 'https://www.hyundai.com/contents/vr360/NX05/interior/PRF/colorchip-interior.png', 'PRF');
-- avante
insert into interior(id, name, img_uri, code) values(7, '블랙모노톤', 'https://www.hyundai.com/contents/vr360/CN12/interior/NNB/colorchip-interior.png', 'NNB');
insert into interior(id, name, img_uri, code) values(8, '세이지그린', 'https://www.hyundai.com/contents/vr360/CN12/interior/SSS/colorchip-interior.png', 'SSS');
insert into interior(id, name, img_uri, code) values(9, '캐쉬미어 베이지', 'https://www.hyundai.com/contents/vr360/CN12/interior/VHC/colorchip-interior.png', 'VHC');

-- avante - 1
-- smart - 1
insert into color_combi(id, trim_code, exterior_code, interior_code) values(1, 'ATS', 'A6G', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(2, 'ATS', 'PE2', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(3, 'ATS', 'M6T', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(4, 'ATS', 'PM2', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(5, 'ATS', 'YP5', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(6, 'ATS', 'SAW', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(7, 'ATS', 'R2P', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(8, 'ATS', 'A2B', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(9, 'ATS', 'C5G', 'NNB');

-- modern - 2
insert into color_combi(id, trim_code, exterior_code, interior_code) values(10, 'ATM', 'A6G', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(11, 'ATM', 'PE2', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(12, 'ATM', 'M6T', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(13, 'ATM', 'PM2', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(14, 'ATM', 'YP5', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(15, 'ATM', 'SAW', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(16, 'ATM', 'R2P', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(17, 'ATM', 'A2B', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(18, 'ATM', 'C5G', 'NNB');

insert into color_combi(id, trim_code, exterior_code, interior_code) values(19, 'ATM', 'A6G', 'SSS');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(20, 'ATM', 'PE2', 'SSS');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(21, 'ATM', 'M6T', 'SSS');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(22, 'ATM', 'SAW', 'SSS');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(23, 'ATM', 'A2B', 'SSS');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(24, 'ATM', 'C5G', 'SSS');
-- inspiration - 3
insert into color_combi(id, trim_code, exterior_code, interior_code) values(25, 'ATI', 'A6G', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(26, 'ATI', 'PE2', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(27, 'ATI', 'M6T', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(28, 'ATI', 'PM2', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(29, 'ATI', 'YP5', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(30, 'ATI', 'SAW', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(31, 'ATI', 'R2P', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(32, 'ATI', 'A2B', 'NNB');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(33, 'ATI', 'C5G', 'NNB');

insert into color_combi(id, trim_code, exterior_code, interior_code) values(34, 'ATI', 'A6G', 'SSS');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(35, 'ATI', 'PE2', 'SSS');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(36, 'ATI', 'M6T', 'SSS');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(37, 'ATI', 'SAW', 'SSS');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(38, 'ATI', 'A2B', 'SSS');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(39, 'ATI', 'C5G', 'SSS');

insert into color_combi(id, trim_code, exterior_code, interior_code) values(40, 'ATI', 'A6G', 'VHC');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(41, 'ATI', 'PE2', 'VHC');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(42, 'ATI', 'M6T', 'VHC');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(43, 'ATI', 'PM2', 'VHC');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(44, 'ATI', 'YP5', 'VHC');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(45, 'ATI', 'SAW', 'VHC');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(46, 'ATI', 'A2B', 'VHC');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(47, 'ATI', 'C5G', 'VHC');
-- tuscon - 2
-- Modern - 4
insert into color_combi(id, trim_code, exterior_code, interior_code) values(48, 'TCM', 'B6S', 'I34');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(49, 'TCM', 'R2T', 'I34');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(50, 'TCM', 'TW3', 'I34');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(51, 'TCM', 'A5G', 'I34');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(52, 'TCM', 'R4G', 'I34');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(53, 'TCM', 'PS8', 'I34');
insert into color_combi(id, trim_code, exterior_code, interior_code) values(54, 'TCM', 'TCM', 'I34');

-- premium - 5
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'B6S', 'I34');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'R2T', 'I34');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'TW3', 'I34');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'A5G', 'I34');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'R4G', 'I34');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'PS8', 'I34');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'TCM', 'I34');

insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'B6S', 'I35');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'R2T', 'I35');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'TW3', 'I35');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'A5G', 'I35');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'R4G', 'I35');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'PS8', 'I35');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'TCM', 'I35');

insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'B6S', 'I36');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'R2T', 'I36');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'TW3', 'I36');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'A5G', 'I36');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'R4G', 'I36');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'PS8', 'I36');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'TCM', 'I36');

insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'TW3', 'I38');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'R4G', 'I38');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'TCM', 'I38');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCP', 'Y3G', 'I38');
-- inspiration - 6
insert into color_combi(trim_code, exterior_code, interior_code)values ('TCI', 'B6S', 'I35');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'R2T', 'I35');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'TW3', 'I35');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'A5G', 'I35');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'R4G', 'I35');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'PS8', 'I35');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'TCM', 'I35');

insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'B6S', 'I36');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'R2T', 'I36');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'TW3', 'I36');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'A5G', 'I36');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'R4G', 'I36');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'PS8', 'I36');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'TCM', 'I36');

insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'R2T', 'I37');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'TW3', 'I37');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'R4G', 'I37');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'PS8', 'I37');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'TCM', 'I37');

insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'TW3', 'I38');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'R4G', 'I38');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'TCM', 'I38');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'Y3G', 'I38');

insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'B6S', 'PRF');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'R2T', 'PRF');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'TW3', 'PRF');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'A5G', 'PRF');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'R4G', 'PRF');
insert into color_combi(trim_code, exterior_code, interior_code) values('TCI', 'TCM', 'PRF');

insert into options(id, code, category, name, price) values(1, 'PLL', 'DETAIL', '파노라마 선루프 + 루프랙 + LED 실내등(맵램프,룸램프)', 1240000);
insert into options(id, code, category, name, price) values(2, 'HRR', 'DETAIL', '하이패스 + ECM 룸미러', 250000);
insert into options(id, code, category, name, price) values(3, 'MN1','DETAIL', '멀티미디어 내비 Ⅰ', 1290000);
insert into options(id, code, category, name, price) values(4, 'ID1', 'DETAIL', '인테리어 디자인 Ⅰ', 250000);
insert into options(id, code, category, name, price) values(5, 'CVN', 'DETAIL', '컨비니언스', 540000);
insert into options(id, code, category, name, price) values(6, 'EX1', 'DETAIL', '익스테리어 Ⅰ', 690000);
insert into options(id, code, category, name, price) values(7, 'EXP','DETAIL', '익스테리어 Ⅰ 플러스', 940000);
insert into options(id, code, category, name, price) values(8, 'HSS', 'DETAIL', '현대 스마트센스', 890000);
insert into options(id, code, category, name, price) values(9, 'BC1', 'DETAIL', '빌트인 캠(보조배터리 포함)', 640000); -- 투싼
insert into options(id, code, category, name, price) values(10, 'PLI', 'DETAIL', '파노라마 선루프 + LED 실내등(맵램프,룸램프)', 1140000);
insert into options(id, code, category, name, price) values(11, 'ID2', 'DETAIL', '인테리어 디자인 Ⅱ', 590000);
insert into options(id, code, category, name, price) values(12, 'CPT', 'DETAIL', '컴포트', 1140000);
insert into options(id, code, category, name, price) values(13, 'EX2', 'DETAIL', '익스테리어 Ⅱ', 690000);
insert into options(id, code, category, name, price) values(14, 'PL1', 'DETAIL', '플래티넘 Ⅰ', 2230000); -- 가솔린
insert into options(id, code, category, name, price) values(15, 'PL2', 'DETAIL', '플래티넘 Ⅱ', 2520000); -- 디젤
insert into options(id, code, category, name, price) values(16, 'PSL', 'DETAIL', '파노라마 선루프', 1090000);
insert into options(id, code, category, name, price) values(17, 'PL3', 'DETAIL', '플래티넘 Ⅲ', 1480000); -- 가솔린
insert into options(id, code, category, name, price) values(18, 'PL4', 'DETAIL', '플래티넘 Ⅳ', 1780000); -- 디젤
insert into options(id, code, category, name, price) values(19, 'CV1', 'DETAIL', '컨비니언스 I', 690000);
insert into options(id, code, category, name, price) values(20, 'IFN', 'DETAIL', '인포테인먼트 내비', 790000);
insert into options(id, code, category, name, price) values(21, 'HS3', 'DETAIL', '현대스마트센스 III', 690000);
insert into options(id, code, category, name, price) values(22, 'AT1', 'DETAIL', '17인치 알로이 휠 & 타이어 I', 490000); -- smart
insert into options(id, code, category, name, price) values(23, 'SLP', 'DETAIL', '선루프', 450000);
insert into options(id, code, category, name, price) values(24, 'PAP', 'DETAIL', '파킹 어시스트 플러스', 1290000);
insert into options(id, code, category, name, price) values(25, 'HS1', 'DETAIL', '현대스마트센스 Ⅰ', 940000);
insert into options(id, code, category, name, price) values(26, 'EXD', 'DETAIL', '익스테리어 디자인', 450000);
insert into options(id, code, category, name, price) values(27, 'CP1', 'DETAIL', '컴포트 I', 1140000);
insert into options(id, code, category, name, price) values(28, 'AT2', 'DETAIL', '17인치 알로이 휠 & 타이어 Ⅱ', 300000);
insert into options(id, code, category, name, price) values(29, 'SIC', 'DETAIL', '세이지그린 인테리어 컬러', 150000);
insert into options(id, code, category, name, price) values(30, 'BC2', 'DETAIL', '빌트인 캠(보조배터리 포함)', 690000); -- 아반떼
insert into options(id, code, category, name, price) values(31, 'CP2', 'DETAIL', '컴포트 Ⅱ', 990000);
insert into options(id, code, category, name, price) values(32, 'AVP', 'DETAIL', '어드벤처패키지', 790000);

insert into options(id, code, category, name, price) values(33, 'LLP', 'HGA', 'LED 라이팅 패키지 (선루프, 인스퍼레이션 전용)', 320000);
insert into options(id, code, category, name, price) values(34, 'SST', 'HGA', '사이드 스텝', 340000);
insert into options(id, code, category, name, price) values(35, 'AST', 'HGA', '어드벤처 전용 사이드 스텝', 340000);
insert into options(id, code, category, name, price) values(36, 'LGP', 'HGA', '러기지 패키지', 120000);
insert into options(id, code, category, name, price) values(37, 'PTM', 'HGA', '프로텍션 매트 패키지', 230000);
insert into options(id, code, category, name, price) values(38, 'BAC', 'HGA', '빌트인 공기청정기', 400000);
insert into options(id, code, category, name, price) values(39, 'KNW', 'HGA', '적외선 무릎 워머', 300000);

insert into options(id, code, category, name, price) values(40, 'NX1', 'NPF', '19인치 매트 블랙 경량휠', 1140000);
insert into options(id, code, category, name, price) values(41, 'NX2', 'NPF', '모노블록 브레이크+19인치 매트 블랙 경량휠 패키지', 2230000);

-- insert into options(id, category, name, price) values(42, 'DETAIL', '어드벤처패키지', 790000);

insert into option_interior(interior_code, option_code) values ('SSS', 'SIC');
insert into option_interior(interior_code, option_code) values ('I36', 'ID2');
insert into option_interior(interior_code, option_code) values ('I35', 'ID2');

insert into model_option(model_id, option_code) values(1, 'CV1');
insert into model_option(model_id, option_code) values(1, 'IFN');
insert into model_option(model_id, option_code) values(1, 'HRR');
insert into model_option(model_id, option_code) values(1, 'HS3');
insert into model_option(model_id, option_code) values(1, 'AT1');

insert into model_option(model_id, option_code) values(2, 'CV1');
insert into model_option(model_id, option_code) values(2, 'HRR');
insert into model_option(model_id, option_code) values(2, 'IFN');
insert into model_option(model_id, option_code) values(2, 'HS3');
insert into model_option(model_id, option_code) values(2, 'AT1');

insert into model_option(model_id, option_code) values(3, 'HRR');
insert into model_option(model_id, option_code) values(3, 'HS1');
insert into model_option(model_id, option_code) values(3, 'EXD');
insert into model_option(model_id, option_code) values(3, 'SIC');
insert into model_option(model_id, option_code) values(3, 'SLP');
insert into model_option(model_id, option_code) values(3, 'PAP');
insert into model_option(model_id, option_code) values(3, 'CP1');
insert into model_option(model_id, option_code) values(3, 'AT2');

insert into model_option(model_id, option_code) values(4, 'HS1');
insert into model_option(model_id, option_code) values(4, 'HRR');
insert into model_option(model_id, option_code) values(4, 'AT2');
insert into model_option(model_id, option_code) values(4, 'SIC');
insert into model_option(model_id, option_code) values(4, 'SLP');
insert into model_option(model_id, option_code) values(4, 'PAP');
insert into model_option(model_id, option_code) values(4, 'CP2');
insert into model_option(model_id, option_code) values(4, 'EXD');

insert into model_option(model_id, option_code) values(5, 'AT2');
insert into model_option(model_id, option_code) values(5, 'SIC');
insert into model_option(model_id, option_code) values(5, 'SLP');
insert into model_option(model_id, option_code) values(5, 'BC2');

insert into model_option(model_id, option_code) values(6, 'AT2');
insert into model_option(model_id, option_code) values(6, 'SIC');
insert into model_option(model_id, option_code) values(6, 'SLP');

-- tuscon modern
insert into model_option(model_id, option_code) values(7, 'MN1');
insert into model_option(model_id, option_code) values(7, 'CVN');
insert into model_option(model_id, option_code) values(7, 'HSS');
insert into model_option(model_id, option_code) values(7, 'EX1');
insert into model_option(model_id, option_code) values(7, 'EXP');
insert into model_option(model_id, option_code) values(7, 'PLL');
insert into model_option(model_id, option_code) values(7, 'HRR');
insert into model_option(model_id, option_code) values(7, 'ID1');
-- hga
insert into model_option(model_id, option_code) values(7, 'LGP');
insert into model_option(model_id, option_code) values(7, 'SST');
insert into model_option(model_id, option_code) values(7, 'KNW');
insert into model_option(model_id, option_code) values(7, 'PTM');

insert into model_option(model_id, option_code) values(8, 'CVN');
insert into model_option(model_id, option_code) values(8, 'MN1');
insert into model_option(model_id, option_code) values(8, 'EX1');
insert into model_option(model_id, option_code) values(8, 'HRR');
insert into model_option(model_id, option_code) values(8, 'HSS');
insert into model_option(model_id, option_code) values(8, 'EXP');
insert into model_option(model_id, option_code) values(8, 'PLL');
insert into model_option(model_id, option_code) values(8, 'ID1');

insert into model_option(model_id, option_code) values(8, 'LGP');
insert into model_option(model_id, option_code) values(8, 'SST');
insert into model_option(model_id, option_code) values(8, 'KNW');
insert into model_option(model_id, option_code) values(8, 'PTM');

insert into model_option(model_id, option_code) values(9, 'MN1');
insert into model_option(model_id, option_code) values(9, 'CVN');
insert into model_option(model_id, option_code) values(9, 'HSS');
insert into model_option(model_id, option_code) values(9, 'EX1');
insert into model_option(model_id, option_code) values(9, 'EXP');
insert into model_option(model_id, option_code) values(9, 'PLL');
insert into model_option(model_id, option_code) values(9, 'HRR');
insert into model_option(model_id, option_code) values(9, 'ID1');

insert into model_option(model_id, option_code) values(9, 'LGP');
insert into model_option(model_id, option_code) values(9, 'SST');
insert into model_option(model_id, option_code) values(9, 'KNW');
insert into model_option(model_id, option_code) values(9, 'PTM');

insert into model_option(model_id, option_code) values(10, 'MN1');
insert into model_option(model_id, option_code) values(10, 'CVN');
insert into model_option(model_id, option_code) values(10, 'HSS');
insert into model_option(model_id, option_code) values(10, 'EX1');
insert into model_option(model_id, option_code) values(10, 'EXP');
insert into model_option(model_id, option_code) values(10, 'PLL');
insert into model_option(model_id, option_code) values(10, 'HRR');
insert into model_option(model_id, option_code) values(10, 'ID1');

insert into model_option(model_id, option_code) values(10, 'LGP');
insert into model_option(model_id, option_code) values(10, 'SST');
insert into model_option(model_id, option_code) values(10, 'KNW');
insert into model_option(model_id, option_code) values(10, 'PTM');
-- tuscon premium
insert into model_option(model_id, option_code) values(11, 'HSS');
insert into model_option(model_id, option_code) values(11, 'CPT');
insert into model_option(model_id, option_code) values(11, 'BC1');
insert into model_option(model_id, option_code) values(11, 'EX2');
insert into model_option(model_id, option_code) values(11, 'PLI');
insert into model_option(model_id, option_code) values(11, 'ID2');
insert into model_option(model_id, option_code) values(11, 'PL2');

insert into model_option(model_id, option_code) values(11, 'LGP');
insert into model_option(model_id, option_code) values(11, 'BAC');
insert into model_option(model_id, option_code) values(11, 'SST');
insert into model_option(model_id, option_code) values(11, 'KNW');
insert into model_option(model_id, option_code) values(11, 'PTM');

insert into model_option(model_id, option_code) values(12, 'CPT');
insert into model_option(model_id, option_code) values(12, 'HSS');
insert into model_option(model_id, option_code) values(12, 'BC1');
insert into model_option(model_id, option_code) values(12, 'EX2');
insert into model_option(model_id, option_code) values(12, 'PLI');
insert into model_option(model_id, option_code) values(12, 'ID2');
insert into model_option(model_id, option_code) values(12, 'PL2');

insert into model_option(model_id, option_code) values(12, 'LGP');
insert into model_option(model_id, option_code) values(12, 'BAC');
insert into model_option(model_id, option_code) values(12, 'SST');
insert into model_option(model_id, option_code) values(12, 'KNW');
insert into model_option(model_id, option_code) values(12, 'PTM');

insert into model_option(model_id, option_code) values(13, 'HSS');
insert into model_option(model_id, option_code) values(13, 'CPT');
insert into model_option(model_id, option_code) values(13, 'BC1');
insert into model_option(model_id, option_code) values(13, 'EX2');
insert into model_option(model_id, option_code) values(13, 'PLI');
insert into model_option(model_id, option_code) values(13, 'ID2');
insert into model_option(model_id, option_code) values(13, 'PL1');

insert into model_option(model_id, option_code) values(13, 'LGP');
insert into model_option(model_id, option_code) values(13, 'BAC');
insert into model_option(model_id, option_code) values(13, 'SST');
insert into model_option(model_id, option_code) values(13, 'KNW');
insert into model_option(model_id, option_code) values(13, 'PTM');

insert into model_option(model_id, option_code) values(14, 'HSS');
insert into model_option(model_id, option_code) values(14, 'CPT');
insert into model_option(model_id, option_code) values(14, 'BC1');
insert into model_option(model_id, option_code) values(14, 'EX2');
insert into model_option(model_id, option_code) values(14, 'PLI');
insert into model_option(model_id, option_code) values(14, 'ID2');
insert into model_option(model_id, option_code) values(14, 'PL1');

insert into model_option(model_id, option_code) values(14, 'LGP');
insert into model_option(model_id, option_code) values(14, 'BAC');
insert into model_option(model_id, option_code) values(14, 'SST');
insert into model_option(model_id, option_code) values(14, 'KNW');
insert into model_option(model_id, option_code) values(14, 'PTM');

-- tuscon inspiration

insert into model_option(model_id, option_code) values(15, 'PL4');
insert into model_option(model_id, option_code) values(15, 'BC1');
insert into model_option(model_id, option_code) values(15, 'PSL');
insert into model_option(model_id, option_code) values(15, 'AVP');

insert into model_option(model_id, option_code) values(15, 'LLP');
insert into model_option(model_id, option_code) values(15, 'LGP');
insert into model_option(model_id, option_code) values(15, 'BAC');
insert into model_option(model_id, option_code) values(15, 'SST');
insert into model_option(model_id, option_code) values(15, 'KNW');
insert into model_option(model_id, option_code) values(15, 'PTM');

insert into model_option(model_id, option_code) values(15, 'NX1');
insert into model_option(model_id, option_code) values(15, 'NX2');

insert into model_option(model_id, option_code) values(16, 'PL4');
insert into model_option(model_id, option_code) values(16, 'PSL');
insert into model_option(model_id, option_code) values(16, 'BC1');
insert into model_option(model_id, option_code) values(16, 'AVP');

insert into model_option(model_id, option_code) values(16, 'LLP');
insert into model_option(model_id, option_code) values(16, 'LGP');
insert into model_option(model_id, option_code) values(16, 'BAC');
insert into model_option(model_id, option_code) values(16, 'SST');
insert into model_option(model_id, option_code) values(16, 'KNW');
insert into model_option(model_id, option_code) values(16, 'PTM');

insert into model_option(model_id, option_code) values(16, 'NX1');
insert into model_option(model_id, option_code) values(16, 'NX2');

insert into model_option(model_id, option_code) values(17, 'PL3');
insert into model_option(model_id, option_code) values(17, 'BC1');
insert into model_option(model_id, option_code) values(17, 'PSL');
insert into model_option(model_id, option_code) values(17, 'AVP');

insert into model_option(model_id, option_code) values(17, 'LLP');
insert into model_option(model_id, option_code) values(17, 'LGP');
insert into model_option(model_id, option_code) values(17, 'BAC');
insert into model_option(model_id, option_code) values(17, 'SST');
insert into model_option(model_id, option_code) values(17, 'KNW');
insert into model_option(model_id, option_code) values(17, 'PTM');

insert into model_option(model_id, option_code) values(17, 'NX1');
insert into model_option(model_id, option_code) values(17, 'NX2');

insert into model_option(model_id, option_code) values(18, 'PL3');
insert into model_option(model_id, option_code) values(18, 'BC1');
insert into model_option(model_id, option_code) values(18, 'PSL');
insert into model_option(model_id, option_code) values(18, 'AVP');

insert into model_option(model_id, option_code) values(18, 'LLP');
insert into model_option(model_id, option_code) values(18, 'LGP');
insert into model_option(model_id, option_code) values(18, 'BAC');
insert into model_option(model_id, option_code) values(18, 'SST');
insert into model_option(model_id, option_code) values(18, 'KNW');
insert into model_option(model_id, option_code) values(18, 'PTM');

insert into model_option(model_id, option_code) values(18, 'NX1');
insert into model_option(model_id, option_code) values(18, 'NX2');
-- dependency_id 선택해야 option_id 선택 가능
insert into dependency_option(trim_code, option_code, dependency_code) values('ATS', 'IFN', 'CV1');
insert into dependency_option(trim_code, option_code, dependency_code) values('TCI', 'AST', 'AVP');
insert into dependency_option(trim_code, option_code, dependency_code) values('TCM', 'LLP', 'PLL');
insert into dependency_option(trim_code, option_code, dependency_code) values('TCP','LLP', 'PLI');

insert into dependency_option(trim_code, option_code, dependency_code) values('TCM', 'NX1', 'EXP');
insert into dependency_option(trim_code, option_code, dependency_code) values('TCM', 'NX2', 'EXP');

insert into dependency_option(trim_code, option_code, dependency_code) values('TCP', 'NX1', 'EX2');
insert into dependency_option(trim_code, option_code, dependency_code) values('TCP', 'NX2', 'EX2');

insert into del_option(option_code, del_code) values('AVP', 'NX1');
insert into del_option(option_code, del_code) values('AVP', 'NX2');
insert into del_option(option_code, del_code) values('AVP', 'SST');

insert into duplicate_option(option_code, duplicate_code) values('NX1', 'NX2');
insert into duplicate_option(option_code, duplicate_code) values('NX2', 'NX1');
insert into duplicate_option(option_code, duplicate_code) values('HRR', 'MN1');
insert into duplicate_option(option_code, duplicate_code) values('MN1', 'HRR');
insert into duplicate_option(option_code, duplicate_code) values('EX1', 'EXP');
insert into duplicate_option(option_code, duplicate_code) values('EXP', 'EX1');


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

CREATE or REPLACE VIEW v_engines as
SELECT t.id tool_id, t.contents contents, t.img_uri, t.name name, t.type type, mt.model_id model_id
FROM tooltips t, model_tooltips mt
WHERE t.type = 'ENGINE' and mt.tooltips_id = t.id;

CREATE or REPLACE VIEW v_gearbox as
SELECT t.id tool_id, t.contents contents, t.img_uri, t.name name, t.type type, mt.model_id model_id
FROM tooltips t, model_tooltips mt
WHERE t.type = 'GEARBOX' and mt.tooltips_id = t.id;

CREATE or REPLACE VIEW v_driving as
SELECT t.id tool_id, t.contents contents, t.img_uri, t.name name, t.type type, mt.model_id model_id
FROM tooltips t, model_tooltips mt
WHERE t.type = 'DRIVING' and mt.tooltips_id = t.id;

