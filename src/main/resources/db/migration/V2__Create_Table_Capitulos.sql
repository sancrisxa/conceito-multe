CREATE TABLE IF NOT EXISTS `capitulos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `titulo` varchar(50) NOT NULL,
  `numero_capitulo` int(7) NOT NULL,
  `id_livro` bigint NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`id_livro` ) REFERENCES livros(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;