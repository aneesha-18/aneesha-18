CREATE TABLE firstdb.orders (
  `order_id` varchar(256) NOT NULL,
  `order_remarks` varchar(256),
  `reviewed_date` timestamp NOT NULL,
  `review_rating` int(11) NOT NULL,
  `review_question` varchar(100),
  `review_option` varchar(256),
  `review_remarks` varchar(256),
)