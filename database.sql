SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


CREATE TABLE `barang` (
  `id` smallint UNSIGNED NOT NULL,
  `nama` varchar(50) NOT NULL,
  `harga` float NOT NULL
);

INSERT INTO `barang` (`id`, `nama`, `harga`) VALUES
(1111, 'Chitato', 10000),
(1112, 'Ginjal', 20000),
(1114, 'Hati', 69000),
(1115, 'Lays', 12000),
(1116, 'Indomie', 3000),
(1117, 'Popmie', 5000);

ALTER TABLE `barang`
  ADD PRIMARY KEY (`id`);
COMMIT;