/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.40 : Database - student1128
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`student1128` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `student1128`;

/*Table structure for table `stu` */

DROP TABLE IF EXISTS `stu`;

CREATE TABLE `stu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sno` varchar(15) DEFAULT NULL,
  `sname` varchar(10) DEFAULT NULL,
  `sage` varchar(3) DEFAULT NULL,
  `sdate` date DEFAULT NULL,
  `ssex` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `stu` */

insert  into `stu`(`id`,`sno`,`sname`,`sage`,`sdate`,`ssex`) values (1,'2018001','swu','21','2018-11-28','b');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
