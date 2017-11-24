CREATE TABLE `tbl_employee` (
  `ID` char(32) NOT NULL,
  `USER_ROLE` char(32) NOT NULL,
  `TITLE` char(32) DEFAULT NULL,
  `SURNAME` char(128) DEFAULT NULL,
  `INITIALS` char(128) DEFAULT NULL,
  `FIRST_NAME` char(128) DEFAULT NULL,
  `NIC` char(32) DEFAULT NULL,
  `DESIGNATION` char(64) DEFAULT NULL,
  `DEPARTMENT` char(64) DEFAULT NULL,
  `MARITAL_STATUS` char(32) DEFAULT NULL,
  `UPF_NUMBER` char(64) DEFAULT NULL,
  `EPF_NUMBER` char(64) DEFAULT NULL,
  `ETF_NUMBER` char(64) DEFAULT NULL,
  `COMMENT` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `STATUS` tinyint(4) DEFAULT '0',
  `SORT_ORDER` int(6) DEFAULT '1',
  `INSERT_USER_ID` char(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `INSERT_DATETIME` datetime DEFAULT NULL,
  `UPDATE_USER_ID` char(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_DATETIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
