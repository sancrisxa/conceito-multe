package com.sancrisxa.conceitomulte.Service;

import com.sancrisxa.conceitomulte.Dto.PaginaDto;
import com.sancrisxa.conceitomulte.model.Pagina;
import com.sancrisxa.conceitomulte.repository.PaginaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class PaginaServiceImpl implements PaginaService {

    @Autowired
    PaginaRepository paginaRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public List<PaginaDto> getPaginas(Long idCapitulo) {
        List<Pagina> paginas = this.paginaRepository.findAllByIdCapitulo(idCapitulo);
        return this.convertToPaginaDto(paginas);
    }

    private List<PaginaDto> convertToPaginaDto(List<Pagina> paginas) {

        return paginas.stream().map((pagina) ->{
            return this.modelMapper.map(pagina, PaginaDto.class);
        }).collect(Collectors.toList());
    }
}
