<?xml version="1.0" encoding="UTF-8"?>
<html xsl:version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <body style="font-size:12pt;background-color:#EEEEEE">
        <h1 style="font-size:20pt;color:#FF0000">Conceito Multe</h1>
        <xsl:for-each select="livroDto">
            <ul>
                <li>
                    <xsl:value-of select="autor"/>
                </li>
                <li>
                    <xsl:value-of select="editora"/>
                </li>
                <li>
                    <xsl:value-of select="titulo"/>
                </li>
            </ul>
        </xsl:for-each>
    </body>
</html>