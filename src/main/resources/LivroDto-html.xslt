<?xml version="1.0" encoding="UTF-8"?>
<html xsl:version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <body style="font-size:12pt;background-color:#EEEEEE">
        <h1 style="font-size:20pt;color:#FF0000">Conceito Multe</h1>
        <xsl:for-each select="livroDto">
            <ul>
                <li>
                    Autor do livro - <xsl:value-of select="autor"/>
                </li>
                <li>
                    Editora do livro - <xsl:value-of select="editora"/>
                </li>
                <li>
                    Título do livro - <xsl:value-of select="titulo"/>
                </li>
                <li>
                    <xsl:for-each select="capitulos">
                        <ul>
                            <li>
                                Numero do Capitulo - <xsl:value-of select="numeroCapitulo"/>
                            </li>
                            <li>
                                Titulo do capitulo - <xsl:value-of select="titulo"/>
                            </li>
                            <li>
                                <xsl:for-each select="paginas">
                                    <ul>
                                        <li>
                                            Conteudo da pagina - <xsl:value-of select="conteudo"/>
                                        </li>
                                        <li>
                                            Numero da pagina - <xsl:value-of select="numeroPagina"/>
                                        </li>
                                    </ul>
                                </xsl:for-each>
                            </li>
                        </ul>
                    </xsl:for-each>
                </li>
            </ul>
        </xsl:for-each>
    </body>
</html>