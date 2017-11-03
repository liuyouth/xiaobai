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

 Date: 11/03/2017 11:59:21 AM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `config`
-- ----------------------------
BEGIN;
INSERT INTO `config` VALUES ('1', '1', 'iphone7'), ('2', '1', 'iphone6'), ('3', '1', 'iphone6s'), ('4', '2', '128GB'), ('5', '3', '银色'), ('6', '3', '金色'), ('7', '3', '玫瑰金色'), ('8', '3', '黑色'), ('9', '3', '亮黑色'), ('10', '4', '移动4G联通4G'), ('11', '5', '无锁');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
