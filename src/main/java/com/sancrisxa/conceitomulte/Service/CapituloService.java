package com.sancrisxa.conceitomulte.Service;

import com.sancrisxa.conceitomulte.Dto.CapituloDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CapituloService {
    List<CapituloDto> getCapitulos(Long id);
}
