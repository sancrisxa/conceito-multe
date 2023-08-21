CREATE TABLE IF NOT EXISTS `paginas` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `conteudo` text NOT NULL,
  `numero_pagina` int(4) DEFAULT NULL,
  `id_capitulo` bigint NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`id_capitulo` ) REFERENCES capitulos(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;