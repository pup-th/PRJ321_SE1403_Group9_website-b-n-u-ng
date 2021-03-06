-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 24, 2020 at 05:51 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bannuocuong`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `aMail` varchar(100) NOT NULL,
  `aPassword` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`aMail`, `aPassword`) VALUES
('phuc@gmail.com', 'e10adc3949ba59abbe56e057f20f883e'),
('qui@gmail.com', 'e10adc3949ba59abbe56e057f20f883e'),
('tri@gmail.com', 'e10adc3949ba59abbe56e057f20f883e');

-- --------------------------------------------------------

--
-- Table structure for table `blockitems`
--

CREATE TABLE `blockitems` (
  `blockId` int(11) NOT NULL,
  `blockItemQuantity` int(11) NOT NULL,
  `blockItemPrice` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `blockitems`
--

INSERT INTO `blockitems` (`blockId`, `blockItemQuantity`, `blockItemPrice`) VALUES
(1, 120, 600000),
(2, 100, 530000),
(3, 70, 720000),
(4, 50, 500000),
(5, 35, 270000);

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `bId` int(11) NOT NULL,
  `brandName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`bId`, `brandName`) VALUES
(1, 'Coca Cola'),
(2, 'Pepsi'),
(3, 'Sting'),
(4, '7Up');

-- --------------------------------------------------------

--
-- Table structure for table `discount`
--

