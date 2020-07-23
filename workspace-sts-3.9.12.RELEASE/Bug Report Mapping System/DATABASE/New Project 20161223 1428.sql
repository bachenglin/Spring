
CREATE DATABASE IF NOT EXISTS triage;


USE triage;


CREATE TABLE `bug` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `summary` varchar(45) NOT NULL,
  `description` varchar(500) NOT NULL,
  `product` varchar(45) NOT NULL,
  `platform` varchar(45) NOT NULL,
  `importance` varchar(45) NOT NULL,
  `dev` varchar(45) default 'Not Assigned',
  `status` varchar(45) default 'Not Assigned',
  `comp` varchar(45) NOT NULL,
  `bugid` varchar(45) NOT NULL,
  `adate` varchar(45) NOT NULL,
  `finalstatus` varchar(45) default NULL,
  `develop` varchar(45) default NULL,
  `cdate` varchar(45) default NULL,
  `soluction` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `hist` (
  `id` int(10) unsigned default NULL,
  `dat` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `dev` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  `summary` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `repos` (
  `id` int(10) unsigned default NULL,
  `dat` timestamp NOT NULL default CURRENT_TIMESTAMP,
  `dev` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  `summary` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `pass` varchar(45) NOT NULL,
  `domain` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `loc` varchar(45) NOT NULL,
  `jdt` varchar(45) NOT NULL,
  `status` varchar(45) default 'Pending',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;




