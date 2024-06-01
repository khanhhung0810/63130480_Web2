-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2024 at 05:44 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ql_banthuoc`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `id` int(10) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`id`, `username`, `password`, `email`) VALUES
(1, 'admin', 'admin', 'kasdad@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `account_seq`
--

CREATE TABLE `account_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `account_seq`
--

INSERT INTO `account_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `category_id` int(11) NOT NULL,
  `category_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`category_id`, `category_name`) VALUES
(1, 'Thực phẩm chức năng'),
(2, 'Chăm sóc cá nhân'),
(3, 'Thuốc'),
(4, 'Thiết bị y tế');

-- --------------------------------------------------------

--
-- Table structure for table `categories_seq`
--

CREATE TABLE `categories_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `categories_seq`
--

INSERT INTO `categories_seq` (`next_val`) VALUES
(201);

-- --------------------------------------------------------

--
-- Table structure for table `orderdetail`
--

CREATE TABLE `orderdetail` (
  `order_detail_id` int(11) NOT NULL,
  `order_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `price` decimal(38,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `orderdetail_seq`
--

CREATE TABLE `orderdetail_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orderdetail_seq`
--

INSERT INTO `orderdetail_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `order_id` int(11) NOT NULL,
  `order_date` datetime(6) DEFAULT NULL,
  `customer_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `orders_seq`
--

CREATE TABLE `orders_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orders_seq`
--

INSERT INTO `orders_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `product_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `category_id` int(11) NOT NULL,
  `hoat_chat` varchar(255) DEFAULT NULL,
  `chi_dinh` text DEFAULT NULL,
  `dang_bao_che` varchar(255) DEFAULT NULL,
  `noi_san_xuat` varchar(255) DEFAULT NULL,
  `luu_y` text DEFAULT NULL,
  `anh` varchar(255) DEFAULT NULL,
  `gia_tien` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`product_id`, `name`, `category_id`, `hoat_chat`, `chi_dinh`, `dang_bao_che`, `noi_san_xuat`, `luu_y`, `anh`, `gia_tien`) VALUES
