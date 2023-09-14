-- MySQL dump 10.13  Distrib 8.0.34, for Linux (x86_64)
--
-- Host: localhost    Database: meetingroombooking_db
-- ------------------------------------------------------
-- Server version	8.0.34-0ubuntu0.22.04.1

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
-- Table structure for table `amenities_tbl`
--


DROP TABLE IF EXISTS `amenities_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `amenities_tbl` (
  `name` varchar(255) NOT NULL,
  `creditsperhr` double DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amenities_tbl`
--

/*!40000 ALTER TABLE `amenities_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `amenities_tbl` ENABLE KEYS */;

--
-- Table structure for table `managers_tbl`
--

DROP TABLE IF EXISTS `managers_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `managers_tbl` (
  `id` int NOT NULL,
  `credits` int NOT NULL,
  `type` int NOT NULL,
  KEY `id` (`id`),
  CONSTRAINT `managers_tbl_ibfk_1` FOREIGN KEY (`id`) REFERENCES `users_tbl` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `managers_tbl`
--

/*!40000 ALTER TABLE `managers_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `managers_tbl` ENABLE KEYS */;

--
-- Table structure for table `meetingamenities_tbl`
--

DROP TABLE IF EXISTS `meetingamenities_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `meetingamenities_tbl` (
  `id` int NOT NULL,
  `amenity` varchar(255) NOT NULL,
  KEY `id` (`id`),
  KEY `amenity` (`amenity`),
  CONSTRAINT `meetingamenities_tbl_ibfk_1` FOREIGN KEY (`id`) REFERENCES `meetings_tbl` (`id`),
  CONSTRAINT `meetingamenities_tbl_ibfk_2` FOREIGN KEY (`amenity`) REFERENCES `amenities_tbl` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meetingamenities_tbl`
--

/*!40000 ALTER TABLE `meetingamenities_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `meetingamenities_tbl` ENABLE KEYS */;

--
-- Table structure for table `meetingparticipants_tbl`
--

DROP TABLE IF EXISTS `meetingparticipants_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `meetingparticipants_tbl` (
  `meetingid` int NOT NULL,
  `userid` int NOT NULL,
  KEY `meetingid` (`meetingid`),
  KEY `userid` (`userid`),
  CONSTRAINT `meetingparticipants_tbl_ibfk_1` FOREIGN KEY (`meetingid`) REFERENCES `meetings_tbl` (`id`),
  CONSTRAINT `meetingparticipants_tbl_ibfk_2` FOREIGN KEY (`userid`) REFERENCES `users_tbl` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meetingparticipants_tbl`
--

/*!40000 ALTER TABLE `meetingparticipants_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `meetingparticipants_tbl` ENABLE KEYS */;

--
-- Table structure for table `meetingroom_tbl`
--

DROP TABLE IF EXISTS `meetingroom_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `meetingroom_tbl` (
  `name` varchar(255) NOT NULL,
  `capacity` int NOT NULL,
  `creditsperhr` double NOT NULL,
  `ratings` double NOT NULL,
  `perhrcost` double NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meetingroom_tbl`
--

/*!40000 ALTER TABLE `meetingroom_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `meetingroom_tbl` ENABLE KEYS */;

--
-- Table structure for table `meetings_tbl`
--

DROP TABLE IF EXISTS `meetings_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `meetings_tbl` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'Primary Key',
  `title` varchar(255) DEFAULT NULL,
  `orguserid` int NOT NULL COMMENT 'organizing user id',
  `meetingdate` date DEFAULT NULL,
  `start_time` time DEFAULT NULL,
  `end_time` time DEFAULT NULL,
  `meetingroomname` varchar(255) NOT NULL,
  `type` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `meetingroomname` (`meetingroomname`),
  CONSTRAINT `meetings_tbl_ibfk_1` FOREIGN KEY (`meetingroomname`) REFERENCES `meetingroom_tbl` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meetings_tbl`
--

/*!40000 ALTER TABLE `meetings_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `meetings_tbl` ENABLE KEYS */;

--
-- Table structure for table `users_tbl`
--

DROP TABLE IF EXISTS `users_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users_tbl` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'Primary Key',
  `name` varchar(255) NOT NULL COMMENT 'User name',
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(10) NOT NULL COMMENT 'phone number',
  `role` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_tbl`
--

/*!40000 ALTER TABLE `users_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `users_tbl` ENABLE KEYS */;

--
-- Dumping routines for database 'meetingroombooking_db'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-11 21:50:39
