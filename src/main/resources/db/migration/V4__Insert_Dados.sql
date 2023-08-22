INSERT INTO `multe`.`livros`
(`id`,
`titulo`,
`autor`,
`editora`)
VALUES
(1,
'Java como Programar',
'Paul Deitel',
'Pearson Universidades');


INSERT INTO `multe`.`capitulos`
(`id`,
`titulo`,
`numero_capitulo`,
`id_livro`)
VALUES
(1,
'titulo1 Introdução',
1,
1);

INSERT INTO `multe`.`capitulos`
(`id`,
`titulo`,
`numero_capitulo`,
`id_livro`)
VALUES
(2,
'titulo2 Programando',
2,
1);



INSERT INTO `multe`.`paginas`
(`id`,
`conteudo`,
`numero_pagina`,
`id_capitulo`)
VALUES
(1,
'Lorem ipsum',
10,
1);

INSERT INTO `multe`.`paginas`
(`id`,
`conteudo`,
`numero_pagina`,
`id_capitulo`)
VALUES
(2,
'Lorem ipsum 2',
20,
2);