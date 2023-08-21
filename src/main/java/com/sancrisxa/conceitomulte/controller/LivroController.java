package com.sancrisxa.conceitomulte.controller;

import com.sancrisxa.conceitomulte.Dto.LivroDto;
import com.sancrisxa.conceitomulte.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("livro")
public class LivroController {

    @Autowired
    LivroService livroService;

    @PostMapping
    public ResponseEntity<LivroDto> saveLivro(@RequestBody LivroDto livroDto) {
        LivroDto savedLivro = this.livroService.saveLivro(livroDto);
        return ResponseEntity.ok(livroDto);
    }
}