CREATE TABLE `discount` (
  `iId` int(11) NOT NULL,
  `aId` int(11) NOT NULL,
  `date` date NOT NULL,
  `numDiscount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `discount`
--

INSERT INTO `discount` (`iId`, `aId`, `date`, `numDiscount`) VALUES
(1, 1, '2020-04-03', 10),
(2, 1, '2020-06-05', 15),
(4, 1, '2020-05-10', 10);

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `iId` int(11) NOT NULL COMMENT 'Item Id',
  `tId` int(11) NOT NULL COMMENT 'User Id',
  `bId` int(11) NOT NULL COMMENT 'Brand Id',
  `iName` varchar(50) NOT NULL COMMENT 'Item Name',
  `blockId` int(11) NOT NULL COMMENT 'Block Id',
  `size` varchar(2) NOT NULL COMMENT 'Item Size',
  `pId` int(11) NOT NULL COMMENT 'Input Price Of Item',
  `outputPrice` int(11) NOT NULL COMMENT 'Output Price Of Item',
  `orginCode` varchar(50) NOT NULL COMMENT 'Orgin Code',
  `status` tinyint(1) NOT NULL COMMENT 'Status Of Item',
  `quantity` int(11) NOT NULL COMMENT 'Quantity Of Item',
  `rId` int(11) NOT NULL COMMENT 'Rating Id',
  `discoutnStatus` tinyint(1) NOT NULL COMMENT 'Discount Status',
  `vouId` int(11) NOT NULL COMMENT 'Voucher Id',
  `taste` varchar(50) NOT NULL COMMENT 'Item Taste',
  `expiryDate` date NOT NULL COMMENT 'Expiry Date',
  `iPic` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Bảng lưu trữ thông tin của sản phẩm';

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`iId`, `tId`, `bId`, `iName`, `blockId`, `size`, `pId`, `outputPrice`, `orginCode`, `status`, `quantity`, `rId`, `discoutnStatus`, `vouId`, `taste`, `expiryDate`, `iPic`) VALUES
(1, 1, 1, 'Sting dau', 1, 'M', 1, 7000, '1', 1, 100, 1, 0, 1, 'Tang luc', '2021-12-23', 'stingdau.jpg'),
(3, 1, 1, 'Sting vang', 1, 'M', 1, 7000, '1', 1, 100, 1, 0, 1, 'tang luc', '2021-12-23', 'stingvang.jpg'),
(5, 1, 1, 'Khong do', 1, 'M', 2, 8000, '1', 1, 100, 1, 0, 1, 'Tra xanh', '2021-12-23', 'khongdo.jpg'),
(6, 1, 1, 'C2', 1, 'M', 3, 6000, '1', 1, 100, 1, 0, 1, 'Tra xanh', '2021-12-23', 'c2.jpg'),
(7, 1, 1, 'Dr.Thanh', 1, 'M', 1, 9000, '1', 1, 100, 1, 0, 1, 'Tra', '2021-12-23', 'drthanh.jpg'),
(8, 1, 1, 'Number One', 1, 'M', 1, 9000, '1', 1, 100, 1, 0, 1, 'Tang luc', '2021-12-23', 'number1.jpg'),
(9, 1, 1, 'Revive', 1, 'M', 1, 9000, '1', 1, 100, 1, 0, 1, 'Tang luc', '2021-12-23', 'revive.jpg'),
(10, 1, 1, 'Tea Plus', 1, 'M', 1, 9000, '1', 1, 100, 1, 0, 1, 'Tra', '2021-12-23', 'teaplus.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `itemcomment`
--

CREATE TABLE `itemcomment` (
  `cId` int(11) NOT NULL,
  `iId` int(11) NOT NULL,
  `uMail` varchar(100) NOT NULL,
  `content` varchar(50) NOT NULL,
  `uName` varchar(50) NOT NULL,
  `cDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `itemcomment`
--

INSERT INTO `itemcomment` (`cId`, `iId`, `uMail`, `content`, `uName`, `cDate`) VALUES
(1, 1, 'user1@gmail.com', 'good', 'nva', '2020-01-23'),
(2, 1, 'user2@gmail.com', 'good', 'nva', '2020-01-23'),
(3, 1, 'user1@gmail.com', 'good', 'nva', '2020-01-23'),
(4, 1, 'user3@gmail.com', 'good', 'nva', '2020-01-23'),
(5, 1, 'user2@gmail.com', 'good', 'nva', '2020-01-23'),
(6, 1, 'user1@gmail.com', 'good', 'nva', '2020-01-23');

-- --------------------------------------------------------

--
-- Table structure for table `itemtype`
--

CREATE TABLE `itemtype` (
  `tId` int(11) NOT NULL,
  `typeName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `itemtype`
--

INSERT INTO `itemtype` (`tId`, `typeName`) VALUES
(1, 'chai'),
(2, 'lon'),
(3, 'chai sanh');

-- --------------------------------------------------------

--
-- Table structure for table `orderdetail`
--

CREATE TABLE `orderdetail` (
  `iDetailIndex` int(11) NOT NULL,
  `oId` int(11) NOT NULL,
  `payId` int(11) NOT NULL,
  `uMail` varchar(100) NOT NULL,
  `iId` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `note` varchar(50) NOT NULL,
  `orderDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Bảng lưu trữ thông tin của order';

--
-- Dumping data for table `orderdetail`
--

INSERT INTO `orderdetail` (`iDetailIndex`, `oId`, `payId`, `uMail`, `iId`, `quantity`, `note`, `orderDate`) VALUES
(1, 1, 1, 'user2@gmail.com', 1, 5, '', '2020-01-14'),
(3, 3, 1, 'user3@gmail.com', 6, 5, '', '2020-01-14'),
(5, 2, 1, 'user1@gmail.com', 1, 3, '', '2020-01-14'),
(6, 3, 1, 'phucthce140628@fpt.edu.vn', 3, 1, '', '2020-07-24'),
(7, 3, 1, 'phucthce140628@fpt.edu.vn', 3, 1, '', '2020-07-24');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `oId` int(11) NOT NULL,
  `uMail` varchar(100) NOT NULL,
  `iId` int(11) NOT NULL,
  `orderDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`oId`, `uMail`, `iId`, `orderDate`) VALUES
(1, 'user1@gmail.com', 1, '2020-01-14'),
(2, 'user3@gmail.com', 2, '2020-01-14'),
(3, 'user2@gmail.com', 3, '2020-01-14');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `payId` int(11) NOT NULL,
  `payName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`payId`, `payName`) VALUES
(1, 'Thanh toan khi nhan hang'),
(2, 'Thanh toan bang the ngan hang');

-- --------------------------------------------------------

--
-- Table structure for table `price`
--

CREATE TABLE `price` (
  `priceId` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `date` date NOT NULL,
  `aMail` varchar(100) NOT NULL,
  `upDown` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `price`
--

INSERT INTO `price` (`priceId`, `price`, `date`, `aMail`, `upDown`) VALUES
(1, 7000, '2020-09-12', 'phuc@gmail.com\r\n', 1),
(2, 6000, '2020-09-12', 'qui@gmail.com\r\n', 0),
(3, 4000, '2020-09-12', 'tri@gmail.com\r\n', 1);

-- --------------------------------------------------------

--
-- Table structure for table `rating`
--

CREATE TABLE `rating` (
  `rId` int(11) NOT NULL,
  `uMail` varchar(100) NOT NULL,
  `rNumberStar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rating`
--

INSERT INTO `rating` (`rId`, `uMail`, `rNumberStar`) VALUES
(1, 'user1@gmail.com', 4),
(2, 'user3@gmail.com', 4),
(3, 'user3@gmail.com', 5),
(4, 'user2@gmail.com', 3),
(5, 'user2@gmail.com', 1);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `uMail` varchar(100) NOT NULL,
  `uPassword` varchar(32) NOT NULL,
  `uName` varchar(50) NOT NULL,
  `uPhone` varchar(20) NOT NULL,
  `uAddress` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`uMail`, `uPassword`, `uName`, `uPhone`, `uAddress`) VALUES
('a@gmai.com', 'e10adc3949ba59abbe56e057f20f883e', 'phuc', '0987654321', 'vl'),
('b@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', '1', '1', '1'),
('phucthce140628@fpt.edu.vn', 'e10adc3949ba59abbe56e057f20f883e', 'Hoang Phuc', '0987654321', 'Vinh Long'),
('user1@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 'Nguyen Van A', '0123456789', 'Can Tho'),
('user2@gmail.com', '415ae01d78998c8191a416ddd8cabe33', 'Tran Thi B', '0321654897', 'An Giang'),
('user3@gmail.com', '456ab20472cd48e1e621f3e8ac0f3eb1', 'Huynh Van C', '0147258963', 'Soc Trang');

-- --------------------------------------------------------

--
-- Table structure for table `vendor`
--

CREATE TABLE `vendor` (
  `vId` int(11) NOT NULL,
  `iId` int(11) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `vName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vendor`
--

INSERT INTO `vendor` (`vId`, `iId`, `address`, `email`, `phone`, `vName`) VALUES
(1, 1, 'Hau Giang', 'hg@gmail.com', '012345679', 'Thanh Cong'),
(2, 2, 'Can Tho', 'ct@gmail.com', '012345679', 'ahihi'),
(3, 3, 'Soc Trang', 'st@gmail.com', '012345679', 'Ahoho'),
(4, 4, 'Ca Mau', 'cm@gmail.com', '012345679', 'Tuan tu');

-- --------------------------------------------------------

--
-- Table structure for table `voucher`
--

CREATE TABLE `voucher` (
  `vuoId` int(11) NOT NULL,
  `vouType` varchar(50) NOT NULL,
  `vouDiscount` int(11) NOT NULL,
  `vouDescription` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `voucher`
--

INSERT INTO `voucher` (`vuoId`, `vouType`, `vouDiscount`, `vouDescription`) VALUES
(1, 'Theo ngay', 20, ''),
(2, 'Theo san pham', 10, '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`aMail`);

--
-- Indexes for table `blockitems`
--
ALTER TABLE `blockitems`
  ADD PRIMARY KEY (`blockId`);

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`bId`);

--
-- Indexes for table `discount`
--
ALTER TABLE `discount`
  ADD PRIMARY KEY (`iId`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`iId`);

--
-- Indexes for table `itemcomment`
--
ALTER TABLE `itemcomment`
  ADD PRIMARY KEY (`cId`);

--
-- Indexes for table `itemtype`
--
ALTER TABLE `itemtype`
  ADD PRIMARY KEY (`tId`);

--
-- Indexes for table `orderdetail`
--
ALTER TABLE `orderdetail`
  ADD PRIMARY KEY (`iDetailIndex`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`oId`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`payId`);

--
-- Indexes for table `price`
--
ALTER TABLE `price`
  ADD PRIMARY KEY (`priceId`);

--
-- Indexes for table `rating`
--
ALTER TABLE `rating`
  ADD PRIMARY KEY (`rId`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD UNIQUE KEY `uni_mail` (`uMail`);

--
-- Indexes for table `vendor`
--
ALTER TABLE `vendor`
  ADD PRIMARY KEY (`vId`);

--
-- Indexes for table `voucher`
--
ALTER TABLE `voucher`
  ADD PRIMARY KEY (`vuoId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `blockitems`
--
ALTER TABLE `blockitems`
  MODIFY `blockId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `brand`
--
ALTER TABLE `brand`
  MODIFY `bId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `item`
--
ALTER TABLE `item`
  MODIFY `iId` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Item Id', AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `itemcomment`
--
ALTER TABLE `itemcomment`
  MODIFY `cId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `itemtype`
--
ALTER TABLE `itemtype`
  MODIFY `tId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `orderdetail`
--
ALTER TABLE `orderdetail`
  MODIFY `iDetailIndex` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `oId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `payId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `price`
--
ALTER TABLE `price`
  MODIFY `priceId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `rating`
--
ALTER TABLE `rating`
  MODIFY `rId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `vendor`
--
ALTER TABLE `vendor`
  MODIFY `vId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `voucher`
--
ALTER TABLE `voucher`
  MODIFY `vuoId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
