
--데이터베이스를 root로 작성
--=================================================

CREATE DATABASE `jh_hardshop` /*!40100 DEFAULT CHARACTER SET utf8 */;

--==================================================



--데이터베이스 myself유저에 권한 이행
--==================================================

% vs localhost as in 
GRANT Alter ON jh_hardshop.* TO 'myself'@'%';
GRANT Alter ON jh_hardshop.* TO 'myself'@'localhost';

GRANT Alter ON jh_hardshop.* TO 'myself'@'localhost';
GRANT Create ON jh_hardshop.* TO 'myself'@'localhost';
GRANT Create view ON jh_hardshop.* TO 'myself'@'localhost';
GRANT Delete ON jh_hardshop.* TO 'myself'@'localhost';
GRANT Delete history ON jh_hardshop.* TO 'myself'@'localhost';
GRANT Drop ON jh_hardshop.* TO 'myself'@'localhost';
GRANT Grant option ON jh_hardshop.* TO 'myself'@'localhost';
GRANT Index ON jh_hardshop.* TO 'myself'@'localhost';
GRANT Insert ON jh_hardshop.* TO 'myself'@'localhost';
GRANT References ON jh_hardshop.* TO 'myself'@'localhost';
GRANT Select ON jh_hardshop.* TO 'myself'@'localhost';
GRANT Show view ON jh_hardshop.* TO 'myself'@'localhost';
GRANT Trigger ON jh_hardshop.* TO 'myself'@'localhost';
GRANT Update ON jh_hardshop.* TO 'myself'@'localhost';

--==================================================


-- jh_hardshop.브랜드명 definition

CREATE TABLE `브랜드명` (
  `brand_name` varchar(20) DEFAULT NULL COMMENT '브랜드명(삼성전자 등등)',
  `hard_data` varchar(20) DEFAULT NULL COMMENT '하드용량(250기가 등등)',
  `hard_description` varchar(200) DEFAULT NULL COMMENT '하드 설명서'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
