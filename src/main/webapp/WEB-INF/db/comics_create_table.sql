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


-- Dumping structure for table borodatos.article
CREATE TABLE IF NOT EXISTS `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` mediumtext NOT NULL,
  `brief` mediumtext NOT NULL,
  `content` mediumtext NOT NULL,
  `author` mediumtext NOT NULL,
  `date` date NOT NULL,
  `link` mediumtext NOT NULL,
  `section` mediumtext NOT NULL,
  `priority` mediumtext NOT NULL,
  `views` int(11) unsigned zerofill NOT NULL DEFAULT '00000000000',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- Dumping data for table borodatos.article: ~6 rows (approximately)
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` (`id`, `title`, `brief`, `content`, `author`, `date`, `link`, `section`, `priority`, `views`) VALUES
	(1, 'Are you ready for the truth? Are you ready for the truth?', 'http://localhost:8080/borodatos/resources/pic/01.jpg', '1', '1', '2014-12-03', '1', 'comics', 'pop', 00000000001),
	(30, 'Are you ready for the truth? Are you ready for the truth?', 'http://localhost:8080/borodatos/resources/pic/02.jpg', '1', '1', '2014-12-03', '2', 'comics', 'pop', 00000000000),
	(31, 'Are you ready for the truth? Are you ready for the truth?', 'http://localhost:8080/borodatos/resources/pic/01.jpg', '1', '1', '2014-11-03', '3', 'comics', 'pop', 00000000000),
	(32, 'Are you ready for the truth? Are you ready for the truth?', 'http://localhost:8080/borodatos/resources/pic/01.jpg', '1', '1', '2014-11-23', '4', 'comics', 'pop', 00000000000),
	(33, 'Are you ready for the truth? Are you ready for the truth?', 'http://localhost:8080/borodatos/resources/pic/01.jpg', '1', '1', '2014-11-21', '5', 'comics', 'pop', 00000000000),
	(34, 'Are you ready for the truth? Are you ready for the truth?', 'http://localhost:8080/borodatos/resources/pic/02.jpg', '1', '1', '2014-11-19', '6', 'comics', 'pop', 00000000000);
/*!40000 ALTER TABLE `article` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;