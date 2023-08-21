package com.sancrisxa.conceitomulte.Service;

import com.sancrisxa.conceitomulte.Dto.CapituloDto;
import com.sancrisxa.conceitomulte.Dto.LivroDto;
import com.sancrisxa.conceitomulte.Dto.PaginaDto;
import com.sancrisxa.conceitomulte.model.Livro;
import com.sancrisxa.conceitomulte.repository.LivroRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class LivroServiceImpl implements LivroService{

    @Autowired
    CapituloService capituloService;
    @Autowired
    PaginaService paginaService;
    @Autowired
    LivroRepository livroRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public LivroDto getLivro(Long idLivro) {

        Livro livro = this.livroRepository.getById(idLivro);

        LivroDto livroDto = this.modelMapper.map(livro, LivroDto.class);

        List<CapituloDto> capitulos = this.capituloService.getCapitulos(idLivro);

        capitulos.stream().map(capituloDto -> {

            List<PaginaDto> paginas = this.paginaService.getPaginas(capituloDto.getId());

            capituloDto.setPaginas(paginas);

            return capituloDto;
        });

        livroDto.setCapitulos(capitulos);

        return livroDto;
    }
}
