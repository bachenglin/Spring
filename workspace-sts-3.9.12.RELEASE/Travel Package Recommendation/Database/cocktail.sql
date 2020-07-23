
create database cocktail;

USE `cocktail`;



CREATE TABLE `plan` (
  `userid` varchar(50) NOT NULL,
  `str` varchar(45) NOT NULL,
  `end` varchar(45) NOT NULL,
  `intr` varchar(105) NOT NULL,
  `dot` varchar(45) NOT NULL,
  `dy` varchar(45) NOT NULL,
  `nop` varchar(45) NOT NULL,
  `status_` varchar(45) NOT NULL,
  `tcost` varchar(45) NOT NULL,
  `key_` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `regpage` (
  `name` varchar(45) NOT NULL DEFAULT '',
  `userid` varchar(45) NOT NULL DEFAULT '',
  `pass` varchar(45) NOT NULL DEFAULT '',
  `mail` varchar(45) NOT NULL DEFAULT '',
  `age` varchar(45) NOT NULL DEFAULT '',
  `loc` varchar(45) NOT NULL DEFAULT '',
  `sex` varchar(45) NOT NULL DEFAULT '',
  `time_` datetime NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



