/*
Navicat MySQL Data Transfer

Source Server         : drools
Source Server Version : 50129
Source Host           : localhost:3306
Source Database       : drools

Target Server Type    : MYSQL
Target Server Version : 50129
File Encoding         : 65001

Date: 2018-05-18 17:20:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for promote_rule
-- ----------------------------
DROP TABLE IF EXISTS `promote_rule`;
CREATE TABLE `promote_rule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `promote_code` varchar(15) NOT NULL COMMENT '优惠券编码',
  `promote_rule` text COMMENT '优惠规则',
  `promote_name` varchar(255) DEFAULT NULL COMMENT '优惠券名称',
  PRIMARY KEY (`id`,`promote_code`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
