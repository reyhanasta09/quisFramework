-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 15.15
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `15tic`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cv_1069`
--

CREATE TABLE `cv_1069` (
  `nim` bigint(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `prodi` varchar(30) DEFAULT NULL,
  `minuman_id_nilai` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `cv_1069`
--

INSERT INTO `cv_1069` (`nim`, `nama`, `prodi`, `minuman_id_nilai`) VALUES
(60, 'reyhan', 'TI', NULL),
(61, 'caul', 'SI', NULL),
(63, 'mochan', 'TK', NULL);

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1069`
--

CREATE TABLE `nilai_1069` (
  `id_nilai` bigint(20) NOT NULL,
  `grade` varchar(255) DEFAULT NULL,
  `nilai` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `nilai_1069`
--

INSERT INTO `nilai_1069` (`id_nilai`, `grade`, `nilai`) VALUES
(1, 'A', '80-100'),
(2, 'B', '60-79'),
(3, 'C', '50-59');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1069`
--
ALTER TABLE `cv_1069`
  ADD PRIMARY KEY (`nim`),
  ADD UNIQUE KEY `UK_biqqm2upbhxt3di4amnc8jxem` (`nama`),
  ADD KEY `FKg59dxcrvubek506y73881x971` (`minuman_id_nilai`);

--
-- Indexes for table `nilai_1069`
--
ALTER TABLE `nilai_1069`
  ADD PRIMARY KEY (`id_nilai`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1069`
--
ALTER TABLE `cv_1069`
  MODIFY `nim` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=64;
--
-- AUTO_INCREMENT for table `nilai_1069`
--
ALTER TABLE `nilai_1069`
  MODIFY `id_nilai` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `cv_1069`
--
ALTER TABLE `cv_1069`
  ADD CONSTRAINT `FKg59dxcrvubek506y73881x971` FOREIGN KEY (`minuman_id_nilai`) REFERENCES `nilai_1069` (`id_nilai`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
