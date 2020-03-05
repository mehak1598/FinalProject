-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: bec
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books` (
  `id` int NOT NULL,
  `title` varchar(45) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `no_in_stock` int DEFAULT NULL,
  `stop_order` int DEFAULT NULL,
  `reordering_threshold` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES (1,'Harry Potter and the Sorcerer\'s Stone','JK Rowling',500,10,10,5),(2,'Lost Symbol','Dan Brown',550,15,10,5),(3,'Da Vinci Code','Dan Brown',550,15,10,5),(4,'And there were none','Agatha Christie',300,13,10,5),(5,'Harry Potter and the Chamber of Secrets ','JK Rowling',500,16,10,5),(6,'Gone Girl','Gillian Flynn',750,17,10,5),(7,'ABC murders','Agatha Christie',300,15,10,5),(8,'The Oath of the Vayuputras','Amish',650,17,10,5),(9,'The immortals of Meluha','Amish',650,10,10,5),(10,'The Secret of the Nagas','Amish',650,10,10,5),(11,'Harry Potter and the Prisoner of Azkaban ','JK Rowling',500,18,10,5),(12,'Divergent','Veronica Roth',450,11,10,5),(13,'Insurgent','Veronica Roth',450,17,10,5),(14,'Harry Potter and the Order of the Phoenix','JK Rowling',500,16,10,5),(15,'Harry Potter and the Goblet of Fire ','JK Rowling',500,13,10,5),(16,'Origin','Dan Brown',470,15,10,5),(17,'Digital Fortress','Dan Brown',475,15,10,5),(21,'Let it Snow','John Green',275,15,10,5),(22,'Turtles all the way down','John Green',375,15,10,5),(23,'Will Grayson,Will Grayson','John Green',375,15,10,5),(24,'An Abundance of Katherines','John Green',275,15,10,5),(25,'Paper towns','John Green',275,15,10,5),(26,'Looking for Alaska','John Green',365,15,10,5),(27,'The Scion of Ikshvaku','Amish',465,25,10,5),(28,'Sita','Amish',450,25,10,5),(29,'Raavan: Enemy of Aryavarta','Amish',550,25,10,5),(34,'The Mysterious Affair of Styles','Agatha Christie',320,15,10,5),(41,'Sharp Objects','Gillian Flynn',650,15,10,5);
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `zip` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `shipped` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'Mehak','vfb','kbvcs','voeibn','874','kcwbj','0'),(14,'mehak','yvd','k','ytf','6','uyv','0'),(15,'Mehak','kvuc','ucv','uv','123','tc','0'),(16,'Meghana','yrdxtr','cx','rtcx','876','gfc','0'),(17,'megh','msnbbd','alaoa','njjdid','5663','India','0');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promos`
--

DROP TABLE IF EXISTS `promos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `promocode` varchar(45) DEFAULT NULL,
  `discount` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promos`
--

LOCK TABLES `promos` WRITE;
/*!40000 ALTER TABLE `promos` DISABLE KEYS */;
INSERT INTO `promos` VALUES (1,'BOOKIT',15),(2,'BOOK50',50),(3,'BOOKS',20),(4,'BOOKNOW',20),(5,'BOOK55',55);
/*!40000 ALTER TABLE `promos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `email` varchar(150) DEFAULT NULL,
  `isAdmin` varchar(10) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Meghana','megha123','spmeghana16@gmail.com','0'),(2,'Admin','Admin','spmeghana@gmail.com','1'),(3,'Mehak','mehak123','mehak@gmail.com','0'),(4,'Saunak','saunak123','saunak@gmail.com','0'),(16,'Tom','Tom123','dev1@dev.com','0'),(17,'Jerry','jerry123','dev1@dev.com','0'),(55,'m','123456','meg@gmail.com','0');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-05 11:21:55
