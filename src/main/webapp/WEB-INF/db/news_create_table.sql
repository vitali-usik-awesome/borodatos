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


-- Dumping structure for table borodatos.news
CREATE TABLE IF NOT EXISTS `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` text COLLATE utf8_unicode_ci,
  `title_img` text COLLATE utf8_unicode_ci,
  `content` text COLLATE utf8_unicode_ci,
  `author` text COLLATE utf8_unicode_ci,
  `date` datetime DEFAULT NULL,
  `status` text COLLATE utf8_unicode_ci,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Dumping data for table borodatos.news: ~9 rows (approximately)
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` (`id`, `title`, `title_img`, `content`, `author`, `date`, `status`) VALUES
	(1, 'Metal All Stars // Дворец Спорта // 1 апреля', 'http://localhost:8080/borodatos/resources/pic/watchmen.jpg', 'Самые именитые и титулованные музыканты из групп MEGADETH, PANTERA, MANOWAR, VENOM, SEPULTURA и др., которые за долгие годы заслужили называться легендами, теперь на одной сцене!', 'vitali', '2014-12-12 09:37:00', 'public'),
	(2, 'first', 'http://localhost:8080/borodatos/resources/pic/watchmen.jpg', 'ololo', 'vitali', '2014-12-11 16:02:29', 'public'),
	(3, 'first', 'http://localhost:8080/borodatos/resources/pic/watchmen.jpg', 'ololo', 'vitali', '2014-12-11 16:02:29', 'public'),
	(4, 'first', 'http://localhost:8080/borodatos/resources/pic/watchmen.jpg', 'ololo', 'vitali', '2014-12-11 16:02:29', 'public'),
	(5, 'first', 'http://localhost:8080/borodatos/resources/pic/watchmen.jpg', 'ololo', 'vitali', '2014-12-11 16:02:29', 'public'),
	(6, 'first', 'http://localhost:8080/borodatos/resources/pic/watchmen.jpg', 'ololo', 'vitali', '2014-12-11 16:02:29', 'public'),
	(10, 'I gotta piss', 'http://localhost:8080/borodatos/resources/pic/watchmen.jpg', 'The path of the righteous man is beset on all sides by the iniquities of the selfish and the tyranny of evil men. Blessed is he who, in the name of charity and good will, shepherds the weak through the valley of darkness, for he is truly his brother\'s keeper and the finder of lost children. And I will strike down upon thee with great vengeance and furious anger those who would attempt to poison and destroy My brothers. And you will know My name is the Lord when I lay My vengeance upon thee. </p>', 'vitali', '2014-12-11 11:39:00', 'public'),
	(11, 'No man, I don\'t eat pork', 'http://localhost:8080/borodatos/resources/pic/watchmen.jpg', 'You think water moves fast? You should see ice. It moves like it has a mind. Like it knows it killed the world once and got a taste for murder. After the avalanche, it took us a week to climb out. Now, I don\'t know exactly when we turned on each other, but I know that seven of us survived the slide...', 'vitali', '2014-12-11 11:40:57', 'public'),
	(12, 'Подпиши петицию за смену названия страны на «Беларусь» в Wikipedia', 'http://localhost:8080/borodatos/resources/pic/ratm.jpg', 'Белорусские патриоты начали сбор подписей в поддержку просьбы о замене названия "Белоруссия" в Wikipedia на единственно правильное название "Беларусь" или "Республика Беларусь". ', 'vitali', '2014-12-12 09:38:20', 'public');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
