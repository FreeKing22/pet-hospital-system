/*
 Navicat Premium Data Transfer

 Source Server         : local-database
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : phs

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 26/04/2018 12:33:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for phs_user
-- ----------------------------
DROP TABLE IF EXISTS `phs_user`;
CREATE TABLE `phs_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `role` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of phs_user
-- ----------------------------
BEGIN;
INSERT INTO `phs_user` VALUES (1, 'chris', '123', 1);
INSERT INTO `phs_user` VALUES (2, 'liu', '234', 1);
INSERT INTO `phs_user` VALUES (3, 'zhang', '456', 2);
INSERT INTO `phs_user` VALUES (4, 'Sherry', 'qwe', 2);
INSERT INTO `phs_user` VALUES (5, 'coco', 'qaz', 2);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
