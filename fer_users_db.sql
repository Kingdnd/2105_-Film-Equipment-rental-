-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 29, 2024 at 10:45 AM
-- Server version: 10.4.16-MariaDB
-- PHP Version: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fer_users_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `equipment`
--

CREATE TABLE `equipment` (
  `ID` int(11) NOT NULL,
  `Model` varchar(255) NOT NULL,
  `Description` varchar(255) NOT NULL,
  `DailyFee` int(11) NOT NULL,
  `Econdition` varchar(255) NOT NULL,
  `Status` varchar(255) NOT NULL DEFAULT 'Available',
  `Type` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `equipment`
--

INSERT INTO `equipment` (`ID`, `Model`, `Description`, `DailyFee`, `Econdition`, `Status`, `Type`) VALUES
(1, 'Canon xmd12', '2x Zoom', 120, 'Good as New', 'Available', 'Camera'),
(2, 'Ring Light', 'Lights for pictorial', 300, 'Brand New', 'Unavailable', 'Lights'),
(3, 'Micro', 'Mcr21', 500, 'Brand New', 'Available', 'Camera'),
(4, 'adsa', 'dada', 44, 'ddad', 'dsss', 'Camera');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `ID` int(11) NOT NULL,
  `FirstName` varchar(255) NOT NULL,
  `LastName` varchar(50) DEFAULT NULL,
  `Username` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Role` varchar(255) NOT NULL DEFAULT 'Client'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`ID`, `FirstName`, `LastName`, `Username`, `Password`, `Role`) VALUES
(1, '', 'dfdf', 'asd', 'dfdf', 'Client'),
(2, '', 'kingf', 'kinddf', 'kinsgsg', ''),
(3, '', 'sdvrv', 'rvrgg', 'dgdgcre', ''),
(4, '', 'sdsdsd', 'sdsdsd', 'sdsd', ''),
(5, 'King', 'Dnd', 'kingdnd', 'qwerty', 'Admin'),
(6, 'king', 'kimg', 'kingdn', 'king', 'Client'),
(7, 'king', 'king', 'king', 'king', 'Client'),
(8, 'kim', 'kim', 'kim', 'kim', 'Client');

-- --------------------------------------------------------

--
-- Table structure for table `rent`
--

CREATE TABLE `rent` (
  `ID` int(11) NOT NULL,
  `Model` varchar(255) NOT NULL,
  `StartDate` varchar(255) NOT NULL,
  `ReturnDate` varchar(255) NOT NULL,
  `TotalFee` int(11) NOT NULL,
  `Username` varchar(255) NOT NULL,
  `Type` varchar(255) NOT NULL,
  `Returned` varchar(255) NOT NULL DEFAULT 'No',
  `Remarks` varchar(255) DEFAULT NULL,
  `ExtraCharge` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rent`
--

INSERT INTO `rent` (`ID`, `Model`, `StartDate`, `ReturnDate`, `TotalFee`, `Username`, `Type`, `Returned`, `Remarks`, `ExtraCharge`) VALUES
(1, 'Canon xmd12', '2024-11-29', '2024-11-30', 120, 'kingdnd', 'Camera', 'Yes', 'Returned Late', 12),
(2, 'Canon xmd12', '2024-11-29', '2024-12-01', 240, 'kingdnd', 'Camera', 'No', '', 0),
(3, 'Canon xmd12', '2024-11-30', '2024-12-01', 120, 'kingdnd', 'Camera', 'No', '', 0),
(4, 'Canon xmd12', '2024-11-29', '2024-11-29', 0, 'kingdnd', 'Camera', 'No', '', 0),
(5, 'Canon xmd12', '2024-11-29', '2024-11-30', 120, 'kingdnd', 'Camera', 'No', '', 0),
(6, 'Canon xmd12', '2024-11-30', '2024-11-30', 0, 'kingdnd', 'Camera', 'Yes', 'Returned on time', 0),
(7, 'Canon xmd12', '2024-11-30', '2024-12-02', 240, 'kingdnd', 'Camera', 'No', '', 0),
(8, 'Canon xmd12', '2024-11-29', '2024-12-03', 480, 'kingdnd', 'Camera', 'No', '', 0),
(9, 'Canon xmd12', '2024-12-04', '2024-12-05', 120, 'kingdnd', 'Camera', 'No', '', 0),
(10, 'Canon xmd12', '2024-12-06', '2024-12-07', 120, 'kingdn', 'Camera', 'No', '', 0),
(11, 'Micro', '2024-11-30', '2024-12-01', 500, 'kingdnd', 'Camera', 'No', '', 0),
(12, 'Ring Light', '2024-11-30', '2024-12-03', 900, 'kingdnd', 'Lights', 'No', '', 0),
(13, 'Ring Light', '2024-12-04', '2025-01-01', 8400, 'kim', 'Lights', 'No', '', 0),
(14, 'Ring Light', '2024-12-06', '2024-12-18', 3600, 'kim', 'Lights', 'Yes', 'Returned Damaged', 900),
(15, 'Ring Light', '2025-01-02', '2025-01-03', 300, 'kim', 'Lights', 'No', '', 0),
(16, 'Ring Light', '2024-12-11', '2024-12-12', 300, 'kim', 'Lights', 'No', '', 0),
(17, 'Ring Light', '2024-12-20', '2024-12-25', 1500, 'kim', 'Lights', 'No', '', 0),
(18, 'Micro', '2024-12-18', '2024-12-25', 3500, 'king', 'Camera', 'Yes', 'Returned Damaged', 875),
(19, 'Micro', '2024-12-19', '2024-12-24', 2500, 'king', 'Camera', 'No', NULL, NULL),
(20, 'Ring Light', '2025-01-10', '2025-01-21', 3300, 'king', 'Lights', 'Yes', 'Returned on time', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `equipment`
--
ALTER TABLE `equipment`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `rent`
--
ALTER TABLE `rent`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `equipment`
--
ALTER TABLE `equipment`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `register`
--
ALTER TABLE `register`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `rent`
--
ALTER TABLE `rent`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
