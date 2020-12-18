-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 17, 2020 at 05:15 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sistem_parkir`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `username` text NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
(1, 'renaldi825190043', '825190043'),
(2, 'robin825190049', '825190049'),
(3, 'chelsen825190099', '825190099');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_parkir`
--

CREATE TABLE `tabel_parkir` (
  `no_tiket` bigint(20) UNSIGNED NOT NULL,
  `no_plat` text NOT NULL,
  `jenis_kendaraan` text NOT NULL,
  `durasi_parkir` text NOT NULL,
  `biaya_parkir` int(11) NOT NULL,
  `biaya_total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabel_parkir`
--

INSERT INTO `tabel_parkir` (`no_tiket`, `no_plat`, `jenis_kendaraan`, `durasi_parkir`, `biaya_parkir`, `biaya_total`) VALUES
(2, 'B825TY', 'Mobil', '5', 5000, 25000),
(4, 'B420KY', 'Motor', '7', 3000, 21000),
(5, 'B8275GH', 'Mobil', '6', 5000, 30000),
(7, 'B8266KY', 'Motor', '6', 3000, 18000);

-- --------------------------------------------------------

--
-- Table structure for table `tabel_pendapatan`
--

CREATE TABLE `tabel_pendapatan` (
  `no_tiket` bigint(20) NOT NULL,
  `no_plat` text NOT NULL,
  `jenis_kendaraan` text NOT NULL,
  `durasi_parkir` text NOT NULL,
  `biaya_parkir` int(11) NOT NULL,
  `biaya_total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabel_pendapatan`
--

INSERT INTO `tabel_pendapatan` (`no_tiket`, `no_plat`, `jenis_kendaraan`, `durasi_parkir`, `biaya_parkir`, `biaya_total`) VALUES
(1, 'B123PA', 'Mobil', '3', 5000, 15000),
(2, 'B825TY', 'Mobil', '5', 5000, 25000),
(3, 'B365RP', 'Motor', '2', 3000, 6000),
(4, 'B420KY', 'Motor', '7', 3000, 21000),
(5, 'B8275GH', 'Mobil', '6', 5000, 30000),
(6, 'B7265YG', 'Motor', '3', 3000, 9000),
(7, 'B8266KY', 'Motor', '6', 3000, 18000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `tabel_parkir`
--
ALTER TABLE `tabel_parkir`
  ADD PRIMARY KEY (`no_tiket`),
  ADD UNIQUE KEY `no_tiket` (`no_tiket`);

--
-- Indexes for table `tabel_pendapatan`
--
ALTER TABLE `tabel_pendapatan`
  ADD PRIMARY KEY (`no_tiket`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tabel_parkir`
--
ALTER TABLE `tabel_parkir`
  MODIFY `no_tiket` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tabel_pendapatan`
--
ALTER TABLE `tabel_pendapatan`
  MODIFY `no_tiket` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
