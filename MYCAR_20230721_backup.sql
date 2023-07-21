-- MySQL dump 10.13  Distrib 8.0.33, for macos13.3 (arm64)
--
-- Host: localhost    Database: MYCAR
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `car` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `code` varchar(5) DEFAULT NULL,
  `name` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_534i83jbb41wk8l42d4gd63l5` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (1,'AT01','더 뉴 아반떼','SEDAN'),(2,'TC01','투싼','SUV');
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `color_combi`
--

DROP TABLE IF EXISTS `color_combi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `color_combi` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `exterior_code` varchar(5) NOT NULL,
  `interior_code` varchar(5) NOT NULL,
  `trim_code` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `color_combi`
--

LOCK TABLES `color_combi` WRITE;
/*!40000 ALTER TABLE `color_combi` DISABLE KEYS */;
INSERT INTO `color_combi` VALUES (1,'A6G','NNB','ATS'),(2,'PE2','NNB','ATS'),(3,'M6T','NNB','ATS'),(4,'PM2','NNB','ATS'),(5,'YP5','NNB','ATS'),(6,'SAW','NNB','ATS'),(7,'R2P','NNB','ATS'),(8,'A2B','NNB','ATS'),(9,'C5G','NNB','ATS'),(10,'A6G','NNB','ATM'),(11,'PE2','NNB','ATM'),(12,'M6T','NNB','ATM'),(13,'PM2','NNB','ATM'),(14,'YP5','NNB','ATM'),(15,'SAW','NNB','ATM'),(16,'R2P','NNB','ATM'),(17,'A2B','NNB','ATM'),(18,'C5G','NNB','ATM'),(19,'A6G','SSS','ATM'),(20,'PE2','SSS','ATM'),(21,'M6T','SSS','ATM'),(22,'SAW','SSS','ATM'),(23,'A2B','SSS','ATM'),(24,'C5G','SSS','ATM'),(25,'A6G','NNB','ATI'),(26,'PE2','NNB','ATI'),(27,'M6T','NNB','ATI'),(28,'PM2','NNB','ATI'),(29,'YP5','NNB','ATI'),(30,'SAW','NNB','ATI'),(31,'R2P','NNB','ATI'),(32,'A2B','NNB','ATI'),(33,'C5G','NNB','ATI'),(34,'A6G','SSS','ATI'),(35,'PE2','SSS','ATI'),(36,'M6T','SSS','ATI'),(37,'SAW','SSS','ATI'),(38,'A2B','SSS','ATI'),(39,'C5G','SSS','ATI'),(40,'A6G','VHC','ATI'),(41,'PE2','VHC','ATI'),(42,'M6T','VHC','ATI'),(43,'PM2','VHC','ATI'),(44,'YP5','VHC','ATI'),(45,'SAW','VHC','ATI'),(46,'A2B','VHC','ATI'),(47,'C5G','VHC','ATI'),(48,'B6S','I34','TCM'),(49,'R2T','I34','TCM'),(50,'TW3','I34','TCM'),(51,'A5G','I34','TCM'),(52,'R4G','I34','TCM'),(53,'PS8','I34','TCM'),(54,'TCM','I34','TCM'),(55,'B6S','I34','TCP'),(56,'R2T','I34','TCP'),(57,'TW3','I34','TCP'),(58,'A5G','I34','TCP'),(59,'R4G','I34','TCP'),(60,'PS8','I34','TCP'),(61,'TCM','I34','TCP'),(62,'B6S','I35','TCP'),(63,'R2T','I35','TCP'),(64,'TW3','I35','TCP'),(65,'A5G','I35','TCP'),(66,'R4G','I35','TCP'),(67,'PS8','I35','TCP'),(68,'TCM','I35','TCP'),(69,'B6S','I36','TCP'),(70,'R2T','I36','TCP'),(71,'TW3','I36','TCP'),(72,'A5G','I36','TCP'),(73,'R4G','I36','TCP'),(74,'PS8','I36','TCP'),(75,'TCM','I36','TCP'),(76,'TW3','I38','TCP'),(77,'R4G','I38','TCP'),(78,'TCM','I38','TCP'),(79,'Y3G','I38','TCP'),(80,'B6S','I35','TCI'),(81,'R2T','I35','TCI'),(82,'TW3','I35','TCI'),(83,'A5G','I35','TCI'),(84,'R4G','I35','TCI'),(85,'PS8','I35','TCI'),(86,'TCM','I35','TCI'),(87,'B6S','I36','TCI'),(88,'R2T','I36','TCI'),(89,'TW3','I36','TCI'),(90,'A5G','I36','TCI'),(91,'R4G','I36','TCI'),(92,'PS8','I36','TCI'),(93,'TCM','I36','TCI'),(94,'R2T','I37','TCI'),(95,'TW3','I37','TCI'),(96,'R4G','I37','TCI'),(97,'PS8','I37','TCI'),(98,'TCM','I37','TCI'),(99,'TW3','I38','TCI'),(100,'R4G','I38','TCI'),(101,'TCM','I38','TCI'),(102,'Y3G','I38','TCI'),(103,'B6S','PRF','TCI'),(104,'R2T','PRF','TCI'),(105,'TW3','PRF','TCI'),(106,'A5G','PRF','TCI'),(107,'R4G','PRF','TCI'),(108,'TCM','PRF','TCI');
/*!40000 ALTER TABLE `color_combi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `del_option`
--

DROP TABLE IF EXISTS `del_option`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `del_option` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `del_code` varchar(5) NOT NULL,
  `option_code` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `del_option`
--

LOCK TABLES `del_option` WRITE;
/*!40000 ALTER TABLE `del_option` DISABLE KEYS */;
INSERT INTO `del_option` VALUES (1,'NX1','AVP'),(2,'NX2','AVP'),(3,'SST','AVP');
/*!40000 ALTER TABLE `del_option` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dependency_option`
--

DROP TABLE IF EXISTS `dependency_option`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dependency_option` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `dependency_code` varchar(5) NOT NULL,
  `option_code` varchar(5) NOT NULL,
  `trim_code` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dependency_option`
--

LOCK TABLES `dependency_option` WRITE;
/*!40000 ALTER TABLE `dependency_option` DISABLE KEYS */;
INSERT INTO `dependency_option` VALUES (1,'CV1','IFN','ATS'),(2,'AVP','AST','TCI'),(3,'PLL','LLP','TCM'),(4,'PLI','LLP','TCP'),(5,'EXP','NX1','TCM'),(6,'EXP','NX2','TCM'),(7,'EX2','NX1','TCP'),(8,'EX2','NX2','TCP');
/*!40000 ALTER TABLE `dependency_option` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `duplicate_option`
--

DROP TABLE IF EXISTS `duplicate_option`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `duplicate_option` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `duplicate_code` varchar(5) NOT NULL,
  `option_code` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `duplicate_option`
--

LOCK TABLES `duplicate_option` WRITE;
/*!40000 ALTER TABLE `duplicate_option` DISABLE KEYS */;
INSERT INTO `duplicate_option` VALUES (1,'NX2','NX1'),(2,'NX1','NX2'),(3,'MN1','HRR'),(4,'HRR','MN1'),(5,'EXP','EX1'),(6,'EX1','EXP');
/*!40000 ALTER TABLE `duplicate_option` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exterior`
--

DROP TABLE IF EXISTS `exterior`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exterior` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `code` varchar(5) DEFAULT NULL,
  `img_uri` varchar(255) DEFAULT NULL,
  `name` varchar(30) NOT NULL,
  `price` decimal(19,2) DEFAULT '0.00',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_9x8v6k6d5vfb72q92yqyhwm5s` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exterior`
--

LOCK TABLES `exterior` WRITE;
/*!40000 ALTER TABLE `exterior` DISABLE KEYS */;
INSERT INTO `exterior` VALUES (1,'B6S','https://www.hyundai.com/contents/vr360/NX05/exterior/B6S/colorchip-exterior.png','실키 브론즈 메탈릭',0.00),(2,'R2T','https://www.hyundai.com/contents/vr360/NX05/exterior/R2T/colorchip-exterior.png','쉬머링 실버 메탈릭',0.00),(3,'TW3','https://www.hyundai.com/contents/vr360/NX05/exterior/TW3/colorchip-exterior.png','크리미 화이트 펄',0.00),(4,'A5G','https://www.hyundai.com/contents/vr360/NX05/exterior/A5G/colorchip-exterior.png','아마존 그레이 메탈릭',0.00),(5,'R4G','https://www.hyundai.com/contents/vr360/NX05/exterior/R4G/colorchip-exterior.png','티탄 그레이 메탈릭',0.00),(6,'PS8','https://www.hyundai.com/contents/vr360/NX05/exterior/PS8/colorchip-exterior.png','오션 인디고 펄',0.00),(7,'TCM','https://www.hyundai.com/contents/vr360/NX05/exterior/TCM/colorchip-exterior.png','팬텀 블랙 펄',0.00),(8,'Y3G','https://www.hyundai.com/contents/vr360/NX05/exterior/Y3G/colorchip-exterior.png','티타늄 그레이 매트',300000.00),(9,'A6G','https://www.hyundai.com/contents/vr360/CN12/exterior/A5G/colorchip-exterior.png','아마존 그레이 메탈릭',0.00),(10,'PE2','https://www.hyundai.com/contents/vr360/CN12/exterior/PE2/colorchip-exterior.png','에코트로닉 그레이펄',0.00),(11,'M6T','https://www.hyundai.com/contents/vr360/CN12/exterior/M6T/colorchip-exterior.png','플루이드 그레이 메탈릭',0.00),(12,'PM2','https://www.hyundai.com/contents/vr360/CN12/exterior/PM2/colorchip-exterior.png','메타블루펄',0.00),(13,'YP5','https://www.hyundai.com/contents/vr360/CN12/exterior/YP5/colorchip-exterior.png','인텐스 블루 펄',0.00),(14,'SAW','https://www.hyundai.com/contents/vr360/CN12/exterior/SAW/colorchip-exterior.png','아틀라스 화이트',0.00),(15,'R2P','https://www.hyundai.com/contents/vr360/CN12/exterior/R2P/colorchip-exterior.png','얼티메이트 레드 메탈릭',0.00),(16,'A2B','https://www.hyundai.com/contents/vr360/CN12/exterior/A2B/colorchip-exterior.png','어비스블랙펄',0.00),(17,'C5G','https://www.hyundai.com/contents/vr360/CN12/exterior/C5G/colorchip-exterior.png','사이버 그레이 메탈릭',0.00);
/*!40000 ALTER TABLE `exterior` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `interior`
--

DROP TABLE IF EXISTS `interior`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `interior` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `code` varchar(5) DEFAULT NULL,
  `img_uri` varchar(255) DEFAULT NULL,
  `name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_qmdxcm8f3jcu3s15y9j0hfttm` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `interior`
--

LOCK TABLES `interior` WRITE;
/*!40000 ALTER TABLE `interior` DISABLE KEYS */;
INSERT INTO `interior` VALUES (1,'I34','https://www.hyundai.com/contents/vr360/NX05/interior/I34/colorchip-interior.png','블랙모노톤'),(2,'I35','https://www.hyundai.com/contents/vr360/NX05/interior/I35/colorchip-interior.png','블랙 모노톤(가죽 시트)'),(3,'I36','https://www.hyundai.com/contents/vr360/NX05/interior/I36/colorchip-interior.png','블랙/그레이 투톤(그레이 가죽시트)'),(4,'I37','https://www.hyundai.com/contents/vr360/NX05/interior/I37/colorchip-interior.png','네이비 원톤(인디고 모노톤)'),(5,'I38','https://www.hyundai.com/contents/vr360/NX05/interior/I38/colorchip-interior.png','블랙모노톤(레드스티치)'),(6,'PRF','https://www.hyundai.com/contents/vr360/NX05/interior/PRF/colorchip-interior.png','블랙 / 브라운 투톤(브라운 가죽시트)'),(7,'NNB','https://www.hyundai.com/contents/vr360/CN12/interior/NNB/colorchip-interior.png','블랙모노톤'),(8,'SSS','https://www.hyundai.com/contents/vr360/CN12/interior/SSS/colorchip-interior.png','세이지그린'),(9,'VHC','https://www.hyundai.com/contents/vr360/CN12/interior/VHC/colorchip-interior.png','캐쉬미어 베이지');
/*!40000 ALTER TABLE `interior` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `model`
--

DROP TABLE IF EXISTS `model`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `model` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `basic_info` varchar(30) DEFAULT NULL,
  `engine_displacement` varchar(10) DEFAULT NULL,
  `fuel_efficiency` varchar(10) DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  `price` decimal(19,2) NOT NULL,
  `trim_code` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `model`
--

LOCK TABLES `model` WRITE;
/*!40000 ALTER TABLE `model` DISABLE KEYS */;
INSERT INTO `model` VALUES (1,'자가용 가솔린 1.6 A/T','1,598cc','15.3 km/ℓ','더 뉴 아반떼 자가용 가솔린 1.6 Smart A/T',19750000.00,'ATS'),(2,'자가용 LPG 1.6 A/T','1,591cc','10.5 km/ℓ','더 뉴 아반떼 자가용 LPG 1.6 Smart A/T',21150000.00,'ATS'),(3,'자가용 가솔린 1.6 A/T','1,598cc','14.8 km/ℓ','더 뉴 아반떼 자가용 가솔린 1.6 Modern A/T',22730000.00,'ATM'),(4,'자가용 LPG 1.6 A/T',NULL,NULL,'더 뉴 아반떼 자가용 LPG 1.6 Modern A/T',24120000.00,'ATM'),(5,'자가용 가솔린 1.6 A/T',NULL,NULL,'더 뉴 아반떼 자가용 가솔린 1.6 Inspiration A/T',26910000.00,'ATI'),(6,'자가용 LPG 1.6 A/T',NULL,NULL,'더 뉴 아반떼 자가용 LPG 1.6 Inspiration A/T',28180000.00,'ATI'),(7,'디젤 2WD A/T',NULL,NULL,'투싼 디젤 Modern 2WD A/T',28190000.00,'TCM'),(8,'디젤 4WD A/T',NULL,NULL,'투싼 디젤 Modern 4WD A/T',30420000.00,'TCM'),(9,'1.6 가솔린 터보 2WD DCT',NULL,NULL,'투싼 1.6 가솔린 터보 Modern 2WD DCT',26030000.00,'TCM'),(10,'1.6 가솔린 터보 4WD DCT',NULL,NULL,'투싼 1.6 가솔린 터보 Modern 4WD DCT',28010000.00,'TCM'),(11,'디젤 2WD A/T',NULL,NULL,'투싼 디젤 Premium 2WD A/T',31100000.00,'TCP'),(12,'디젤 4WD A/T',NULL,NULL,'투싼 디젤 Premium 4WD A/T',33330000.00,'TCP'),(13,'1.6 가솔린 터보 2WD DCT',NULL,NULL,'투싼 1.6 가솔린 터보 Premium 2WD DCT',28940000.00,'TCP'),(14,'1.6 가솔린 터보 4WD DCT',NULL,NULL,'투싼 1.6 가솔린 터보 Premium 4WD DCT',30920000.00,'TCP'),(15,'디젤 2WD A/T',NULL,NULL,'투싼 디젤 Inspiration 2WD A/T',34780000.00,'TCI'),(16,'디젤 4WD A/T',NULL,NULL,'투싼 디젤 Inspiration 4WD A/T',37010000.00,'TCI'),(17,'1.6 가솔린 터보 2WD DCT',NULL,NULL,'투싼 1.6 가솔린 터보 Inspiration 2WD DCT',32620000.00,'TCI'),(18,'1.6 가솔린 터보 4WD DCT',NULL,NULL,'투싼 1.6 가솔린 터보 Inspiration 4WD DCT',34600000.00,'TCI');
/*!40000 ALTER TABLE `model` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `model_option`
--

DROP TABLE IF EXISTS `model_option`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `model_option` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `model_id` bigint NOT NULL,
  `option_code` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=178 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `model_option`
--

LOCK TABLES `model_option` WRITE;
/*!40000 ALTER TABLE `model_option` DISABLE KEYS */;
INSERT INTO `model_option` VALUES (1,1,'CV1'),(2,1,'IFN'),(3,1,'HRR'),(4,1,'HS3'),(5,1,'AT1'),(6,2,'CV1'),(7,2,'HRR'),(8,2,'IFN'),(9,2,'HS3'),(10,2,'AT1'),(11,3,'HRR'),(12,3,'HS1'),(13,3,'EXD'),(14,3,'SIC'),(15,3,'SLP'),(16,3,'PAP'),(17,3,'CP1'),(18,3,'AT2'),(19,4,'HS1'),(20,4,'HRR'),(21,4,'AT2'),(22,4,'SIC'),(23,4,'SLP'),(24,4,'PAP'),(25,4,'CP2'),(26,4,'EXD'),(27,5,'AT2'),(28,5,'SIC'),(29,5,'SLP'),(30,5,'BC2'),(31,6,'AT2'),(32,6,'SIC'),(33,6,'SLP'),(34,7,'MN1'),(35,7,'CVN'),(36,7,'HSS'),(37,7,'EX1'),(38,7,'EXP'),(39,7,'PLL'),(40,7,'HRR'),(41,7,'ID1'),(42,7,'LGP'),(43,7,'SST'),(44,7,'KNW'),(45,7,'PTM'),(46,8,'CVN'),(47,8,'MN1'),(48,8,'EX1'),(49,8,'HRR'),(50,8,'HSS'),(51,8,'EXP'),(52,8,'PLL'),(53,8,'ID1'),(54,8,'LGP'),(55,8,'SST'),(56,8,'KNW'),(57,8,'PTM'),(58,9,'MN1'),(59,9,'CVN'),(60,9,'HSS'),(61,9,'EX1'),(62,9,'EXP'),(63,9,'PLL'),(64,9,'HRR'),(65,9,'ID1'),(66,9,'LGP'),(67,9,'SST'),(68,9,'KNW'),(69,9,'PTM'),(70,10,'MN1'),(71,10,'CVN'),(72,10,'HSS'),(73,10,'EX1'),(74,10,'EXP'),(75,10,'PLL'),(76,10,'HRR'),(77,10,'ID1'),(78,10,'LGP'),(79,10,'SST'),(80,10,'KNW'),(81,10,'PTM'),(82,11,'HSS'),(83,11,'CPT'),(84,11,'BC1'),(85,11,'EX2'),(86,11,'PLI'),(87,11,'ID2'),(88,11,'PL2'),(89,11,'LGP'),(90,11,'BAC'),(91,11,'SST'),(92,11,'KNW'),(93,11,'PTM'),(94,12,'CPT'),(95,12,'HSS'),(96,12,'BC1'),(97,12,'EX2'),(98,12,'PLI'),(99,12,'ID2'),(100,12,'PL2'),(101,12,'LGP'),(102,12,'BAC'),(103,12,'SST'),(104,12,'KNW'),(105,12,'PTM'),(106,13,'HSS'),(107,13,'CPT'),(108,13,'BC1'),(109,13,'EX2'),(110,13,'PLI'),(111,13,'ID2'),(112,13,'PL1'),(113,13,'LGP'),(114,13,'BAC'),(115,13,'SST'),(116,13,'KNW'),(117,13,'PTM'),(118,14,'HSS'),(119,14,'CPT'),(120,14,'BC1'),(121,14,'EX2'),(122,14,'PLI'),(123,14,'ID2'),(124,14,'PL1'),(125,14,'LGP'),(126,14,'BAC'),(127,14,'SST'),(128,14,'KNW'),(129,14,'PTM'),(130,15,'PL4'),(131,15,'BC1'),(132,15,'PSL'),(133,15,'AVP'),(134,15,'LLP'),(135,15,'LGP'),(136,15,'BAC'),(137,15,'SST'),(138,15,'KNW'),(139,15,'PTM'),(140,15,'NX1'),(141,15,'NX2'),(142,16,'PL4'),(143,16,'PSL'),(144,16,'BC1'),(145,16,'AVP'),(146,16,'LLP'),(147,16,'LGP'),(148,16,'BAC'),(149,16,'SST'),(150,16,'KNW'),(151,16,'PTM'),(152,16,'NX1'),(153,16,'NX2'),(154,17,'PL3'),(155,17,'BC1'),(156,17,'PSL'),(157,17,'AVP'),(158,17,'LLP'),(159,17,'LGP'),(160,17,'BAC'),(161,17,'SST'),(162,17,'KNW'),(163,17,'PTM'),(164,17,'NX1'),(165,17,'NX2'),(166,18,'PL3'),(167,18,'BC1'),(168,18,'PSL'),(169,18,'AVP'),(170,18,'LLP'),(171,18,'LGP'),(172,18,'BAC'),(173,18,'SST'),(174,18,'KNW'),(175,18,'PTM'),(176,18,'NX1'),(177,18,'NX2');
/*!40000 ALTER TABLE `model_option` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `model_tooltips`
--

DROP TABLE IF EXISTS `model_tooltips`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `model_tooltips` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `model_id` bigint NOT NULL,
  `tooltips_id` bigint NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `model_tooltips`
--

LOCK TABLES `model_tooltips` WRITE;
/*!40000 ALTER TABLE `model_tooltips` DISABLE KEYS */;
INSERT INTO `model_tooltips` VALUES (1,7,7),(2,8,8),(3,9,7),(4,10,8),(5,11,7),(6,12,8),(7,13,7),(8,14,8),(9,15,7),(10,16,8),(11,17,7),(12,18,8),(13,7,5),(14,8,5),(15,9,6),(16,10,6),(17,11,5),(18,12,5),(19,13,6),(20,14,6),(21,15,5),(22,16,5),(23,17,6),(24,18,6),(25,1,1),(26,2,2),(27,3,1),(28,4,2),(29,5,1),(30,6,2),(31,7,4),(32,8,4),(33,9,3),(34,10,3),(35,11,4),(36,12,4),(37,13,3),(38,14,3),(39,15,4),(40,16,4),(41,17,3),(42,18,3);
/*!40000 ALTER TABLE `model_tooltips` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `option_interior`
--

DROP TABLE IF EXISTS `option_interior`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `option_interior` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `interior_code` varchar(5) NOT NULL,
  `option_code` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `option_interior`
--

LOCK TABLES `option_interior` WRITE;
/*!40000 ALTER TABLE `option_interior` DISABLE KEYS */;
INSERT INTO `option_interior` VALUES (1,'SSS','SIC'),(2,'I36','ID2'),(3,'I35','ID2');
/*!40000 ALTER TABLE `option_interior` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `options`
--

DROP TABLE IF EXISTS `options`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `options` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `category` varchar(10) NOT NULL,
  `code` varchar(5) DEFAULT NULL,
  `img_uri` varchar(200) DEFAULT 'https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg',
  `name` varchar(50) NOT NULL,
  `price` decimal(19,2) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_2c558xo8cevj8jq7yql1khciy` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `options`
--

LOCK TABLES `options` WRITE;
/*!40000 ALTER TABLE `options` DISABLE KEYS */;
INSERT INTO `options` VALUES (1,'DETAIL','PLL','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','파노라마 선루프 + 루프랙 + LED 실내등(맵램프,룸램프)',1240000.00),(2,'DETAIL','HRR','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','하이패스 + ECM 룸미러',250000.00),(3,'DETAIL','MN1','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','멀티미디어 내비 Ⅰ',1290000.00),(4,'DETAIL','ID1','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','인테리어 디자인 Ⅰ',250000.00),(5,'DETAIL','CVN','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','컨비니언스',540000.00),(6,'DETAIL','EX1','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','익스테리어 Ⅰ',690000.00),(7,'DETAIL','EXP','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','익스테리어 Ⅰ 플러스',940000.00),(8,'DETAIL','HSS','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','현대 스마트센스',890000.00),(9,'DETAIL','BC1','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','빌트인 캠(보조배터리 포함)',640000.00),(10,'DETAIL','PLI','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','파노라마 선루프 + LED 실내등(맵램프,룸램프)',1140000.00),(11,'DETAIL','ID2','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','인테리어 디자인 Ⅱ',590000.00),(12,'DETAIL','CPT','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','컴포트',1140000.00),(13,'DETAIL','EX2','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','익스테리어 Ⅱ',690000.00),(14,'DETAIL','PL1','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','플래티넘 Ⅰ',2230000.00),(15,'DETAIL','PL2','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','플래티넘 Ⅱ',2520000.00),(16,'DETAIL','PSL','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','파노라마 선루프',1090000.00),(17,'DETAIL','PL3','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','플래티넘 Ⅲ',1480000.00),(18,'DETAIL','PL4','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','플래티넘 Ⅳ',1780000.00),(19,'DETAIL','CV1','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','컨비니언스 I',690000.00),(20,'DETAIL','IFN','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','인포테인먼트 내비',790000.00),(21,'DETAIL','HS3','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','현대스마트센스 III',690000.00),(22,'DETAIL','AT1','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','17인치 알로이 휠 & 타이어 I',490000.00),(23,'DETAIL','SLP','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','선루프',450000.00),(24,'DETAIL','PAP','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','파킹 어시스트 플러스',1290000.00),(25,'DETAIL','HS1','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','현대스마트센스 Ⅰ',940000.00),(26,'DETAIL','EXD','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','익스테리어 디자인',450000.00),(27,'DETAIL','CP1','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','컴포트 I',1140000.00),(28,'DETAIL','AT2','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','17인치 알로이 휠 & 타이어 Ⅱ',300000.00),(29,'DETAIL','SIC','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','세이지그린 인테리어 컬러',150000.00),(30,'DETAIL','BC2','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','빌트인 캠(보조배터리 포함)',690000.00),(31,'DETAIL','CP2','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','컴포트 Ⅱ',990000.00),(32,'DETAIL','AVP','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','어드벤처패키지',790000.00),(33,'HGA','LLP','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','LED 라이팅 패키지 (선루프, 인스퍼레이션 전용)',320000.00),(34,'HGA','SST','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','사이드 스텝',340000.00),(35,'HGA','AST','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','어드벤처 전용 사이드 스텝',340000.00),(36,'HGA','LGP','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','러기지 패키지',120000.00),(37,'HGA','PTM','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','프로텍션 매트 패키지',230000.00),(38,'HGA','BAC','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','빌트인 공기청정기',400000.00),(39,'HGA','KNW','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','적외선 무릎 워머',300000.00),(40,'NPF','NX1','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','19인치 매트 블랙 경량휠',1140000.00),(41,'NPF','NX2','https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg','모노블록 브레이크+19인치 매트 블랙 경량휠 패키지',2230000.00);
/*!40000 ALTER TABLE `options` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tooltips`
--

DROP TABLE IF EXISTS `tooltips`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tooltips` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `contents` varchar(255) DEFAULT NULL,
  `img_uri` varchar(255) DEFAULT NULL,
  `name` varchar(30) NOT NULL,
  `type` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tooltips`
--

LOCK TABLES `tooltips` WRITE;
/*!40000 ALTER TABLE `tooltips` DISABLE KEYS */;
INSERT INTO `tooltips` VALUES (1,'차세대 스마트스트림 엔진을 적용하여 연비 효율이 우수하고, 안정감 있는 주행 성능을 제공합니다','https://www.hyundai.com/contents/spec/guide/cn_smartstreamg1.6_s.jpg','가솔린 1.6','ENGINE'),(2,'높은 효율의 연비와 비교적 저렴한 연료비용으로 경제성이 우수합니다','https://www.hyundai.com/contents/spec/guide/cn_lpg1.6_s.jpg','LPG 1.6','ENGINE'),(3,'차세대 스마트스트림 엔진을 적용하여 연비 효율이 우수하고, 안정감 있는 주행 성능을 제공합니다','https://www.hyundai.com/contents/spec/guide/nx_smartstreamg1.6t_s.jpg','1.6 가솔린 터보','ENGINE'),(4,'높은 토크로 파워풀한 드라이빙이 가능하며, 차급대비 연비 효율이 우수합니다','https://www.hyundai.com/contents/spec/guide/nx_diesel2.0_s.jpg','디젤','ENGINE'),(5,'운전자가 직접 변속을 하지 않고 적정한 변속 시점에 자동으로 변속해주는 시스템으로, 변속 충격이 작고 부드러우면서 선형적인 가속 감각과 편안한 승차감이 특징입니다','https://www.hyundai.com/contents/spec/guide/nx_smartstreamivt_s.jpg','A/T','GEARBOX'),(6,'두 개의 클러치를 사용해 연속적인 변속으로 다이내믹한 변속감을 제공하고, 빠른 변속이 가능하여 연비 효율이 우수합니다','https://www.hyundai.com/contents/spec/guide/nx_7dct_d_s.jpg','DCT','GEARBOX'),(7,'엔진에서 전달되는 동력이 전/후륜 바퀴 중 한쪽으로만 전달되어 차량을 움직이는 방식입니다.차체가 가벼워 연료 효율이 높습니다','https://www.hyundai.com/contents/spec/guide/nx_7dct_h_s.jpg','2WD','DRIVING'),(8,'전자식 상시 4륜 구동 시스템 입니다. 도로의 상황이나 주행 환경에 맞춰 전후륜 구동력을 자동배분하여 주행 안전성을 높여줍니다.','https://www.hyundai.com/contents/spec/guide/4WD.JPG','4WD','DRIVING');
/*!40000 ALTER TABLE `tooltips` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trim`
--

DROP TABLE IF EXISTS `trim`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trim` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `car_code` varchar(5) NOT NULL,
  `code` varchar(5) NOT NULL,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_840de6461f7u0oaxj1pxqfqp3` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trim`
--

LOCK TABLES `trim` WRITE;
/*!40000 ALTER TABLE `trim` DISABLE KEYS */;
INSERT INTO `trim` VALUES (1,'AT01','ATS','Smart'),(2,'AT01','ATM','Modern'),(3,'AT01','ATI','Inspiration'),(4,'TC01','TCM','Modern'),(5,'TC01','TCP','Premium'),(6,'TC01','TCI','Inspiration');
/*!40000 ALTER TABLE `trim` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `v_driving`
--

DROP TABLE IF EXISTS `v_driving`;
/*!50001 DROP VIEW IF EXISTS `v_driving`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `v_driving` AS SELECT 
 1 AS `tool_id`,
 1 AS `contents`,
 1 AS `img_uri`,
 1 AS `name`,
 1 AS `type`,
 1 AS `model_id`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `v_engines`
--

DROP TABLE IF EXISTS `v_engines`;
/*!50001 DROP VIEW IF EXISTS `v_engines`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `v_engines` AS SELECT 
 1 AS `tool_id`,
 1 AS `contents`,
 1 AS `img_uri`,
 1 AS `name`,
 1 AS `type`,
 1 AS `model_id`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `v_gearbox`
--

DROP TABLE IF EXISTS `v_gearbox`;
/*!50001 DROP VIEW IF EXISTS `v_gearbox`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `v_gearbox` AS SELECT 
 1 AS `tool_id`,
 1 AS `contents`,
 1 AS `img_uri`,
 1 AS `name`,
 1 AS `type`,
 1 AS `model_id`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `v_driving`
--

/*!50001 DROP VIEW IF EXISTS `v_driving`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_driving` AS select `t`.`id` AS `tool_id`,`t`.`contents` AS `contents`,`t`.`img_uri` AS `img_uri`,`t`.`name` AS `name`,`t`.`type` AS `type`,`mt`.`model_id` AS `model_id` from (`tooltips` `t` join `model_tooltips` `mt`) where ((`t`.`type` = 'DRIVING') and (`mt`.`tooltips_id` = `t`.`id`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `v_engines`
--

/*!50001 DROP VIEW IF EXISTS `v_engines`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_engines` AS select `t`.`id` AS `tool_id`,`t`.`contents` AS `contents`,`t`.`img_uri` AS `img_uri`,`t`.`name` AS `name`,`t`.`type` AS `type`,`mt`.`model_id` AS `model_id` from (`tooltips` `t` join `model_tooltips` `mt`) where ((`t`.`type` = 'ENGINE') and (`mt`.`tooltips_id` = `t`.`id`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `v_gearbox`
--

/*!50001 DROP VIEW IF EXISTS `v_gearbox`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_gearbox` AS select `t`.`id` AS `tool_id`,`t`.`contents` AS `contents`,`t`.`img_uri` AS `img_uri`,`t`.`name` AS `name`,`t`.`type` AS `type`,`mt`.`model_id` AS `model_id` from (`tooltips` `t` join `model_tooltips` `mt`) where ((`t`.`type` = 'GEARBOX') and (`mt`.`tooltips_id` = `t`.`id`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-21 15:40:09
