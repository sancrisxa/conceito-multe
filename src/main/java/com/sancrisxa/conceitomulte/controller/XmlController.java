package com.sancrisxa.conceitomulte.controller;

import com.sancrisxa.conceitomulte.Dto.LivroDto;
import com.sancrisxa.conceitomulte.Service.LivroService;
import com.sancrisxa.conceitomulte.Service.XmlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("livro")
public class XmlController {

    @Autowired
    LivroService livroService;

    @Autowired
    XmlService xmlService;

    @GetMapping("/{idLivro}")
    public ResponseEntity<LivroDto> getLivro(@PathVariable Long idLivro) {

        LivroDto livro = this.livroService.getLivro(idLivro);

        //this.xmlService.convertToXml(livro);

        return ResponseEntity.ok(livro);

    }
}
