package io.github.fernandojr999.MyForm.form.data;

import io.github.fernandojr999.MyForm.form.metadata.FormMetaData;
import io.github.fernandojr999.MyForm.form.metadata.FormMetaDataRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class FormDataUseCase {

    FormDataRepository formDataRepository;
    FormMetaDataRepository formMetaDataRepository;

    public List<String> getAllByForm(UUID formDataId){
        return formDataRepository.findByMetaDataId(formDataId).stream().map(FormData::getContent).toList();
    }

    public void save(UUID formId,  String content){
        FormMetaData fmd = formMetaDataRepository.findById(formId).get();

        FormData formData = FormData.builder()
                .content(content)
                .metaData(fmd)
                .build();

        formDataRepository.save(formData);
    }
}
