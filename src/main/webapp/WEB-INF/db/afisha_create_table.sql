-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.39 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for borodatos
CREATE DATABASE IF NOT EXISTS `borodatos` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `borodatos`;


-- Dumping structure for table borodatos.afisha
CREATE TABLE IF NOT EXISTS `afisha` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` text COLLATE utf8_unicode_ci NOT NULL,
  `title_img` text COLLATE utf8_unicode_ci NOT NULL,
  `author` text COLLATE utf8_unicode_ci NOT NULL,
  `link` text COLLATE utf8_unicode_ci NOT NULL,
  `status` text COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Dumping data for table borodatos.afisha: ~7 rows (approximately)
/*!40000 ALTER TABLE `afisha` DISABLE KEYS */;
INSERT INTO `afisha` (`id`, `title`, `title_img`, `author`, `link`, `status`) VALUES
	(1, 'Rise In Rage', 'http://localhost:8080/borodatos/resources/pic/afisha1.jpg', 'vitali', '#', 'public'),
	(2, 'Rise In Rage', 'http://localhost:8080/borodatos/resources/pic/afisha1.jpg', 'vitali', '#', 'public'),
	(3, 'Rise In Rage', 'http://localhost:8080/borodatos/resources/pic/afisha1.jpg', 'vitali', '#', 'public'),
	(4, 'Rise In Rage', 'http://localhost:8080/borodatos/resources/pic/afisha1.jpg', 'vitali', '#', 'public'),
	(5, 'Rise In Rage', 'http://localhost:8080/borodatos/resources/pic/afisha1.jpg', 'vitali', '#', 'public'),
	(6, 'Rise In Rage', 'http://localhost:8080/borodatos/resources/pic/afisha1.jpg', 'vitali', '#', 'public'),
	(7, 'Rise In Rage', 'http://localhost:8080/borodatos/resources/pic/afisha1.jpg', 'vitali', '#7', 'public');
/*!40000 ALTER TABLE `afisha` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
