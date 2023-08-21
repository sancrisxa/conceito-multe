package com.sancrisxa.conceitomulte.Service;

import com.sancrisxa.conceitomulte.Dto.LivroDto;
import org.springframework.stereotype.Component;

@Component
public interface LivroService {
    LivroDto getLivro(Long idLivro);
    LivroDto saveLivro(LivroDto livroDto);
}