(1, 'Bột hít Seretide Accuhaler 50/250mcg điều trị hen, bệnh phổi tắc nghẽn mãn tính', 3, 'Salmeterol; Fluticason', 'Điều trị hen suyễn, Bệnh phổi tắc nghẽn mãn tính', 'Bột hít phân liều', 'GlaxoSmithKline ETC', 'Sản phẩm này chỉ bán khi có chỉ định của bác sĩ, mọi thông tin trên đây chỉ mang tính chất tham khảo. Vui lòng đọc kĩ thông tin chi tiết ở tờ hướng dẫn sử dẫn của sản phẩm.', '1.png', 30000),
(2, 'Bột pha uống Acehasan 200mg tiêu chất nhầy trong bệnh nhầy nhớt', 3, 'Acetylcystein', 'Tiêu chất nhầy trong Bệnh nhầy nhớt', 'Bột pha dung dịch uống', 'Hasan- Demarpharm', 'Mọi thông tin trên đây chỉ mang tính chất tham khảo. Vui lòng đọc kĩ thông tin chi tiết ở tờ hướng dẫn sử dẫn của sản phẩm.', '3.png', 20000),
(3, 'Bột pha uống Bioflora 100mg trị tiêu chảy cấp ở trẻ em, người lớn ', 3, 'Saccharomyces Boulardii', 'Phòng ngừa và Điều trị tiêu chảy cấp ở trẻ em, người lớn', 'Bột pha hỗn dịch uống', 'Biocodex, France Kisska Int. Ltd., UK', 'Mọi thông tin trên đây chỉ mang tính chất tham khảo. Vui lòng đọc kĩ thông tin chi tiết ở tờ hướng dẫn sử dẫn của sản phẩm.', '2.png', 115000),
(4, 'Bàn chải đánh răng Close up Precision Clean ', 2, 'PETG, PBT, Nickel Silver. Chiều dài bàn chải 180,5±1mm.', 'Không có', 'Không có', 'Unilever', '\r\nMọi thông tin trên đây chỉ mang tính chất tham khảo. Đọc kỹ hướng dẫn sử dụng trước khi dùng', '4.png', 42000),
(5, 'Chai xịt nước rửa tay hương trà xanh Green Cross', 2, 'Ethanol, Water, Glycerin, Carbomer, Fragrance, Triethanolamine, Benzalkonium Chloride 80%', 'Làm sạch tay, kháng khuẩn, khử mùi, giữ ẩm và bảo vệ da tay.\r\n\r\n', 'Không có', 'Công ty TNHH Green Cross Việt Nam', 'Cho một lượng nhỏ trên tay rồi xoa đều, không cần rửa lại với nước.', '5.png', 35000),
(6, 'Nước rửa tay bảo vệ vượt trội Lifebuoy', 2, 'Water, Sodium Laureth Sulfate, Sodium Chloride, Cocamide MEA, Perfume, Silver Oxide...', 'Sản phẩm nước rửa tay, làm sạch tay và giúp loại bỏ vi khuẩn', 'Không có', ' CÔNG TY TNHH QUỐC TẾ UNILEVER VIỆT NAM', 'Mọi thông tin trên đây chỉ mang tính chất tham khảo. Đọc kỹ hướng dẫn sử dụng trước khi dùng', '6.png', 40000),
(7, 'Cốm pha hỗn dịch uống Probio Imexpharm giúp cân bằng hệ vi sinh đường ruột', 1, 'Mỗi gói chứa: >= 10 vi sinh sống Lactobacillus acidophilus (dạng bột đông khô).\r\nTá dược: Maltodextr', 'Giúp cân bằng hệ vi sinh đường ruột. Hỗ trợ làm giảm các triệu chứng tiêu chảy, táo bón do loạn khuẩn đường ruột', 'Không có', 'Công ty Cổ phần Dược phẩm Imexpharm (Việt Nam)', 'Không sử dụng cho người mẫn cảm với bất kỳ thành phần nào của sản phẩm', '7.png', 21000),
(8, 'Kẹo ngậm Eugica Candy làm dịu cơn ho và giảm đau rát họng', 1, 'Tinh dầu bạc hà: 7 mg Tinh dầu quế: 1 mg Tinh dầu khuynh diệp: 0,6 mg Tinh dầu gừng: 0,6 mg Tinh dầu', 'Người lớn và trẻ em từ 6 tuổi trở lên.', 'Không có', 'Công ty cổ phần BIBICA', 'Sản phẩm này không phải là thuốc, không có tác dụng thay thế thuốc chữa bệnh. Đọc kỹ tờ hướng dẫn sử dụng trước khi dùng.', '8.png', 30000),
(9, 'Men vi sinh dạng uống Pharmacity Probiotics + Zinc', 1, 'Kẽm Sulfat, Bacillus clausii', 'Trẻ em từ 6 tháng tuổi và người lớn rối loạn tiêu hóa do loạn khuẩn đường ruột, uống kháng sinh gây loạn khuẩn đường ruột.', 'Không có', 'Công ty Cổ phần Dược phẩm Imexpharm (Việt Nam)', 'Sản phẩm này không phải là thuốc, không có tác dụng thay thế thuốc chữa bệnh. Đọc kỹ tờ hướng dẫn sử dụng trước khi dùng.', '9.png', 110000);

-- --------------------------------------------------------

--
-- Table structure for table `products_seq`
--

CREATE TABLE `products_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products_seq`
--

INSERT INTO `products_seq` (`next_val`) VALUES
(251);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`,`email`);

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`category_id`);

--
-- Indexes for table `orderdetail`
--
ALTER TABLE `orderdetail`
  ADD PRIMARY KEY (`order_detail_id`),
  ADD KEY `order_id` (`order_id`),
  ADD KEY `product_id` (`product_id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`product_id`),
  ADD KEY `category_id` (`category_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `category_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `orderdetail`
--
ALTER TABLE `orderdetail`
  MODIFY `order_detail_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orderdetail`
--
ALTER TABLE `orderdetail`
  ADD CONSTRAINT `orderdetail_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`),
  ADD CONSTRAINT `orderdetail_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`);

--
-- Constraints for table `products`
--
ALTER TABLE `products`
  ADD CONSTRAINT `products_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `categories` (`category_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
