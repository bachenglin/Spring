create database auction_fraud;

use auction_fraud;



CREATE TABLE `admin` (
  `userid` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



CREATE TABLE `offers` (
  `pid` varchar(255) NOT NULL,
  `comname` varchar(255) NOT NULL,
  `proname` varchar(255) NOT NULL,
  `wardate` varchar(255) NOT NULL,
  `prorate` varchar(255) NOT NULL,
  `offrate` varchar(255) NOT NULL,
  `offdes` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  `sold` varchar(255) NOT NULL,
  `deliver` varchar(255) NOT NULL,
  `missmatch` varchar(255) NOT NULL,
  `service` varchar(255) NOT NULL,
  `damage` varchar(255) NOT NULL,
  `complaint` varchar(255) NOT NULL,
  `feed` varchar(255) NOT NULL,
  `adminact` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



CREATE TABLE `products` (
  `pid` int(11) NOT NULL auto_increment,
  `comname` varchar(255) NOT NULL,
  `proname` varchar(255) NOT NULL,
  `wardate` varchar(255) NOT NULL,
  `proimage` longblob NOT NULL,
  `prorate` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  `adminact` varchar(255) NOT NULL,
  PRIMARY KEY  (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;



CREATE TABLE `purchased` (
  `pur_id` int(11) NOT NULL auto_increment,
  `uid` varchar(255) NOT NULL,
  `uname` varchar(255) NOT NULL,
  `pid` varchar(255) NOT NULL,
  `comname` varchar(255) NOT NULL,
  `proname` varchar(255) NOT NULL,
  `wardate` varchar(255) NOT NULL,
  `prorate` varchar(255) NOT NULL,
  `offrate` varchar(255) NOT NULL,
  `offdes` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  PRIMARY KEY  (`pur_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;



CREATE TABLE `seller` (
  `uid` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `cname` varchar(255) NOT NULL,
  `userid` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL,
  `mobile` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `webadd` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `authorize` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



CREATE TABLE `user` (
  `uid` varchar(225) NOT NULL,
  `name` varchar(255) NOT NULL,
  `userid` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL,
  `mobile` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



INSERT INTO `admin` VALUES ('admin', 'admin');
