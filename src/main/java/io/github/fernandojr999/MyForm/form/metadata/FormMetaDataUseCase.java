package io.github.fernandojr999.MyForm.form.metadata;

import io.github.fernandojr999.MyForm.JsonMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class FormMetaDataUseCase {
    FormMetaDataRepository formMetaDataRepository;
    JsonMapper jsonMapper;

    public List<FormMetaDataDto> getAll(){
        List<FormMetaData> formMetaData = formMetaDataRepository.findAll();
        List<FormMetaDataDto> formMetaDataDtos = new ArrayList<>();

        formMetaData.forEach(formMetaData1 -> {
            FormMetaDataDto formMetaDataDto = jsonMapper.toObject(formMetaData1.getContent(), FormMetaDataDto.class);
            formMetaDataDto.setName(formMetaData1.getName());
            formMetaDataDto.setId(formMetaData1.getId());
            formMetaDataDtos.add(formMetaDataDto);
        });

        return formMetaDataDtos;
    }

    public void save(FormMetaDataDto formMetaDataDto){
        FormMetaData metaData = FormMetaData.builder()
                .name(formMetaDataDto.getName())
                .content(jsonMapper.toString(formMetaDataDto))
                .build();
        formMetaDataRepository.save(metaData);

    }
}
