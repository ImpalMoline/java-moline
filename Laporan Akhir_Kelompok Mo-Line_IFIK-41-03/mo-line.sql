-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 02, 2019 at 08:04 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mo-line`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id_cust` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `tgl_lahir` varchar(30) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `no_telp` varchar(14) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id_cust`, `password`, `nama`, `tgl_lahir`, `gender`, `alamat`, `no_telp`) VALUES
('abim@gmail.com', 'abim456', 'Anhar Abim', '7 June 1950', 'LAKI-LAKI', 'Wisma Embun', '085377772222'),
('admin', 'admin', 'admin', '1 January 1945', 'LAKI-LAKI', 'admin', '000000000000'),
('anhar1@gmail.com', 'yuhu', 'anhar', '1 January 2000', 'LAKI-LAKI', 'sukabirus', '23456'),
('fajar@gmail.com', 'fajar', 'fajar', '2 March 1949', 'LAKI-LAKI', 'Warung', '0888812345678'),
('pevita@gmail.com', 'sayang', 'pevita pearce', '20 September 1999', 'PEREMPUAN', 'kontakan ajis', '12345'),
('siapaja@gmail.com', 'yayaya', 'saya siapa', '14 February 1999', 'PEREMPUAN', 'Jl. in aja dulu', '082233887766');

-- --------------------------------------------------------

--
-- Table structure for table `pesan`
--

CREATE TABLE `pesan` (
  `id_kendaraan` varchar(14) NOT NULL,
  `id_cust` varchar(50) NOT NULL,
  `merek` varchar(50) DEFAULT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `tahun` varchar(5) DEFAULT NULL,
  `descript` varchar(255) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pesan`
--

INSERT INTO `pesan` (`id_kendaraan`, `id_cust`, `merek`, `nama`, `tahun`, `descript`, `status`) VALUES
('BK 1234 ZZ', 'admin', 'Honda', 'Brio', '2015', 'Kabin kekecilan', 'Selesai'),
('f 474 r', 'pevita@gmail.com', 'asoy', 'punten', '2002', 'ga idup dari pertama beli', 'Selesai'),
('N 383 NG', 'siapaja@gmail.com', 'toyota', 'camry', '1945', 'mesin mati tapi nyala', 'Batal'),
('F 777 r', 'anhar1@gmail.com', 'toyota', 'camry', '2006', 'mati dari pagi keluar asap', 'Selesai');

-- --------------------------------------------------------

--
-- Table structure for table `rating`
--

CREATE TABLE `rating` (
  `id_montir` varchar(10) NOT NULL,
  `nama_montir` varchar(50) DEFAULT NULL,
  `star` int(1) DEFAULT NULL,
  `ket_star` varchar(20) DEFAULT NULL,
  `masukan` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rating`
--

INSERT INTO `rating` (`id_montir`, `nama_montir`, `star`, `ket_star`, `masukan`) VALUES
('MO-003', 'Craig Mammalton', 4, 'BAIK', 'Montirnya cakep'),
('MO-002', 'Zit Tooya', 5, 'SANGAT BAIK', 'Montirnya sudah pro'),
('MO-002', 'Zit Tooya', 4, 'BAIK', 'semoga ada ga punya mobil kaya saya'),
('MO-002', 'Zit Tooya', 5, 'SANGAT BAIK', 'good job');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id_cust`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
