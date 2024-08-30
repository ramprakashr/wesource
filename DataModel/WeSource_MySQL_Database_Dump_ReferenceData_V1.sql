-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: we_source
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `ws_country`
--

LOCK TABLES `ws_country` WRITE;
/*!40000 ALTER TABLE `ws_country` DISABLE KEYS */;
INSERT INTO `ws_country` VALUES (1,'India','91'),(3,'USA','1'),(4,'UK','44');
/*!40000 ALTER TABLE `ws_country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `ws_job_category`
--

LOCK TABLES `ws_job_category` WRITE;
/*!40000 ALTER TABLE `ws_job_category` DISABLE KEYS */;
INSERT INTO `ws_job_category` VALUES (1,'Food','Restarunt Cooking & maintanance, Caterring'),(2,'IT','Dev projects, Mobile app, etc'),(3,'Non-IT','Call center, Data entry, etc'),(4,'Automobile','Vehicle service/maintanance, Factory, etc'),(5,'Shop','Sales person, Billing, etc..'),(6,'Delivery','Food / Courrier, Home delivery grocery'),(7,'Cleaning','House keeping, Other cleaning works'),(8,'Care Taker','Baby care, elderly or challanged ppl care'),(9,'Other','If any others..');
/*!40000 ALTER TABLE `ws_job_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `ws_job_fee_interval`
--

LOCK TABLES `ws_job_fee_interval` WRITE;
/*!40000 ALTER TABLE `ws_job_fee_interval` DISABLE KEYS */;
INSERT INTO `ws_job_fee_interval` VALUES (6,'Hourly','Fee based on hour'),(7,'Day','Fee based on no of days'),(8,'Custom','Fee based each job');
/*!40000 ALTER TABLE `ws_job_fee_interval` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `ws_job_period`
--

LOCK TABLES `ws_job_period` WRITE;
/*!40000 ALTER TABLE `ws_job_period` DISABLE KEYS */;
INSERT INTO `ws_job_period` VALUES (1,'1 shift','9 AM–5 PM'),(2,'2 sft','4 PM–midnight'),(3,'3 shift','midnight–8 AM'),(4,'Custom','Publisher chosen window'),(5,'Any','Seeker prefarable window');
/*!40000 ALTER TABLE `ws_job_period` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `ws_job_status`
--

LOCK TABLES `ws_job_status` WRITE;
/*!40000 ALTER TABLE `ws_job_status` DISABLE KEYS */;
INSERT INTO `ws_job_status` VALUES (1,'New','Job just created'),(2,'Bid','Job bidding by multiple seekers'),(3,'Confirm','Seeker accepted for job by owners'),(4,'In-Progress','Duty begins'),(5,'Complete','Job/Duty completed by seeker'),(6,'Draft','Job unpublished for seekers'),(7,'Cancel','Job incomplete after progress');
/*!40000 ALTER TABLE `ws_job_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `ws_state`
--

LOCK TABLES `ws_state` WRITE;
/*!40000 ALTER TABLE `ws_state` DISABLE KEYS */;
INSERT INTO `ws_state` VALUES (4,'Maharastra','MH'),(5,'Tamil Nadu','TN'),(6,'Karnataka','KA'),(7,'Kerala','KL');
/*!40000 ALTER TABLE `ws_state` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-30 20:00:16
