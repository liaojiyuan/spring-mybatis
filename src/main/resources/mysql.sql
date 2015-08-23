DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`
(
  `empno` int(10) NOT NULL auto_increment,
  `ename` varchar(30) NOT NULL,
  `job` varchar(15) NOT NULL,
  `mgr` int(4) default NULL,
  `hiredate` date NOT NULL,
  `sale` double(7,0) NOT NULL,
  `comm` double(7,0) default NULL,
  `deptno` int(10),
  PRIMARY KEY  (`empno`)
);

DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`
(
  `deptno` int(10) NOT NULL auto_increment,
  `dname` varchar(20) NOT NULL,
  `location` varchar(30) default '',
  PRIMARY KEY  (`deptno`)
);

INSERT INTO `emp` VALUES ('7369', 'SMITH', 'CLERK', '7902', '1980-12-17', '800', null, '20');
INSERT INTO `emp` VALUES ('7499', 'ALLEN', 'SALESMAN', '7698', '1981-02-20', '1600', '300', '30');
INSERT INTO `emp` VALUES ('7521', 'WARD', 'SALESMAN', '7698', '1981-02-22', '1250', '500', '30');
INSERT INTO `emp` VALUES ('7566', 'JONES', 'MANAGER', '7839', '1981-04-02', '2975', null, '20');
INSERT INTO `emp` VALUES ('7654', 'MARTIN', 'SALESMAN', '7698', '1981-09-28', '1250', '1400', '30');
INSERT INTO `emp` VALUES ('7698', 'BLAKE', 'MANAGER', '7839', '1981-05-01', '2850', null, '30');
INSERT INTO `emp` VALUES ('7782', 'CLARK', 'MANAGER', '7839', '1981-06-09', '2450', null, '10');
INSERT INTO `emp` VALUES ('7788', 'SCOTT', 'ANALYST', '7566', '1987-07-15', '3000', null, '20');
INSERT INTO `emp` VALUES ('7839', 'KING', 'PRESIDENT', null, '1981-11-17', '5000', null, '10');
INSERT INTO `emp` VALUES ('7844', 'TURNER', 'SALESMAN', '7698', '1981-09-08', '1500', '0', '30');
INSERT INTO `emp` VALUES ('7876', 'ADAMS', 'CLERK', '7788', '1987-07-13', '1100', null, '20');
INSERT INTO `emp` VALUES ('7900', 'JAMES', 'CLERK', '7698', '1981-12-03', '950', null, '30');
INSERT INTO `emp` VALUES ('7902', 'FORD', 'ANALYST', '7566', '1981-12-03', '3000', null, '20');
INSERT INTO `emp` VALUES ('7934', 'MILLER', 'CLERK', '7782', '1982-01-23', '1300', null, '10');
INSERT INTO `dept` VALUES ('10', 'ACCOUNTING', 'NEW YORK'); INSERT INTO `dept` VALUES ('20', 'RESEARCH', 'DALLAS');
INSERT INTO `dept` VALUES ('30', 'SALES', 'CHICAGO'); INSERT INTO `dept` VALUES ('40', 'OPERATIONS', 'BOSTON');