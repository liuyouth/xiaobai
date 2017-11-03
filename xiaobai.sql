/*
 Navicat Premium Data Transfer

 Source Server         : 京东云
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : 116.196.122.228
 Source Database       : xiaobai

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : utf-8

 Date: 11/02/2017 23:25:57 PM
*/

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `business`
-- ----------------------------
DROP TABLE IF EXISTS `business`;
CREATE TABLE `business` (
  `business_id` int(11) NOT NULL AUTO_INCREMENT,
  `business_name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `on_behalf` bit(1) DEFAULT b'0' COMMENT '代发',
  PRIMARY KEY (`business_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `config`
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parameter_id` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `parameter` (`parameter_id`),
  CONSTRAINT `parameter_id` FOREIGN KEY (`parameter_id`) REFERENCES `parameter` (`parameter_id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `model`
-- ----------------------------
DROP TABLE IF EXISTS `model`;
CREATE TABLE `model` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `model_id` int(11) DEFAULT NULL,
  `memory_id` int(11) DEFAULT NULL,
  `color_id` int(11) DEFAULT NULL,
  `support_network_id` int(11) DEFAULT NULL,
  `network_lock_id` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `form_id` int(11) DEFAULT NULL,
  `create_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `model` (`model_id`),
  KEY `memory` (`memory_id`),
  KEY `color` (`color_id`),
  KEY `support_network` (`support_network_id`),
  KEY `network_lock` (`network_lock_id`),
  KEY `form` (`form_id`),
  CONSTRAINT `business_id` FOREIGN KEY (`form_id`) REFERENCES `business` (`business_id`) ON DELETE SET NULL ON UPDATE SET NULL,
  CONSTRAINT `color_id` FOREIGN KEY (`color_id`) REFERENCES `config` (`id`) ON DELETE SET NULL ON UPDATE SET NULL,
  CONSTRAINT `memory_id` FOREIGN KEY (`memory_id`) REFERENCES `config` (`id`) ON DELETE SET NULL ON UPDATE SET NULL,
  CONSTRAINT `model_id` FOREIGN KEY (`model_id`) REFERENCES `config` (`id`) ON DELETE SET NULL ON UPDATE SET NULL,
  CONSTRAINT `support_network_id` FOREIGN KEY (`support_network_id`) REFERENCES `config` (`id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `parameter`
-- ----------------------------
DROP TABLE IF EXISTS `parameter`;
CREATE TABLE `parameter` (
  `parameter_id` int(11) NOT NULL AUTO_INCREMENT,
  `parameter_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`parameter_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `phone`
-- ----------------------------
DROP TABLE IF EXISTS `phone`;
CREATE TABLE `phone` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phone_name` varchar(255) NOT NULL,
  `phone_color` varchar(255) DEFAULT NULL,
  `phone_model` varchar(255) DEFAULT NULL,
  `phone_size` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `phone_color`
-- ----------------------------
DROP TABLE IF EXISTS `phone_color`;
CREATE TABLE `phone_color` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT '???',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
--  Table structure for `phone_log`
-- ----------------------------
DROP TABLE IF EXISTS `phone_log`;
CREATE TABLE `phone_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `price` double(6,2) DEFAULT NULL,
  `create_time` varchar(255) DEFAULT NULL,
  `in_price` double(6,2) DEFAULT NULL,
  `is_Intact` bit(1) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `phone_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `phone_id` (`phone_id`),
  CONSTRAINT `phone` FOREIGN KEY (`phone_id`) REFERENCES `phone` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `phone_model`
-- ----------------------------
DROP TABLE IF EXISTS `phone_model`;
CREATE TABLE `phone_model` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT 'iphone 6',
  `create_time` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `is_lock` bit(1) DEFAULT b'0',
  `is_Intact` bit(1) DEFAULT b'0',
  `version` varchar(255) COLLATE utf8_bin DEFAULT '??',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
--  Table structure for `phone_offer`
-- ----------------------------
DROP TABLE IF EXISTS `phone_offer`;
CREATE TABLE `phone_offer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `in_name` varchar(255) COLLATE utf8_bin DEFAULT '',
  `create_time` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `size` int(11) DEFAULT '16',
  `is_Intact` bit(1) DEFAULT b'0',
  `model_id` int(11) DEFAULT '0',
  `color_id` int(11) DEFAULT '0',
  `price` double(6,2) DEFAULT '9999.99',
  `in_price` double(6,2) DEFAULT '9999.99',
  PRIMARY KEY (`id`),
  KEY `color_id` (`color_id`),
  KEY `model_id` (`model_id`),
  CONSTRAINT `color` FOREIGN KEY (`color_id`) REFERENCES `phone_color` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `model` FOREIGN KEY (`model_id`) REFERENCES `phone_model` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

SET FOREIGN_KEY_CHECKS = 1;
