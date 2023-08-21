package com.sancrisxa.conceitomulte.Service;

import com.sancrisxa.conceitomulte.Dto.LivroDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

@Service
@AllArgsConstructor
public class XmlServiceImpl implements XmlService {
    @Override
    public void convertToXml(LivroDto livroDto) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(LivroDto.class);

            Marshaller marshaller = jaxbContext.createMarshaller();

            File file = new File("src\\main\\resources\\LivroDto.xml");

            marshaller.marshal(livroDto, file);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
