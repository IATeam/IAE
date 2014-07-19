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

 Date: 07/19/2014 09:50:31 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

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
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `events`
-- ----------------------------
BEGIN;
INSERT INTO `events` VALUES ('1', 'new year eve'), ('2', 'new year day'), ('5', 'Easter'), ('6', 'Aus Day'), ('7', 'Christmas');
COMMIT;

-- ----------------------------
--  Table structure for `people`
-- ----------------------------
DROP TABLE IF EXISTS `people`;
CREATE TABLE `people` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `people`
-- ----------------------------
BEGIN;
INSERT INTO `people` VALUES ('1', 'john'), ('2', 'jane');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
