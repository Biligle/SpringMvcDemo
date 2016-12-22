/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : mytest

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2016-12-22 15:09:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(30) NOT NULL,
  `USER_PASSWORD` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'ZhangSan', '123456');
INSERT INTO `t_user` VALUES ('2', 'LiSi', '123456');
INSERT INTO `t_user` VALUES ('3', 'WangWu', '123456');
INSERT INTO `t_user` VALUES ('4', '卡罗尔', '123456');
INSERT INTO `t_user` VALUES ('5', '达利尔', '123456');
INSERT INTO `t_user` VALUES ('6', '达林', '123456');
INSERT INTO `t_user` VALUES ('7', '卡尔', '123456');
INSERT INTO `t_user` VALUES ('8', 'Biligle', '123456');
INSERT INTO `t_user` VALUES ('9', '布莱尔', '123456');
INSERT INTO `t_user` VALUES ('10', '布雷', '123456');
INSERT INTO `t_user` VALUES ('11', '卡里奥', '123456');
