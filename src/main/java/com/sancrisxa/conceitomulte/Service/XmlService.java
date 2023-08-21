package com.sancrisxa.conceitomulte.Service;

import com.sancrisxa.conceitomulte.Dto.LivroDto;
import org.springframework.stereotype.Component;

@Component
public interface XmlService {

    public void convertToXml(LivroDto livroDto);
}
