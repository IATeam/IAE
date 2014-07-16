/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50613
 Source Host           : localhost
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 50613
 File Encoding         : utf-8

 Date: 07/16/2014 14:28:22 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `EVENT`
-- ----------------------------
DROP TABLE IF EXISTS `EVENT`;
CREATE TABLE `EVENT` (
  `ID` bigint(20) NOT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_qt6navk8aeanmrk9xdls4s1l5` FOREIGN KEY (`ID`) REFERENCES `PERSON` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `PERSON`
-- ----------------------------
DROP TABLE IF EXISTS `PERSON`;
CREATE TABLE `PERSON` (
  `ID` bigint(20) NOT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_a1y9hq5hd326ir3fqu0g3r83v` FOREIGN KEY (`ID`) REFERENCES `EVENT` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `event_person`
-- ----------------------------
DROP TABLE IF EXISTS `event_person`;
CREATE TABLE `event_person` (
  `event_id` int(11) DEFAULT NULL,
  `person_id` int(11) DEFAULT NULL,
  KEY `event_id` (`event_id`),
  KEY `people_id` (`person_id`),
  CONSTRAINT `eid` FOREIGN KEY (`event_id`) REFERENCES `events` (`id`),
  CONSTRAINT `pid` FOREIGN KEY (`person_id`) REFERENCES `people` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `event_person`
-- ----------------------------
BEGIN;
INSERT INTO `event_person` VALUES ('1', '2'), ('2', '2');
COMMIT;

-- ----------------------------
--  Table structure for `events`
-- ----------------------------
DROP TABLE IF EXISTS `events`;
CREATE TABLE `events` (
  `id` int(11) NOT NULL DEFAULT '0',
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  CONSTRAINT `FK_1yoj71g6yi7yjn511jlvdfiye` FOREIGN KEY (`id`) REFERENCES `people` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `events`
-- ----------------------------
BEGIN;
INSERT INTO `events` VALUES ('1', 'new year eve'), ('2', 'new year day');
COMMIT;

-- ----------------------------
--  Table structure for `people`
-- ----------------------------
DROP TABLE IF EXISTS `people`;
CREATE TABLE `people` (
  `id` int(11) NOT NULL DEFAULT '0',
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  CONSTRAINT `FK_igx6kmnwkk1rca9q4vrjm0s91` FOREIGN KEY (`id`) REFERENCES `events` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `people`
-- ----------------------------
BEGIN;
INSERT INTO `people` VALUES ('1', 'john'), ('2', 'jane');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
