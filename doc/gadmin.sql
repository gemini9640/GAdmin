
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `cp_goods`
-- ----------------------------
DROP TABLE IF EXISTS `cp_goods`;
CREATE TABLE `cp_goods` (
  `GOODS_ID` varchar(100) NOT NULL,
  `TITLE` varchar(255) DEFAULT NULL COMMENT '商品标题',
  `BIANMA` varchar(30) DEFAULT NULL COMMENT '商品编码',
  `SPTYPE_ID` varchar(100) DEFAULT NULL COMMENT '商品类别',
  `SPBRAND_ID` varchar(100) DEFAULT NULL COMMENT '品牌',
  `SPUNIT_ID` varchar(100) DEFAULT NULL COMMENT '计量单位',
  `DESCRIPTION` varchar(5000) DEFAULT NULL COMMENT '商品描述',
  `SHORTDESC` varchar(500) DEFAULT NULL COMMENT '简述',
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '用户名',
  `ZCOUNT` int(11) DEFAULT NULL,
  PRIMARY KEY (`GOODS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cp_goods
-- ----------------------------
INSERT INTO `cp_goods` VALUES ('284e2238d7fc4bd481c6324fc4c160cf', '蒙发护发膏', 'FHD22001', '80c376c418014643aa1a77e2462ce704', 'a129234a7c584cedbc90f2917f3c9b9c', '87e8777c1b514085a09e0f3438151b24', '<p>蒙发护发膏</p>', '蒙发护发膏', 'a1', '0');
INSERT INTO `cp_goods` VALUES ('adfd62b9bcde4474b826f92ce64f518d', '蒙发护洗发水', 'FHD22002', '80c376c418014643aa1a77e2462ce704', 'a129234a7c584cedbc90f2917f3c9b9c', '87e8777c1b514085a09e0f3438151b24', '<p><img src=\"/GAdmin/plugins/ueditor/jsp/upload1/20170305/26691488717220718.png\" title=\"QQ截图20170305203324.png\"/></p>', '蒙发护洗发水', 'a1', '0');
INSERT INTO `cp_goods` VALUES ('b27e2ba8eab74c90a1418ac341d63241', '洗发水', '225522', '8e5ed83e9fec45fb8ac7ab18f65a184d', 'bb86304a219b4e2b8e99e5fb0a6f406d', 'cbee034f4c9c4c47b097ee4ee559a67d', '<p>洗发水</p>', '洗发水', 'a2', '0');
INSERT INTO `cp_goods` VALUES ('f0eb6f8cbebc453da88a8c2e1625c9f3', '潘婷护法乳', 'FHD22003', '95a3946f4be247ecab2979ae90833a76', 'bde3e3e047804bc9a3e8860021209e72', 'abbb90a0b5624157a0593e2326d92720', '<p>潘婷护法乳</p>', '潘婷护法乳', 'a1', '88');

-- ----------------------------
-- Table structure for `cp_spbrand`
-- ----------------------------
DROP TABLE IF EXISTS `cp_spbrand`;
CREATE TABLE `cp_spbrand` (
  `SPBRAND_ID` varchar(100) NOT NULL,
  `NAME` varchar(50) DEFAULT NULL COMMENT '品牌管理',
  `BZ` varchar(1000) DEFAULT NULL COMMENT '备注',
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`SPBRAND_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cp_spbrand
-- ----------------------------
INSERT INTO `cp_spbrand` VALUES ('a129234a7c584cedbc90f2917f3c9b9c', '蒙发', '蒙发', 'a1');
INSERT INTO `cp_spbrand` VALUES ('bb86304a219b4e2b8e99e5fb0a6f406d', '潘婷', '潘婷', 'a2');
INSERT INTO `cp_spbrand` VALUES ('bde3e3e047804bc9a3e8860021209e72', '潘婷', '潘婷', 'a1');

-- ----------------------------
-- Table structure for `cp_sptype`
-- ----------------------------
DROP TABLE IF EXISTS `cp_sptype`;
CREATE TABLE `cp_sptype` (
  `SPTYPE_ID` varchar(100) NOT NULL,
  `NAME` varchar(50) DEFAULT NULL COMMENT '商品类别',
  `BZ` varchar(1000) DEFAULT NULL COMMENT '备注',
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`SPTYPE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cp_sptype
-- ----------------------------
INSERT INTO `cp_sptype` VALUES ('80c376c418014643aa1a77e2462ce704', '养发系类', '养发系类', 'a1');
INSERT INTO `cp_sptype` VALUES ('8e5ed83e9fec45fb8ac7ab18f65a184d', '洗发', '洗发', 'a2');
INSERT INTO `cp_sptype` VALUES ('95a3946f4be247ecab2979ae90833a76', '护法系列', '护法系列', 'a1');

-- ----------------------------
-- Table structure for `cp_spunit`
-- ----------------------------
DROP TABLE IF EXISTS `cp_spunit`;
CREATE TABLE `cp_spunit` (
  `SPUNIT_ID` varchar(100) NOT NULL,
  `NAME` varchar(50) DEFAULT NULL COMMENT '计量单位',
  `BZ` varchar(1000) DEFAULT NULL COMMENT '备注',
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`SPUNIT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cp_spunit
-- ----------------------------
INSERT INTO `cp_spunit` VALUES ('87e8777c1b514085a09e0f3438151b24', '盒', '盒', 'a1');
INSERT INTO `cp_spunit` VALUES ('abbb90a0b5624157a0593e2326d92720', '瓶', '瓶', 'a1');
INSERT INTO `cp_spunit` VALUES ('cbee034f4c9c4c47b097ee4ee559a67d', '瓶', '瓶', 'a2');

-- ----------------------------
-- Table structure for `db_fhdb`
-- ----------------------------
DROP TABLE IF EXISTS `db_fhdb`;
CREATE TABLE `db_fhdb` (
  `FHDB_ID` varchar(100) NOT NULL,
  `USERNAME` varchar(50) DEFAULT NULL COMMENT '操作用户',
  `BACKUP_TIME` varchar(32) DEFAULT NULL COMMENT '备份时间',
  `TABLENAME` varchar(50) DEFAULT NULL COMMENT '表名',
  `SQLPATH` varchar(300) DEFAULT NULL COMMENT '存储位置',
  `TYPE` int(1) NOT NULL COMMENT '类型',
  `DBSIZE` varchar(10) DEFAULT NULL COMMENT '文件大小',
  `BZ` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`FHDB_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of db_fhdb
-- ----------------------------

-- ----------------------------
-- Table structure for `db_timingbackup`
-- ----------------------------
DROP TABLE IF EXISTS `db_timingbackup`;
CREATE TABLE `db_timingbackup` (
  `TIMINGBACKUP_ID` varchar(100) NOT NULL,
  `JOBNAME` varchar(50) DEFAULT NULL COMMENT '任务名称',
  `CREATE_TIME` varchar(32) DEFAULT NULL COMMENT '创建时间',
  `TABLENAME` varchar(50) DEFAULT NULL COMMENT '表名',
  `STATUS` int(1) NOT NULL COMMENT '类型',
  `FHTIME` varchar(30) DEFAULT NULL COMMENT '时间规则',
  `TIMEEXPLAIN` varchar(100) DEFAULT NULL COMMENT '规则说明',
  `BZ` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`TIMINGBACKUP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of db_timingbackup
-- ----------------------------

-- ----------------------------
-- Table structure for `erp_customer`
-- ----------------------------
DROP TABLE IF EXISTS `erp_customer`;
CREATE TABLE `erp_customer` (
  `CUSTOMER_ID` varchar(100) NOT NULL,
  `NAME` varchar(100) DEFAULT NULL COMMENT '姓名',
  `AGE` varchar(10) DEFAULT NULL COMMENT '年龄',
  `PHONE` varchar(100) DEFAULT NULL COMMENT '手机',
  `ADDRESS` varchar(1000) DEFAULT NULL COMMENT '地址',
  `QQ` varchar(100) DEFAULT NULL COMMENT 'QQ',
  `WEIXIN` varchar(100) DEFAULT NULL COMMENT '微信',
  `CTIME` varchar(32) DEFAULT NULL COMMENT '建档时间',
  `MONEY` int(11) DEFAULT NULL COMMENT '消费金额',
  `LEVEL` varchar(100) DEFAULT NULL COMMENT '级别',
  `REMARKS1` varchar(1000) DEFAULT NULL COMMENT '备注1',
  `REMARKS2` varchar(1000) DEFAULT NULL COMMENT '备注2',
  `USERNAME` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CUSTOMER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of erp_customer
-- ----------------------------
INSERT INTO `erp_customer` VALUES ('884a84021c2d45f4b09872f226bcaaa5', '葛优', '55', '13666666666', '北京', '555555', '555555', '2017-03-04 23:51:20', '5588', '1a1b2fbf64864e78854fe04aee748acc', '脱发比较严重', '说', 'a2');
INSERT INTO `erp_customer` VALUES ('a16795fc5eb74d46b155791d14715a8a', '张三', '32', '13233333333', '历城区', '1235689', '1235689', '2017-03-04 15:11:43', '500', '56d7c5a4397c42b5bc3989d6dd46eec3', '脱发严重', '111', 'a1');
INSERT INTO `erp_customer` VALUES ('efb91a8c84dd42a09442ae6b56067b3d', '王五', '55', '13555555555', '济南', '313596790', '313596790', '2017-03-05 20:41:01', '500', '50141667fca64083819a37453fd27e49', '中等脱发', 's', 'a1');

-- ----------------------------
-- Table structure for `erp_customerimg`
-- ----------------------------
DROP TABLE IF EXISTS `erp_customerimg`;
CREATE TABLE `erp_customerimg` (
  `CUSTOMERIMG_ID` varchar(100) NOT NULL,
  `CDESCRIPTION` varchar(3000) DEFAULT NULL COMMENT '描述',
  `CTIME` varchar(32) DEFAULT NULL COMMENT '记录日期',
  `CUSTOMER_ID` varchar(100) DEFAULT NULL COMMENT '商户ID',
  PRIMARY KEY (`CUSTOMERIMG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of erp_customerimg
-- ----------------------------

-- ----------------------------
-- Table structure for `erp_intoku`
-- ----------------------------
DROP TABLE IF EXISTS `erp_intoku`;
CREATE TABLE `erp_intoku` (
  `INTOKU_ID` varchar(100) NOT NULL,
  `GOODS_ID` varchar(100) DEFAULT NULL COMMENT '商品ID',
  `INCOUNT` int(11) NOT NULL COMMENT '数量',
  `PRICE` double(11,2) DEFAULT NULL COMMENT '单价',
  `ZPRICE` double(11,2) DEFAULT NULL COMMENT '总价',
  `INTIME` varchar(32) DEFAULT NULL COMMENT '入库时间',
  `BZ` varchar(255) DEFAULT NULL COMMENT '备注',
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '用户名',
  `GOODS_NAME` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`INTOKU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of erp_intoku
-- ----------------------------
INSERT INTO `erp_intoku` VALUES ('dddb8a9e6bfc4b07bb9b5b4084416657', 'f0eb6f8cbebc453da88a8c2e1625c9f3', '100', '50.00', '5000.00', '2018-08-18 19:01:26', '从老王那进的', 'a1', '潘婷护法乳');

-- ----------------------------
-- Table structure for `erp_level`
-- ----------------------------
DROP TABLE IF EXISTS `erp_level`;
CREATE TABLE `erp_level` (
  `LEVEL_ID` varchar(100) NOT NULL,
  `TITLE` varchar(100) DEFAULT NULL COMMENT '级别',
  `USERNAME` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`LEVEL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of erp_level
-- ----------------------------
INSERT INTO `erp_level` VALUES ('1a1b2fbf64864e78854fe04aee748acc', '大客户', 'a2');
INSERT INTO `erp_level` VALUES ('50141667fca64083819a37453fd27e49', '重要客户', 'a1');
INSERT INTO `erp_level` VALUES ('56d7c5a4397c42b5bc3989d6dd46eec3', '潜在客户', 'a1');
INSERT INTO `erp_level` VALUES ('bcdbb5af953f4472915a2644d42f2ce9', '流动客户', 'a1');

-- ----------------------------
-- Table structure for `erp_outku`
-- ----------------------------
DROP TABLE IF EXISTS `erp_outku`;
CREATE TABLE `erp_outku` (
  `OUTKU_ID` varchar(100) NOT NULL,
  `GOODS_ID` varchar(100) DEFAULT NULL COMMENT '商品ID',
  `INCOUNT` int(11) NOT NULL COMMENT '数量',
  `PRICE` double(11,2) DEFAULT NULL COMMENT '单价',
  `ZPRICE` double(11,2) DEFAULT NULL COMMENT '总价',
  `OUTTIME` varchar(32) DEFAULT NULL COMMENT '出库时间',
  `GOODS_NAME` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '用户名',
  `BZ` text,
  `CUSTOMER_ID` varchar(100) DEFAULT NULL,
  `CUSTOMER_NAME` varchar(100) DEFAULT NULL,
  `ORDER_NUMBER` varchar(32) DEFAULT NULL,
  `ORDER_NUMBERS` varchar(32) DEFAULT NULL,
  `OUTDATE` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`OUTKU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of erp_outku
-- ----------------------------
INSERT INTO `erp_outku` VALUES ('a6ee7e3a5036464db3dbcf60bb4675f0', 'f0eb6f8cbebc453da88a8c2e1625c9f3', '12', '65.00', '780.00', '2018-08-18 19:01:47', '潘婷护法乳', 'a1', '', 'efb91a8c84dd42a09442ae6b56067b3d', '王五', 'D20180818190147639904', 'ZD20180818190132147782', '2018-08-18');

-- ----------------------------
-- Table structure for `erp_outku_temp`
-- ----------------------------
DROP TABLE IF EXISTS `erp_outku_temp`;
CREATE TABLE `erp_outku_temp` (
  `OUTKU_ID` varchar(100) NOT NULL,
  `GOODS_ID` varchar(100) DEFAULT NULL COMMENT '商品ID',
  `INCOUNT` int(11) NOT NULL COMMENT '数量',
  `PRICE` double(11,2) DEFAULT NULL COMMENT '单价',
  `ZPRICE` double(11,2) DEFAULT NULL COMMENT '总价',
  `OUTTIME` varchar(32) DEFAULT NULL COMMENT '出库时间',
  `GOODS_NAME` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '用户名',
  `BZ` text,
  `CUSTOMER_ID` varchar(100) DEFAULT NULL,
  `CUSTOMER_NAME` varchar(100) DEFAULT NULL,
  `ORDER_NUMBER` varchar(32) DEFAULT NULL,
  `ORDER_NUMBERS` varchar(32) DEFAULT NULL,
  `OUTDATE` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`OUTKU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of erp_outku_temp
-- ----------------------------
INSERT INTO `erp_outku_temp` VALUES ('a6ee7e3a5036464db3dbcf60bb4675f0', 'f0eb6f8cbebc453da88a8c2e1625c9f3', '12', '65.00', '780.00', '2018-08-18 19:01:47', '潘婷护法乳', 'a1', '', 'efb91a8c84dd42a09442ae6b56067b3d', '王五', 'D20180818190147639904', 'ZD20180818190132147782', '2018-08-18');

-- ----------------------------
-- Table structure for `erp_remarks`
-- ----------------------------
DROP TABLE IF EXISTS `erp_remarks`;
CREATE TABLE `erp_remarks` (
  `REMARKS_ID` varchar(100) NOT NULL,
  `REMARKS` varchar(1000) DEFAULT NULL COMMENT '备注',
  `USERNAME` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`REMARKS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of erp_remarks
-- ----------------------------
INSERT INTO `erp_remarks` VALUES ('295926172a884b28ad9adf454137d6eb', '中等脱发', 'a1');
INSERT INTO `erp_remarks` VALUES ('b74fa2d77faf4aaca1f0ba64927e6335', '轻微脱发', 'a1');
INSERT INTO `erp_remarks` VALUES ('cb070bac61cf46c3a1e2790a8483c1e1', '脱发严重', 'a1');
INSERT INTO `erp_remarks` VALUES ('fa51fc07acb1405e9e6e3c106095d7a6', '脱发比较严重', 'a2');

-- ----------------------------
-- Table structure for `im_fgroup`
-- ----------------------------
DROP TABLE IF EXISTS `im_fgroup`;
CREATE TABLE `im_fgroup` (
  `FGROUP_ID` varchar(100) NOT NULL,
  `NAME` varchar(255) DEFAULT NULL COMMENT '组名',
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`FGROUP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_fgroup
-- ----------------------------
INSERT INTO `im_fgroup` VALUES ('5929f3be21724980bf9707dc93cf0ded', '合作伙伴', 'admin');
INSERT INTO `im_fgroup` VALUES ('82a63a6e33794dfea739f49d07695749', '合作伙伴', 'a0');
INSERT INTO `im_fgroup` VALUES ('a9d49809365449c795806231965db682', '合作伙伴', 'a1');
INSERT INTO `im_fgroup` VALUES ('c33360be48f342abaf9d974b575540a8', '合作伙伴', 'a2');

-- ----------------------------
-- Table structure for `im_friends`
-- ----------------------------
DROP TABLE IF EXISTS `im_friends`;
CREATE TABLE `im_friends` (
  `FRIENDS_ID` varchar(100) NOT NULL,
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '用户名',
  `FUSERNAME` varchar(100) DEFAULT NULL COMMENT '好友用户名',
  `CTIME` varchar(32) DEFAULT NULL COMMENT '添加时间',
  `ALLOW` varchar(10) DEFAULT NULL COMMENT '是否允许',
  `FGROUP_ID` varchar(100) DEFAULT NULL,
  `DTIME` varchar(32) DEFAULT NULL,
  `BZ` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`FRIENDS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_friends
-- ----------------------------
INSERT INTO `im_friends` VALUES ('507a7726064945669db104297f7a5029', 'admin', 'a1', '2018-08-06 01:19:26', 'yes', '5929f3be21724980bf9707dc93cf0ded', '2018-08-06 01:19:46', '');
INSERT INTO `im_friends` VALUES ('76d5e08aa30a48bd970c1339d84a94ae', 'admin', 'a0', '2018-08-05 15:47:13', 'yes', '5929f3be21724980bf9707dc93cf0ded', '2018-08-05 15:47:17', '');
INSERT INTO `im_friends` VALUES ('908c052e91374a39a074206cbef05b74', 'admin', 'a2', '2018-08-06 01:19:25', 'yes', '5929f3be21724980bf9707dc93cf0ded', '2018-08-06 01:19:34', '');
INSERT INTO `im_friends` VALUES ('b603a23312094c409345b23051e8acaf', 'a0', 'admin', '2018-08-05 15:47:17', 'yes', '82a63a6e33794dfea739f49d07695749', '2018-08-05 15:47:17', '同意对方申请好友并加对方好友');
INSERT INTO `im_friends` VALUES ('dfb4b483ec8444a2942713d18e100807', 'a2', 'admin', '2018-08-06 01:19:34', 'yes', 'c33360be48f342abaf9d974b575540a8', '2018-08-06 01:19:34', '同意对方申请好友并加对方好友');
INSERT INTO `im_friends` VALUES ('fce81944fa6e4a1baa02c4aaba686fb2', 'a1', 'admin', '2018-08-06 01:19:46', 'yes', 'a9d49809365449c795806231965db682', '2018-08-06 01:19:46', '同意对方申请好友并加对方好友');

-- ----------------------------
-- Table structure for `im_hismsg`
-- ----------------------------
DROP TABLE IF EXISTS `im_hismsg`;
CREATE TABLE `im_hismsg` (
  `HISMSG_ID` varchar(100) NOT NULL,
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '发送者',
  `TOID` varchar(100) DEFAULT NULL COMMENT '目标(好友或者群)',
  `TYPE` varchar(30) DEFAULT NULL COMMENT '类型',
  `NAME` varchar(100) DEFAULT NULL COMMENT '发送者姓名',
  `PHOTO` varchar(255) DEFAULT NULL COMMENT '发送者头像',
  `CTIME` varchar(100) DEFAULT NULL COMMENT '发送时间',
  `CONTENT` varchar(255) DEFAULT NULL COMMENT '发送消息内容',
  `DREAD` varchar(10) DEFAULT NULL COMMENT '是否已读',
  `OWNER` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`HISMSG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_hismsg
-- ----------------------------
INSERT INTO `im_hismsg` VALUES ('65d12798876e4d82a29b8f4ae1ab788e', 'admin', 'a0', 'friend', 'FH', 'static/ace/avatars/user.jpg', '2018-08-05 15:37:14', '你好', '1', 'a0');
INSERT INTO `im_hismsg` VALUES ('c69ca1a804da4f02acfd7d138bcd1d62', 'admin', 'a0', 'friend', 'FH', 'static/ace/avatars/user.jpg', '2018-08-05 15:37:14', '你好', '1', 'admin');

-- ----------------------------
-- Table structure for `im_imstate`
-- ----------------------------
DROP TABLE IF EXISTS `im_imstate`;
CREATE TABLE `im_imstate` (
  `IMSTATE_ID` varchar(100) NOT NULL,
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '用户名',
  `ONLINE` varchar(10) DEFAULT NULL COMMENT '在线',
  `AUTOGRAPH` varchar(255) DEFAULT NULL COMMENT '个性签名',
  `SIGN` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`IMSTATE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_imstate
-- ----------------------------

-- ----------------------------
-- Table structure for `im_iqgroup`
-- ----------------------------
DROP TABLE IF EXISTS `im_iqgroup`;
CREATE TABLE `im_iqgroup` (
  `IQGROUP_ID` varchar(100) NOT NULL,
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '用户名',
  `QGROUPS` longtext COMMENT '群的ID组合',
  PRIMARY KEY (`IQGROUP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_iqgroup
-- ----------------------------

-- ----------------------------
-- Table structure for `im_qgroup`
-- ----------------------------
DROP TABLE IF EXISTS `im_qgroup`;
CREATE TABLE `im_qgroup` (
  `QGROUP_ID` varchar(100) NOT NULL,
  `NAME` varchar(255) DEFAULT NULL COMMENT '群名称',
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '群主',
  `PHOTO` varchar(255) DEFAULT NULL COMMENT '群头像',
  `CTIME` varchar(32) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`QGROUP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_qgroup
-- ----------------------------

-- ----------------------------
-- Table structure for `im_sysmsg`
-- ----------------------------
DROP TABLE IF EXISTS `im_sysmsg`;
CREATE TABLE `im_sysmsg` (
  `SYSMSG_ID` varchar(100) NOT NULL,
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '接收者用户名',
  `FROMUSERNAME` varchar(100) DEFAULT NULL COMMENT '发送者用户名',
  `CTIME` varchar(32) DEFAULT NULL COMMENT '操作时间',
  `REMARK` varchar(255) DEFAULT NULL COMMENT '留言',
  `TYPE` varchar(50) DEFAULT NULL COMMENT '类型',
  `CONTENT` varchar(100) DEFAULT NULL COMMENT '事件内容',
  `ISDONE` varchar(30) DEFAULT NULL COMMENT '是否完成',
  `DTIME` varchar(32) DEFAULT NULL COMMENT '完成时间',
  `QGROUP_ID` varchar(100) DEFAULT NULL,
  `DREAD` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`SYSMSG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_sysmsg
-- ----------------------------
INSERT INTO `im_sysmsg` VALUES ('3ab6988f1d7945e89e8977ce81513e65', 'a1', 'admin', '2018-08-06 01:19:26', '', 'friend', '您同意了管理员申请好友并加对方好友', 'yes', '2018-08-06 01:19:46', '', '1');
INSERT INTO `im_sysmsg` VALUES ('535a1c11a2624d66add04103eef89aa8', 'admin', 'a0', '2018-08-05 15:47:17', '', 'friend', '总管 已经同意你的好友申请', 'yes', '2018-08-05 15:47:17', '', '1');
INSERT INTO `im_sysmsg` VALUES ('53db13608b0a4ed5886f72c6adffe155', 'a0', 'admin', '2018-08-05 15:42:20', '', 'friend', '您同意了FH申请好友并加对方好友', 'yes', '2018-08-05 15:42:32', '', '1');
INSERT INTO `im_sysmsg` VALUES ('5f8ce46994b04ec6b2a9d2835af555c2', 'admin', 'a1', '2018-08-06 01:19:46', '', 'friend', '测试 已经同意你的好友申请', 'yes', '2018-08-06 01:19:46', '', '1');
INSERT INTO `im_sysmsg` VALUES ('ac4bf291777f4147b63681971f801477', 'admin', 'a2', '2018-08-06 01:19:34', '', 'friend', '李四 已经同意你的好友申请', 'yes', '2018-08-06 01:19:34', '', '1');
INSERT INTO `im_sysmsg` VALUES ('b183265315724203b1887acfb3869857', 'a0', 'admin', '2018-08-05 15:47:13', '', 'friend', '您同意了FH申请好友并加对方好友', 'yes', '2018-08-05 15:47:17', '', '1');
INSERT INTO `im_sysmsg` VALUES ('dbe342b9773d42f390eb7c172778dea7', 'a2', 'admin', '2018-08-06 01:19:25', '', 'friend', '您同意了管理员申请好友并加对方好友', 'yes', '2018-08-06 01:19:34', '', '1');

-- ----------------------------
-- Table structure for `sys_dictionaries`
-- ----------------------------
DROP TABLE IF EXISTS `sys_dictionaries`;
CREATE TABLE `sys_dictionaries` (
  `DICTIONARIES_ID` varchar(100) NOT NULL,
  `NAME` varchar(30) DEFAULT NULL COMMENT '名称',
  `NAME_EN` varchar(50) DEFAULT NULL COMMENT '英文',
  `BIANMA` varchar(50) DEFAULT NULL COMMENT '编码',
  `ORDER_BY` int(11) NOT NULL COMMENT '排序',
  `PARENT_ID` varchar(100) DEFAULT NULL COMMENT '上级ID',
  `BZ` varchar(255) DEFAULT NULL COMMENT '备注',
  `TBSNAME` varchar(100) DEFAULT NULL COMMENT '排查表',
  PRIMARY KEY (`DICTIONARIES_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_dictionaries
-- ----------------------------
INSERT INTO `sys_dictionaries` VALUES ('0193ffbfae1e49e0b7810546cada316a', '济南', 'JiNan', '0030301', '1', '10f46a521ea0471f8d71ee75ac3b5f3a', '济南', '');
INSERT INTO `sys_dictionaries` VALUES ('096e4ec8986149d994b09e604504e38d', '黄浦区', 'huangpu', '0030201', '1', 'f1ea30ddef1340609c35c88fb2919bee', '黄埔', '');
INSERT INTO `sys_dictionaries` VALUES ('10f46a521ea0471f8d71ee75ac3b5f3a', '山东', 'ShanDong', '00303', '3', 'be4a8c5182c744d28282a5345783a77f', '山东省', '');
INSERT INTO `sys_dictionaries` VALUES ('12a62a3e5bed44bba0412b7e6b733c93', '北京', 'beijing', '00301', '1', 'be4a8c5182c744d28282a5345783a77f', '北京', '');
INSERT INTO `sys_dictionaries` VALUES ('507fa87a49104c7c8cdb52fdb297da12', '宣武区', 'xuanwuqu', '0030101', '1', '12a62a3e5bed44bba0412b7e6b733c93', '宣武区', '');
INSERT INTO `sys_dictionaries` VALUES ('66f1ff79b13947da98525aff7380ef50', '高新区', 'gaoxinqu', '003030101', '1', '0193ffbfae1e49e0b7810546cada316a', '高新区', '');
INSERT INTO `sys_dictionaries` VALUES ('8994f5995f474e2dba6cfbcdfe5ea07a', '语文', 'yuwen', '00201', '1', 'fce20eb06d7b4b4d8f200eda623f725c', '语文', '');
INSERT INTO `sys_dictionaries` VALUES ('8ea7c44af25f48b993a14f791c8d689f', '分类', 'fenlei', '001', '1', '0', '分类', '');
INSERT INTO `sys_dictionaries` VALUES ('be4a8c5182c744d28282a5345783a77f', '地区', 'diqu', '003', '3', '0', '地区', '');
INSERT INTO `sys_dictionaries` VALUES ('d428594b0494476aa7338d9061e23ae3', '红色', 'red', '00101', '1', '8ea7c44af25f48b993a14f791c8d689f', '红色', '');
INSERT INTO `sys_dictionaries` VALUES ('de9afadfbed0428fa343704d6acce2c4', '绿色', 'green', '00102', '2', '8ea7c44af25f48b993a14f791c8d689f', '绿色', '');
INSERT INTO `sys_dictionaries` VALUES ('f1ea30ddef1340609c35c88fb2919bee', '上海', 'shanghai', '00302', '2', 'be4a8c5182c744d28282a5345783a77f', '上海', '');
INSERT INTO `sys_dictionaries` VALUES ('fce20eb06d7b4b4d8f200eda623f725c', '课程', 'kecheng', '002', '2', '0', '课程', '');

-- ----------------------------
-- Table structure for `sys_button`
-- ----------------------------
DROP TABLE IF EXISTS `sys_button`;
CREATE TABLE `sys_button` (
  `BUTTON_ID` varchar(100) NOT NULL,
  `NAME` varchar(30) DEFAULT NULL COMMENT '名称',
  `QX_NAME` varchar(50) DEFAULT NULL COMMENT '权限标识',
  `BZ` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`BUTTON_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_button
-- ----------------------------
INSERT INTO `sys_button` VALUES ('3542adfbda73410c976e185ffe50ad06', '导出EXCEL', 'toExcel', '导出EXCEL');
INSERT INTO `sys_button` VALUES ('46992ea280ba4b72b29dedb0d4bc0106', '发邮件', 'email', '发送电子邮件');
INSERT INTO `sys_button` VALUES ('4efa162fce8340f0bd2dcd3b11d327ec', '导入EXCEL', 'FromExcel', '导入EXCEL到系统用户');
INSERT INTO `sys_button` VALUES ('cc51b694d5344d28a9aa13c84b7166cd', '发短信', 'sms', '发送短信');
INSERT INTO `sys_button` VALUES ('da7fd386de0b49ce809984f5919022b8', '站内信', 'SMS', '发送站内信');

-- ----------------------------
-- Table structure for `sys_log`
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `LOG_ID` varchar(100) NOT NULL,
  `USERNAME` varchar(100) DEFAULT NULL COMMENT '用户名',
  `CZTIME` varchar(32) DEFAULT NULL COMMENT '操作时间',
  `CONTENT` varchar(255) DEFAULT NULL COMMENT '事件',
  PRIMARY KEY (`LOG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_log
-- ----------------------------
INSERT INTO `sys_log` VALUES ('03ace579fbe44db08bcecef699ac18ca', 'admin', '2018-08-05 15:26:32', '修改cha_qx权限，角色ID为:68f8e4a39efe47c7bb869e9d15ab925d');
INSERT INTO `sys_log` VALUES ('04c5a819a867497cbc742056eea1548e', 'admin', '2017-11-16 11:31:10', '登录系统');
INSERT INTO `sys_log` VALUES ('0683eda9410e4d16bacc6d0ae2df1e32', 'admin', '2018-08-05 15:22:45', '登录系统');
INSERT INTO `sys_log` VALUES ('09d455d7d9f5481785622c31bc4cda5d', 'admin', '2018-08-06 01:17:12', '登录系统');
INSERT INTO `sys_log` VALUES ('0afe752a40a14e5ba336413ad791f1ae', 'a1', '2018-08-05 15:28:40', '登录系统');
INSERT INTO `sys_log` VALUES ('0cc3e95b359d48938434cb12f6938633', 'admin', '2017-11-16 11:33:49', '登录系统');
INSERT INTO `sys_log` VALUES ('0f6811603b1845d293a0bea3de01ee54', 'a0', '2018-01-12 00:47:16', '退出');
INSERT INTO `sys_log` VALUES ('1141cb3fce18447e95a06d7eea975592', 'admin', '2018-08-05 15:46:45', '退出');
INSERT INTO `sys_log` VALUES ('1373ab16524b4ee392bc262861171d64', 'a1', '2017-11-16 11:30:24', '退出');
INSERT INTO `sys_log` VALUES ('1749a13d17a44d66a212484ab3ee8182', 'a1', '2017-11-16 11:24:39', '退出');
INSERT INTO `sys_log` VALUES ('197e9e1d294b4a4eaf7b22d8942e6e00', 'a0', '2018-01-12 00:47:07', '登录系统');
INSERT INTO `sys_log` VALUES ('1b6e5bf747574569b482bdb7ab8e1611', 'admin', '2018-08-05 15:46:54', '登录系统');
INSERT INTO `sys_log` VALUES ('1dddaae588de41808ad45c673b6f41d2', 'a1', '2017-11-16 11:25:22', '登录系统');
INSERT INTO `sys_log` VALUES ('250085e698624bd5aa7298d9de3be290', 'a1', '2017-11-16 11:34:23', '登录系统');
INSERT INTO `sys_log` VALUES ('25507334821a416487b337d6f1c81109', 'a1', '2018-06-28 21:04:47', '登录系统');
INSERT INTO `sys_log` VALUES ('2602f1f42f1449d5be11957ddca9df41', 'admin', '2018-08-05 15:26:12', '修改cha_qx权限，角色ID为:3264c8e83d0248bb9e3ea6195b4c0216');
INSERT INTO `sys_log` VALUES ('267a5547ea974577a2459a8068df84f7', 'admin', '2018-08-06 01:17:58', '修改系统用户：admin');
INSERT INTO `sys_log` VALUES ('27b3378a3d3a46e88037623254493ba5', 'admin', '2018-08-05 15:24:14', '修改菜单库存管理');
INSERT INTO `sys_log` VALUES ('2ba7b6de4cc845058f11cb2c9c2891c7', 'a1', '2018-01-12 00:45:04', '登录系统');
INSERT INTO `sys_log` VALUES ('2cef840a41a64ad99af8809da115d704', 'admin', '2018-08-05 15:26:22', '修改add_qx权限，角色ID为:68f8e4a39efe47c7bb869e9d15ab925d');
INSERT INTO `sys_log` VALUES ('2e297ee6fb72498b9a10429c1efe986b', 'admin', '2018-08-05 15:26:15', '修改del_qx权限，角色ID为:3264c8e83d0248bb9e3ea6195b4c0216');
INSERT INTO `sys_log` VALUES ('2e877089406d4dcba31bb4294057da94', 'admin', '2017-11-16 11:24:05', '退出');
INSERT INTO `sys_log` VALUES ('3183ebd1eee64edb9551fa1da2e4ea9e', 'admin', '2018-01-12 00:39:17', '登录系统');
INSERT INTO `sys_log` VALUES ('31944d7a053e47a2b31c7cfa86291291', 'admin', '2017-11-16 11:28:27', '退出');
INSERT INTO `sys_log` VALUES ('347285015ac049c798ce92e36bbeace9', 'a1', '2018-06-28 01:48:14', '登录系统');
INSERT INTO `sys_log` VALUES ('3dbf6a003bb94661990841909d22aeac', 'admin', '2018-08-05 15:26:01', '修改角色菜单权限，角色ID为:68f8e4a39efe47c7bb869e9d15ab925d');
INSERT INTO `sys_log` VALUES ('3f86611bda104f70bf559b0a97cadd57', 'admin', '2018-08-05 15:25:07', '新增菜单好友分组');
INSERT INTO `sys_log` VALUES ('401dfa96e67d4f99a201fce205608b88', 'admin', '2018-01-12 00:46:59', '退出');
INSERT INTO `sys_log` VALUES ('406a518e98e74d1ea489e36e0ee7846b', 'a1', '2018-06-29 00:46:14', '登录系统');
INSERT INTO `sys_log` VALUES ('46642a45dbed47f1b49a9c9f94608e80', 'admin', '2018-08-05 15:24:06', '修改菜单客户管理');
INSERT INTO `sys_log` VALUES ('4999274425334d7183b5038a953c03d5', 'admin', '2018-08-05 15:25:35', '新增菜单我的群组');
INSERT INTO `sys_log` VALUES ('4a430acfe7db4c6b80839bf837ee2501', 'a1', '2018-08-06 01:18:39', '登录系统');
INSERT INTO `sys_log` VALUES ('4adf48e40c44459c90e12dd9f8b0670a', 'admin', '2017-11-16 11:31:31', '退出');
INSERT INTO `sys_log` VALUES ('4ccfd26f40a9410993f260ac523bea07', 'admin', '2017-11-16 11:34:15', '退出');
INSERT INTO `sys_log` VALUES ('4f066788e3004d9db5934651d7d30a3e', 'a1', '2018-06-28 02:06:31', '登录系统');
INSERT INTO `sys_log` VALUES ('516812daf6944ce99bfc90c107d955a5', 'a1', '2018-06-26 02:17:07', '登录系统');
INSERT INTO `sys_log` VALUES ('55a45302cb474ccb8563f7465161c132', 'a1', '2017-12-31 10:24:12', '登录系统');
INSERT INTO `sys_log` VALUES ('580ae9161b1b40739971d9ed1525b7f5', 'a1', '2018-01-12 00:47:22', '登录系统');
INSERT INTO `sys_log` VALUES ('5abf4bdfb3cf4f6093a6e401c3e652e5', 'admin', '2018-08-05 15:26:49', '退出');
INSERT INTO `sys_log` VALUES ('603b2ee72a1c4fd49606d1930b977fd8', 'admin', '2018-08-05 15:28:14', '退出');
INSERT INTO `sys_log` VALUES ('66c22c4255b548969f29a3d224a84bf1', 'a2', '2018-08-06 01:19:08', '登录系统');
INSERT INTO `sys_log` VALUES ('66d7509efe0c4dbbb8e75a0f48aa4e7a', 'a1', '2018-06-29 02:58:46', '登录系统');
INSERT INTO `sys_log` VALUES ('69ca7b4a26b94a6b9f76c9c00a2900f5', 'a2', '2018-08-05 15:29:10', '登录系统');
INSERT INTO `sys_log` VALUES ('6ae731b5df8848aba6b5f2ebe3b3aeae', 'a1', '2018-06-29 01:43:00', '登录系统');
INSERT INTO `sys_log` VALUES ('6e48e215ea5b4655882147ac0c0ac062', 'a1', '2018-06-26 00:13:37', '登录系统');
INSERT INTO `sys_log` VALUES ('720fb59c09a1491d9e083896e65c3424', 'a1', '2017-12-15 14:01:21', '登录系统');
INSERT INTO `sys_log` VALUES ('7b26cf55336a4048838736754b50391c', 'a1', '2018-06-28 20:17:50', '登录系统');
INSERT INTO `sys_log` VALUES ('7c78b8e773f349079c7d1edbcf8325fa', 'admin', '2018-08-05 15:26:28', '修改edit_qx权限，角色ID为:68f8e4a39efe47c7bb869e9d15ab925d');
INSERT INTO `sys_log` VALUES ('7d10ea913b66433488c428e97874256d', 'admin', '2018-08-05 15:25:54', '修改角色菜单权限，角色ID为:3264c8e83d0248bb9e3ea6195b4c0216');
INSERT INTO `sys_log` VALUES ('7e483eeec3604fefac651ccf98ab39d2', 'a1', '2018-06-28 18:37:40', '登录系统');
INSERT INTO `sys_log` VALUES ('7f5f71586103400d84272a04046f1e68', 'admin', '2018-08-05 15:36:32', '登录系统');
INSERT INTO `sys_log` VALUES ('7f790a7664fd4fc5ba2101b6c8800380', 'admin', '2017-12-05 15:13:12', '退出');
INSERT INTO `sys_log` VALUES ('7fe05910146a4428b7cc576b0f987695', 'admin', '2018-08-05 15:24:10', '修改菜单商品管理');
INSERT INTO `sys_log` VALUES ('8003a6d044934bdbbbc915b3b10eb54e', 'admin', '2018-08-05 15:34:14', '登录系统');
INSERT INTO `sys_log` VALUES ('81aa055c97c041ecb29db2a5e0489e4f', 'admin', '2018-08-05 15:24:50', '新增菜单好友管理');
INSERT INTO `sys_log` VALUES ('8867a456e5db446997e2900accf2029b', 'admin', '2018-08-05 15:29:39', '登录系统');
INSERT INTO `sys_log` VALUES ('8cd34cc8587545038042c71079e6aef3', 'a1', '2017-12-05 11:26:56', '登录系统');
INSERT INTO `sys_log` VALUES ('949ccd4009b44b0e8d05c1a5255f3d43', 'admin', '2018-01-12 00:39:02', '登录系统');
INSERT INTO `sys_log` VALUES ('960626acaca64d018332eed3b73d298c', 'a1', '2017-11-16 11:35:37', '登录系统');
INSERT INTO `sys_log` VALUES ('96c1926a993647fbbf0d61da953f2f07', 'admin', '2017-11-16 11:32:35', '登录系统');
INSERT INTO `sys_log` VALUES ('97f31a51f8be443a86af4ffcbfca3ade', 'a1', '2017-11-16 11:28:37', '登录系统');
INSERT INTO `sys_log` VALUES ('99ff0d51b23741219696d7df10bbac17', 'a1', '2017-11-16 11:36:29', '登录系统');
INSERT INTO `sys_log` VALUES ('9b7a10ca736949249caf3f13a48af1f5', 'admin', '2017-11-16 11:31:06', '退出');
INSERT INTO `sys_log` VALUES ('9bab7ec7d82b4d04ac814e1bf00d9e1c', 'a1', '2018-06-29 19:09:51', '登录系统');
INSERT INTO `sys_log` VALUES ('9d17475b31e745d283a6f0bb27170166', 'admin', '2017-11-16 11:27:36', '登录系统');
INSERT INTO `sys_log` VALUES ('9dd38d298ee448ac928244cf8432a01c', 'a1', '2018-07-01 23:07:50', '登录系统');
INSERT INTO `sys_log` VALUES ('9dfced4056494e07a1de8c496fa09c1a', 'a1', '2017-11-16 11:33:18', '退出');
INSERT INTO `sys_log` VALUES ('9e457a9980bd4efcb09fcfe3f242f6e3', 'admin', '2018-08-05 15:24:28', '新增菜单我的通讯');
INSERT INTO `sys_log` VALUES ('a038cc0117464872bc38979b5cd1a57f', 'a0', '2018-08-05 15:46:49', '退出');
INSERT INTO `sys_log` VALUES ('a4bfd5b5b3574c7a859e6fff89dcd8de', 'a1', '2018-01-12 00:45:12', '退出');
INSERT INTO `sys_log` VALUES ('ab93df6acae44a85822d272dcb207b6f', 'admin', '2017-12-05 15:13:04', '登录系统');
INSERT INTO `sys_log` VALUES ('b0783ef2a0fc4bdbaaba6775751e3ab0', 'a0', '2018-06-26 00:13:30', '退出');
INSERT INTO `sys_log` VALUES ('b91d9f0140d24e5ea0e681e33c39936a', 'a1', '2018-08-18 18:56:41', '登录系统');
INSERT INTO `sys_log` VALUES ('bc1050e10b934de591328cb8275c11fe', 'a1', '2017-11-16 11:31:44', '登录系统');
INSERT INTO `sys_log` VALUES ('bcc2f3d9c0344164a410efe170c9ea83', 'a0', '2018-06-26 00:13:21', '登录系统');
INSERT INTO `sys_log` VALUES ('bce5bb802e4f4e5092d4abd3874928cb', 'a1', '2018-06-29 00:26:49', '登录系统');
INSERT INTO `sys_log` VALUES ('bdf8616f53ab40b192384675bec97a78', 'admin', '2017-11-16 11:36:25', '退出');
INSERT INTO `sys_log` VALUES ('c116e4077c9c44138a6d8353213d8afb', 'a0', '2018-08-05 15:37:01', '登录系统');
INSERT INTO `sys_log` VALUES ('c1527e1ea3c84093abe403a05ad22799', 'a1', '2017-12-05 15:13:18', '登录系统');
INSERT INTO `sys_log` VALUES ('c187485d4ac346888801732071fb2ef9', 'a1', '2017-11-16 11:27:29', '退出');
INSERT INTO `sys_log` VALUES ('c19913af25094397b63aa2bce3388a54', 'a1', '2018-06-29 01:19:51', '登录系统');
INSERT INTO `sys_log` VALUES ('c27893b9bbe8437792eb56bf0c91fbc1', 'a1', '2018-06-28 00:31:37', '登录系统');
INSERT INTO `sys_log` VALUES ('c2d7c8b00b9949109351524dcd2755ee', 'admin', '2017-11-16 11:32:59', '退出');
INSERT INTO `sys_log` VALUES ('c46fd1a6253343aa860caa82b6d3fae9', 'a1', '2017-11-16 11:32:27', '退出');
INSERT INTO `sys_log` VALUES ('c54fc08a9a6a49799e0d7f06e1fdd6d3', 'admin', '2018-08-05 15:24:01', '修改菜单数据库管理');
INSERT INTO `sys_log` VALUES ('c8c1e9f6ca5940c88399b9b769be747b', 'dmin', '2017-11-16 11:33:37', '登录系统密码或用户名错误');
INSERT INTO `sys_log` VALUES ('ccaf4f3bb51e4326bdfd150457a8598f', 'admin', '2017-11-16 11:30:43', '登录系统');
INSERT INTO `sys_log` VALUES ('ccb47cbaf1a946869e1aa2229348c29d', 'admin', '2018-08-05 15:26:54', '登录系统');
INSERT INTO `sys_log` VALUES ('cdee8f242911490a9de3d8f2dc26a7da', 'a1', '2018-06-29 02:22:05', '登录系统');
INSERT INTO `sys_log` VALUES ('cfa0abd9c7b147d6a44cef38460b7c01', 'a0', '2018-08-06 01:17:38', '登录系统');
INSERT INTO `sys_log` VALUES ('d3b1a7df5a7249c6a5a595847c8b0864', 'admin', '2017-11-16 11:23:54', '登录系统');
INSERT INTO `sys_log` VALUES ('d5b8285def0c430ebc33591ae0222a4b', 'admin', '2018-08-05 15:23:35', '修改菜单信息管理');
INSERT INTO `sys_log` VALUES ('d5dedb78ac9b4654a3f73ba6aa020bda', 'a1', '2018-08-18 17:29:55', '登录系统');
INSERT INTO `sys_log` VALUES ('dd27096315ca48839d3e5cd91e4f6368', 'a1', '2017-11-16 11:35:22', '退出');
INSERT INTO `sys_log` VALUES ('e528e117520148a29d8281b6580c82aa', 'admin', '2018-08-14 15:21:53', '登录系统');
INSERT INTO `sys_log` VALUES ('e589d8ef0c034a8089e1e8371936eb48', 'a1', '2017-12-02 20:02:56', '登录系统');
INSERT INTO `sys_log` VALUES ('e5974cb359de490a878801294ac868f9', 'a1', '2017-11-16 11:24:11', '登录系统');
INSERT INTO `sys_log` VALUES ('e7968d23f4e5411db7742d13431390f9', 'admin', '2018-01-12 00:39:13', '退出');
INSERT INTO `sys_log` VALUES ('e8de6d0e8486423e8dd8bca40fd08f04', 'a1', '2018-06-28 02:08:02', '登录系统');
INSERT INTO `sys_log` VALUES ('e8df702a9ea84940ac9eef178d65d6a8', 'admin', '2018-08-05 15:26:25', '修改del_qx权限，角色ID为:68f8e4a39efe47c7bb869e9d15ab925d');
INSERT INTO `sys_log` VALUES ('eb86c295b84048bcaf4697b95425d3e5', 'admin', '2018-08-05 15:25:49', '修改角色菜单权限，角色ID为:1');
INSERT INTO `sys_log` VALUES ('ebccdc2f9afa495e9623c58f2d078ae3', 'a0', '2018-08-05 15:28:23', '登录系统');
INSERT INTO `sys_log` VALUES ('f1a544d50aa1415686fb6ad66aa185cb', 'admin', '2018-08-05 15:26:19', '修改add_qx权限，角色ID为:3264c8e83d0248bb9e3ea6195b4c0216');
INSERT INTO `sys_log` VALUES ('f254e95cb3f844969baa7c3866260868', 'a1', '2017-11-16 11:33:10', '登录系统');
INSERT INTO `sys_log` VALUES ('f6db96fc434541ca9e278fb1ede2a37a', 'a1', '2017-11-16 11:35:41', '退出');
INSERT INTO `sys_log` VALUES ('f9b1458e8ec143939d30c428999d4632', 'admin', '2018-08-05 15:26:04', '修改edit_qx权限，角色ID为:3264c8e83d0248bb9e3ea6195b4c0216');
INSERT INTO `sys_log` VALUES ('fdd5fc101e6947d8a26c45e09e1739e4', 'admin', '2017-11-16 11:36:12', '登录系统');
INSERT INTO `sys_log` VALUES ('ffc822e1922043d6b31c82d471b7bf84', 'a0', '2018-08-05 15:47:07', '登录系统');

-- ----------------------------
-- Table structure for `sys_sms`
-- ----------------------------
DROP TABLE IF EXISTS `sys_sms`;
CREATE TABLE `sys_sms` (
  `SMS_ID` varchar(100) NOT NULL,
  `CONTENT` varchar(1000) DEFAULT NULL COMMENT '内容',
  `TYPE` varchar(5) DEFAULT NULL COMMENT '类型',
  `TO_USERNAME` varchar(255) DEFAULT NULL COMMENT '收信人',
  `FROM_USERNAME` varchar(255) DEFAULT NULL COMMENT '发信人',
  `SEND_TIME` varchar(100) DEFAULT NULL COMMENT '发信时间',
  `STATUS` varchar(5) DEFAULT NULL COMMENT '状态',
  `SANME_ID` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`SMS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_sms
-- ----------------------------
INSERT INTO `sys_sms` VALUES ('05879f5868824f35932ee9f2062adc03', '你好', '2', 'admin', 'san', '2016-01-25 14:05:31', '1', 'b311e893228f42d5a05dbe16917fd16f');
INSERT INTO `sys_sms` VALUES ('2635dd035c6f4bb5a091abdd784bd899', '你好', '2', 'san', 'admin', '2016-01-25 14:05:02', '1', '1b7637306683460f89174c2b025862b5');
INSERT INTO `sys_sms` VALUES ('3bbc59aec89c45a989f32a8d674061a2', '1', '2', 'a1', 'a2', '2017-10-28 01:52:50', '2', '95dc9576616e46ef82070c0f575a3619');
INSERT INTO `sys_sms` VALUES ('52378ccd4e2d4fe08994d1652af87c68', '你好', '1', 'admin', 'san', '2016-01-25 16:26:44', '1', '920b20dafdfb4c09b560884eb277c51d');
INSERT INTO `sys_sms` VALUES ('59e630a10b734e008b24b9b13a3e873f', 'eee', '1', 'a1', 'eee', '2017-10-28 02:03:24', '2', '49e9a3b171784675a94baf0c0a295c7c');
INSERT INTO `sys_sms` VALUES ('77ed13f9c49a4c4bb460c41b8580dd36', 'gggg', '2', 'admin', 'san', '2016-01-24 21:22:43', '2', 'dd9ee339576e48c5b046b94fa1901d00');
INSERT INTO `sys_sms` VALUES ('98a6869f942042a1a037d9d9f01cb50f', '你好', '1', 'admin', 'san', '2016-01-25 14:05:02', '1', '1b7637306683460f89174c2b025862b5');
INSERT INTO `sys_sms` VALUES ('9e00295529014b6e8a27019cbccb3da1', '柔柔弱弱', '1', 'admin', 'san', '2016-01-24 21:22:57', '1', 'a29603d613ea4e54b5678033c1bf70a6');
INSERT INTO `sys_sms` VALUES ('d3aedeb430f640359bff86cd657a8f59', '你好', '1', 'admin', 'san', '2016-01-24 21:22:12', '1', 'f022fbdce3d845aba927edb698beb90b');
INSERT INTO `sys_sms` VALUES ('e5376b1bd54b489cb7f2203632bd74ec', '管理员好', '2', 'admin', 'san', '2016-01-25 14:06:13', '2', 'b347b2034faf43c79b54be4627f3bd2b');
INSERT INTO `sys_sms` VALUES ('e5cf70d885e74382b1d5fad3d93f1424', '1', '1', 'a2', 'a1', '2017-10-28 01:52:50', '2', '95dc9576616e46ef82070c0f575a3619');
INSERT INTO `sys_sms` VALUES ('e613ac0fcc454f32895a70b747bf4fb5', '你也好', '2', 'admin', 'san', '2016-01-25 16:27:54', '2', 'ce8dc3b15afb40f28090f8b8e13f078d');
INSERT INTO `sys_sms` VALUES ('f25e00cfafe741a3a05e3839b66dc7aa', '你好', '2', 'san', 'admin', '2016-01-25 16:26:44', '1', '920b20dafdfb4c09b560884eb277c51d');

-- ----------------------------
-- Table structure for `sys_loginimg`
-- ----------------------------
DROP TABLE IF EXISTS `sys_loginimg`;
CREATE TABLE `sys_loginimg` (
  `LOGINIMG_ID` varchar(100) NOT NULL,
  `NAME` varchar(30) DEFAULT NULL COMMENT '文件名',
  `FILEPATH` varchar(100) DEFAULT NULL COMMENT '路径',
  `TYPE` int(2) NOT NULL COMMENT '状态',
  `FORDER` int(3) NOT NULL COMMENT '排序',
  PRIMARY KEY (`LOGINIMG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_loginimg
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `MENU_ID` int(11) NOT NULL,
  `MENU_NAME` varchar(255) DEFAULT NULL,
  `MENU_URL` varchar(255) DEFAULT NULL,
  `PARENT_ID` varchar(100) DEFAULT NULL,
  `MENU_ORDER` varchar(100) DEFAULT NULL,
  `MENU_ICON` varchar(60) DEFAULT NULL,
  `MENU_TYPE` varchar(10) DEFAULT NULL,
  `MENU_STATE` int(1) DEFAULT NULL,
  PRIMARY KEY (`MENU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '系统管理', '#', '0', '1', 'menu-icon fa fa-desktop blue', '2', '1');
INSERT INTO `sys_menu` VALUES ('2', '权限管理', '#', '1', '1', 'menu-icon fa fa-lock black', '1', '1');
INSERT INTO `sys_menu` VALUES ('3', '日志管理', 'log/list.do', '1', '6', 'menu-icon fa fa-book blue', '1', '1');
INSERT INTO `sys_menu` VALUES ('6', '信息管理', '#', '0', '4', 'menu-icon fa fa-credit-card green', '2', '1');
INSERT INTO `sys_menu` VALUES ('7', '图片管理', '#', '6', '1', 'menu-icon fa fa-folder-o pink', '2', '1');
INSERT INTO `sys_menu` VALUES ('8', '性能监控', 'druid/index.html', '9', '9', 'menu-icon fa fa-tachometer red', '1', '1');
INSERT INTO `sys_menu` VALUES ('9', '系统工具', '#', '0', '3', 'menu-icon fa fa-cog black', '2', '1');
INSERT INTO `sys_menu` VALUES ('20', '在线管理', 'onlinemanager/list.do', '1', '5', 'menu-icon fa fa-laptop green', '1', '1');
INSERT INTO `sys_menu` VALUES ('36', '角色(基础权限)', 'role.do', '2', '1', 'menu-icon fa fa-key orange', '1', '1');
INSERT INTO `sys_menu` VALUES ('37', '按钮权限', 'buttonrights/list.do', '2', '2', 'menu-icon fa fa-key green', '1', '1');
INSERT INTO `sys_menu` VALUES ('38', '菜单管理', 'menu/listAllMenu.do', '1', '3', 'menu-icon fa fa-folder-open-o brown', '1', '1');
INSERT INTO `sys_menu` VALUES ('39', '按钮管理', 'button/list.do', '1', '2', 'menu-icon fa fa-download orange', '1', '1');
INSERT INTO `sys_menu` VALUES ('40', '用户管理', '#', '0', '2', 'menu-icon fa fa-users blue', '2', '1');
INSERT INTO `sys_menu` VALUES ('41', '系统用户', 'user/listUsers.do', '40', '1', 'menu-icon fa fa-users green', '1', '1');
INSERT INTO `sys_menu` VALUES ('43', '数据字典', 'dictionaries/listAllDict.do?DICTIONARIES_ID=0', '1', '4', 'menu-icon fa fa-book purple', '1', '1');
INSERT INTO `sys_menu` VALUES ('50', '站内信', 'sms/list.do', '6', '3', 'menu-icon fa fa-envelope green', '1', '1');
INSERT INTO `sys_menu` VALUES ('51', '图片列表', 'pictures/list.do', '7', '1', 'menu-icon fa fa-folder-open-o green', '1', '1');
INSERT INTO `sys_menu` VALUES ('52', '图片爬虫', 'pictures/goImageCrawler.do', '7', '2', 'menu-icon fa fa-cloud-download green', '1', '1');
INSERT INTO `sys_menu` VALUES ('54', '数据库管理', '#', '0', '6', 'menu-icon fa fa-hdd-o blue', '2', '1');
INSERT INTO `sys_menu` VALUES ('55', '数据库备份', 'brdb/listAllTable.do', '54', '1', 'menu-icon fa fa-cloud-upload blue', '1', '1');
INSERT INTO `sys_menu` VALUES ('56', '数据库还原', 'brdb/list.do', '54', '3', 'menu-icon fa fa-cloud-download blue', '1', '1');
INSERT INTO `sys_menu` VALUES ('57', '备份定时器', 'timingbackup/list.do', '54', '2', 'menu-icon fa fa-tachometer blue', '1', '1');
INSERT INTO `sys_menu` VALUES ('58', 'SQL编辑器', 'sqledit/view.do', '54', '4', 'menu-icon fa fa-pencil-square-o blue', '1', '1');
INSERT INTO `sys_menu` VALUES ('69', '客户管理', '#', '0', '7', 'menu-icon fa fa-users green', '2', '1');
INSERT INTO `sys_menu` VALUES ('70', '客户资料', 'customer/list.do', '69', '1', 'menu-icon fa fa-users blue', '1', '1');
INSERT INTO `sys_menu` VALUES ('71', '客户备注', 'remarks/list.do', '69', '2', 'menu-icon fa fa-bookmark green', '1', '1');
INSERT INTO `sys_menu` VALUES ('72', '客户级别', 'level/list.do', '69', '3', 'menu-icon fa fa-filter orange', '1', '1');
INSERT INTO `sys_menu` VALUES ('73', '商品管理', '#', '0', '8', 'menu-icon fa fa-inbox blue', '2', '1');
INSERT INTO `sys_menu` VALUES ('74', '商品列表', 'goods/list.do', '73', '1', 'menu-icon fa fa-gift green', '1', '1');
INSERT INTO `sys_menu` VALUES ('75', '商品类别', 'sptype/list.do', '73', '2', 'menu-icon fa fa-book blue', '1', '1');
INSERT INTO `sys_menu` VALUES ('76', '品牌管理', 'spbrand/list.do', '73', '3', 'menu-icon fa fa-globe purple', '1', '1');
INSERT INTO `sys_menu` VALUES ('77', '计量单位', 'spunit/list.do', '73', '4', 'menu-icon fa fa-circle-o pink', '1', '1');
INSERT INTO `sys_menu` VALUES ('78', '库存管理', '#', '0', '9', 'menu-icon fa fa-home purple', '2', '1');
INSERT INTO `sys_menu` VALUES ('79', '商品库存(存)', 'kucun/list.do', '78', '1', 'menu-icon fa fa-home green', '1', '1');
INSERT INTO `sys_menu` VALUES ('80', '商品入库(进)', 'intoku/list.do', '78', '2', 'menu-icon fa fa-cloud-download orange', '1', '1');
INSERT INTO `sys_menu` VALUES ('81', '商品出库(销)', 'outku/list.do', '78', '3', 'menu-icon fa fa-cloud-upload purple', '1', '1');
INSERT INTO `sys_menu` VALUES ('82', '库存盘点', 'kucun/kucunchar.do', '78', '4', 'menu-icon fa fa-bar-chart-o blue', '1', '1');
INSERT INTO `sys_menu` VALUES ('83', '销售报表', 'outku/salesReport.do', '78', '5', 'menu-icon fa fa-book red', '1', '1');
INSERT INTO `sys_menu` VALUES ('84', '所有客户', 'allcustomer/list.do', '69', '1', 'menu-icon fa fa-users blue', '1', '1');
INSERT INTO `sys_menu` VALUES ('85', null, null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('86', '我的通讯', '#', '0', '5', 'menu-icon fa fa-comments-o green', '2', '1');
INSERT INTO `sys_menu` VALUES ('87', '好友管理', 'friends/list.do', '86', '1', 'menu-icon fa fa-users blue', '1', '1');
INSERT INTO `sys_menu` VALUES ('88', '好友分组', 'fgroup/list.do', '86', '2', 'menu-icon fa fa-bookmark green', '1', '1');
INSERT INTO `sys_menu` VALUES ('89', '我的群组', 'qgroup/list.do', '86', '3', 'menu-icon fa fa-users purple', '1', '1');

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `ROLE_ID` varchar(100) NOT NULL,
  `ROLE_NAME` varchar(100) DEFAULT NULL,
  `RIGHTS` varchar(255) DEFAULT NULL,
  `PARENT_ID` varchar(100) DEFAULT NULL,
  `ADD_QX` varchar(255) DEFAULT NULL,
  `DEL_QX` varchar(255) DEFAULT NULL,
  `EDIT_QX` varchar(255) DEFAULT NULL,
  `CHA_QX` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '系统管理组', '1179912190806029211781825486', '0', '1', '1', '1', '1');
INSERT INTO `sys_role` VALUES ('115b386ff04f4352b060dffcd2b5d1da', '中级会员', '', '2', '0', '0', '0', '0');
INSERT INTO `sys_role` VALUES ('1b67fc82ce89457a8347ae53e43a347e', '初级会员', '', '2', '0', '0', '0', '0');
INSERT INTO `sys_role` VALUES ('2', '备用组(TEST)', '', '0', '0', '0', '0', '1');
INSERT INTO `sys_role` VALUES ('3', '注册用户', '', '1', '', '0', '0', '0');
INSERT INTO `sys_role` VALUES ('3264c8e83d0248bb9e3ea6195b4c0216', '总管理员(厂家)', '1179912190240817631660605504', '1', '1179912190240817631660605504', '1179912190240817631660605504', '1179912190240817631660605504', '1179912190240817631660605504');
INSERT INTO `sys_role` VALUES ('68f8e4a39efe47c7bb869e9d15ab925d', '下级管理员(商户)', '1179911009649193615714418752', '1', '1179911009649193615714418752', '1179911009649193615714418752', '1179911009649193615714418752', '1179911009649196914249302080');
INSERT INTO `sys_role` VALUES ('8b70a7e67f2841e7aaba8a4d92e5ff6f', '高级会员', '', '2', '0', '0', '0', '0');

-- ----------------------------
-- Table structure for `sys_role_button`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_button`;
CREATE TABLE `sys_role_button` (
  `RB_ID` varchar(100) NOT NULL,
  `ROLE_ID` varchar(100) DEFAULT NULL,
  `BUTTON_ID` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`RB_ID`),
  KEY `角色表外键` (`ROLE_ID`) USING BTREE,
  KEY `fbutton` (`BUTTON_ID`),
  CONSTRAINT `fbutton` FOREIGN KEY (`BUTTON_ID`) REFERENCES `sys_button` (`BUTTON_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `frole` FOREIGN KEY (`ROLE_ID`) REFERENCES `sys_role` (`ROLE_ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_button
-- ----------------------------
INSERT INTO `sys_role_button` VALUES ('4ee1e2bc03a64ef1bc578fcf2e2ea2c1', '68f8e4a39efe47c7bb869e9d15ab925d', '3542adfbda73410c976e185ffe50ad06');
INSERT INTO `sys_role_button` VALUES ('5669c8754b4d4e368365ed5065f9fc10', '3264c8e83d0248bb9e3ea6195b4c0216', '3542adfbda73410c976e185ffe50ad06');
INSERT INTO `sys_role_button` VALUES ('6cc655a1f9b746eea6af9df540f8e743', '3', 'da7fd386de0b49ce809984f5919022b8');
INSERT INTO `sys_role_button` VALUES ('74203935bfa34ce3b9b80e81f2a2bcfe', '68f8e4a39efe47c7bb869e9d15ab925d', '4efa162fce8340f0bd2dcd3b11d327ec');
INSERT INTO `sys_role_button` VALUES ('81d31bc5bf02490a85ce496b6755ef26', '3', '46992ea280ba4b72b29dedb0d4bc0106');
INSERT INTO `sys_role_button` VALUES ('8231c216fb514b4188e4162e629c6237', '3264c8e83d0248bb9e3ea6195b4c0216', '4efa162fce8340f0bd2dcd3b11d327ec');
INSERT INTO `sys_role_button` VALUES ('88f66a65ee1642bea7979e0e1050ac5f', '3', '4efa162fce8340f0bd2dcd3b11d327ec');
INSERT INTO `sys_role_button` VALUES ('8f8b3c5bfdfa4c6da19fce7396279180', '68f8e4a39efe47c7bb869e9d15ab925d', 'cc51b694d5344d28a9aa13c84b7166cd');
INSERT INTO `sys_role_button` VALUES ('d51dc41918b040a78a021c9a43caf8d5', '68f8e4a39efe47c7bb869e9d15ab925d', 'da7fd386de0b49ce809984f5919022b8');
INSERT INTO `sys_role_button` VALUES ('d80abc961d594f75b65e90d5b7437aa9', '3', 'cc51b694d5344d28a9aa13c84b7166cd');
INSERT INTO `sys_role_button` VALUES ('d9a9a5a2d79446449cd26c17f061e1d0', '3264c8e83d0248bb9e3ea6195b4c0216', 'da7fd386de0b49ce809984f5919022b8');
INSERT INTO `sys_role_button` VALUES ('e2033c3cdb8d48a1865e16e085f103b7', '3264c8e83d0248bb9e3ea6195b4c0216', '46992ea280ba4b72b29dedb0d4bc0106');
INSERT INTO `sys_role_button` VALUES ('f0329033d0914faf8ea6e9ff252cc5e6', '68f8e4a39efe47c7bb869e9d15ab925d', '46992ea280ba4b72b29dedb0d4bc0106');
INSERT INTO `sys_role_button` VALUES ('f919c1f620634bdaa353a9f63194a2e0', '3', '3542adfbda73410c976e185ffe50ad06');
INSERT INTO `sys_role_button` VALUES ('fbc51895f2184d63bd1409320a7a7a2a', '3264c8e83d0248bb9e3ea6195b4c0216', 'cc51b694d5344d28a9aa13c84b7166cd');

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `USER_ID` varchar(100) NOT NULL,
  `USERNAME` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `RIGHTS` varchar(255) DEFAULT NULL,
  `ROLE_ID` varchar(100) DEFAULT NULL,
  `LAST_LOGIN` varchar(255) DEFAULT NULL,
  `IP` varchar(100) DEFAULT NULL,
  `STATUS` varchar(32) DEFAULT NULL,
  `BZ` varchar(255) DEFAULT NULL,
  `SKIN` varchar(100) DEFAULT NULL,
  `EMAIL` varchar(32) DEFAULT NULL,
  `NUMBER` varchar(100) DEFAULT NULL,
  `PHONE` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', 'de41b7fb99201d8334c23c014db35ecd92df81bc', '管理员', '1133671055321055258374707980945218933803269864762743594642571294', '1', '2018-08-14 15:21:53', '127.0.0.1', '0', 'admin', 'no-skin', 'QQ313596790@main.com', '001', '18788888888');
INSERT INTO `sys_user` VALUES ('a88125c7e4994d5a80061a3645d7701d', 'a0', '203e2ccc573d3bfd4b2492926f441614b97d9f9d', '总管', '', '3264c8e83d0248bb9e3ea6195b4c0216', '2018-08-06 01:17:38', '127.0.0.1', '0', '总管', 'no-skin', '222222@qq.com', '0001', '13555555555');
INSERT INTO `sys_user` VALUES ('aba226eceabc404d8960be0ee3626fcd', 'a2', '2a68de09b5b0087d43654e9657dcf6a87408b349', '李四', '', '68f8e4a39efe47c7bb869e9d15ab925d', '2018-08-06 01:19:08', '127.0.0.1', '0', '李四', 'no-skin', '55555@qq.com', '000003', '18888888888');
INSERT INTO `sys_user` VALUES ('df658542223d4da9b700852fd9adaddf', 'a1', 'cc3282bafa1ffcbc63c7edf850067c98e28fedb3', '测试', '', '68f8e4a39efe47c7bb869e9d15ab925d', '2018-08-18 18:56:41', '127.0.0.1', '0', '测试', 'no-skin', '12121212@qq.com', '1002', '18765555555');

-- ----------------------------
-- Table structure for `sys_userphoto`
-- ----------------------------
DROP TABLE IF EXISTS `sys_userphoto`;
CREATE TABLE `sys_userphoto` (
  `USERPHOTO_ID` varchar(100) NOT NULL,
  `USERNAME` varchar(30) DEFAULT NULL COMMENT '用户名',
  `PHOTO0` varchar(255) DEFAULT NULL COMMENT '原图',
  `PHOTO1` varchar(100) DEFAULT NULL COMMENT '头像1',
  `PHOTO2` varchar(100) DEFAULT NULL COMMENT '头像2',
  `PHOTO3` varchar(100) DEFAULT NULL COMMENT '头像3',
  PRIMARY KEY (`USERPHOTO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_userphoto
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_pictures`
-- ----------------------------
DROP TABLE IF EXISTS `tb_pictures`;
CREATE TABLE `tb_pictures` (
  `PICTURES_ID` varchar(100) NOT NULL,
  `TITLE` varchar(255) DEFAULT NULL COMMENT '标题',
  `NAME` varchar(255) DEFAULT NULL COMMENT '文件名',
  `PATH` varchar(255) DEFAULT NULL COMMENT '路径',
  `CREATETIME` varchar(100) DEFAULT NULL COMMENT '创建时间',
  `MASTER_ID` varchar(255) DEFAULT NULL COMMENT '属于',
  `BZ` varchar(255) DEFAULT NULL COMMENT '备注',
  `ORDER_BY` int(11) DEFAULT NULL,
  PRIMARY KEY (`PICTURES_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_pictures
-- ----------------------------
