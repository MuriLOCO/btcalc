CREATE SCHEMA `btcalc`;

USE `btcalc`;

CREATE TABLE `btc_fixed_values` (
  `id`             INT(11) NOT NULL AUTO_INCREMENT,
  `btc_difficulty` VARCHAR(50) NOT NULL,
  `block_reward`   VARCHAR(50) NOT NULL,
  `btc_us_dollar`  VARCHAR(50) NOT NULL,
  `last_update`    TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL,  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


INSERT INTO `btc_fixed_values`(`btc_difficulty`, `block_reward`, `btc_us_dollar`) VALUES ('217375482757.23800000', '12.50000000', '588.00010000');
