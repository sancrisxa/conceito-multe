package com.sancrisxa.conceitomulte.Service;

import com.sancrisxa.conceitomulte.Dto.CapituloDto;
import com.sancrisxa.conceitomulte.model.Capitulo;
import com.sancrisxa.conceitomulte.repository.CapituloRepository;
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
public class CapituloServiceImpl implements CapituloService{
    @Autowired
    CapituloRepository capituloRepository;

    @Autowired
    ModelMapper modelMapper;

    public List<CapituloDto> getCapitulos(Long idLivro) {

        List<Capitulo> capitulos = this.capituloRepository.findByIdLivro(idLivro);

        return convertToCapituloDto(capitulos);
    }

    private List<CapituloDto> convertToCapituloDto(List<Capitulo> capitulos) {

        return capitulos.stream().map((capitulo) -> this.modelMapper.map(capitulo, CapituloDto.class)).collect(Collectors.toList());
    }
}
