-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2021 at 07:01 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `airplanedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `aid` int(11) NOT NULL,
  `aname` varchar(100) DEFAULT NULL,
  `akey` varchar(100) DEFAULT NULL,
  `aemail` varchar(100) DEFAULT NULL,
  `atele` char(10) DEFAULT NULL,
  `apass` varchar(100) DEFAULT NULL,
  `acopass` varchar(100) DEFAULT NULL,
  `aaddress` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`aid`, `aname`, `akey`, `aemail`, `atele`, `apass`, `acopass`, `aaddress`) VALUES
(30000, 'admin2', '565689676', 'admin2@gmail.com', '0775226522', '123456', '123456', 'kaluuthara'),
(30001, 'admin2', '64696', 'admin2@gmail.com', '0775226522', '147258', '147258', 'kaluuthara'),
(30002, 'admin3', '264569887', 'admin3@gmail.com', '0741258963', '456789', '456789', 'Dadulla');

-- --------------------------------------------------------

--
-- Table structure for table `flightdetails`
--

CREATE TABLE `flightdetails` (
  `flightID` varchar(30) NOT NULL,
  `departing_from` varchar(30) DEFAULT NULL,
  `departing_to` varchar(30) DEFAULT NULL,
  `departing_date` date DEFAULT NULL,
  `departureTime` time DEFAULT NULL,
  `arrivalTime` time DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `flightdetails`
--

INSERT INTO `flightdetails` (`flightID`, `departing_from`, `departing_to`, `departing_date`, `departureTime`, `arrivalTime`, `price`) VALUES
('f0002', 'England', 'Korea', '2021-04-30', '05:20:00', '20:40:00', 300000),
('f0003', 'Brazil', 'Arab', '2021-05-20', '17:00:00', '00:20:32', 25000);

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `sid` int(11) NOT NULL,
  `sname` varchar(100) DEFAULT NULL,
  `skey` varchar(100) DEFAULT NULL,
  `semail` varchar(100) DEFAULT NULL,
  `stele` varchar(100) DEFAULT NULL,
  `spass` varchar(100) DEFAULT NULL,
  `scopass` varchar(100) DEFAULT NULL,
  `saddress` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`sid`, `sname`, `skey`, `semail`, `stele`, `spass`, `scopass`, `saddress`) VALUES
(20000, 'User', '', 'user@gmail.com', '0771093778', '', '', 'Nugegodda'),
(20001, 'User', '325878956456', 'user@gmail.com', '0771093778', '258963', '258963', 'Nugegodda'),
(20002, 'staff1', '56468496', 'staff1@gmail.com', '0741258963', '654123', '654123', 'Nuwara Eliya'),
(20003, 'staff2', '165467699', 'staff2@gmaail.com', '0754123698', '0123456', '0123456', 'Kottawa'),
(20004, 'admin2', '200079500808', 'admin2@gmail.com', '0775226522', '123456', '123456', 'kaluuthara'),
(20005, 'staff3', '48646468687', 'staff3@gmail.com', '0754125896', '147258', '147258', 'Dambulla');

-- --------------------------------------------------------

--
-- Table structure for table `ticketdetails`
--

CREATE TABLE `ticketdetails` (
  `ticketID` int(11) NOT NULL,
  `passengerName` varchar(30) DEFAULT NULL,
  `cabinnClass` varchar(30) DEFAULT NULL,
  `seatType` varchar(30) DEFAULT NULL,
  `seatNum` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ticketdetails`
--

INSERT INTO `ticketdetails` (`ticketID`, `passengerName`, `cabinnClass`, `seatType`, `seatNum`, `email`, `phone`) VALUES
(11, 'user1', 'First Class', 'Center', '0004', 'user1@gmaill.comm', 774250143),
(12, 'user2', 'Economy Class', 'Window', '0008', 'user2@gmail.ccom', 774125489),
(13, 'user3', 'Business Class', 'Asile', '0006', 'user3@gmail.com', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `uid` int(11) NOT NULL,
  `uname` varchar(100) DEFAULT NULL,
  `ukey` varchar(100) DEFAULT NULL,
  `uemail` varchar(100) DEFAULT NULL,
  `utele` char(10) DEFAULT NULL,
  `upass` varchar(100) DEFAULT NULL,
  `ucopass` varchar(100) DEFAULT NULL,
  `uaddress` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`uid`, `uname`, `ukey`, `uemail`, `utele`, `upass`, `ucopass`, `uaddress`) VALUES
(10001, 'user1', '745646456546', 'user1@gmail.com', '0789965412', '258963', '258963', 'kandy'),
(10003, 'user2', '123645478', 'user2@gmail.com', '0741258963', '147852', '147852', 'galle'),
(10004, 'user3', '354684697496v', 'user3@gmail.com', '0785412369', '789654', '789654', 'Jaffna');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`aid`),
  ADD UNIQUE KEY `akey` (`akey`);

--
-- Indexes for table `flightdetails`
--
ALTER TABLE `flightdetails`
  ADD PRIMARY KEY (`flightID`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`sid`),
  ADD UNIQUE KEY `skey` (`skey`);

--
-- Indexes for table `ticketdetails`
--
ALTER TABLE `ticketdetails`
  ADD PRIMARY KEY (`ticketID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`uid`),
  ADD UNIQUE KEY `ukey` (`ukey`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `aid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30003;

--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `sid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20006;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `uid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10005;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
