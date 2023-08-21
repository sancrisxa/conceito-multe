package com.sancrisxa.conceitomulte.Service;

import com.sancrisxa.conceitomulte.Dto.PaginaDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PaginaService {

    List<PaginaDto> getPaginas(Long idCapitulo);
}
