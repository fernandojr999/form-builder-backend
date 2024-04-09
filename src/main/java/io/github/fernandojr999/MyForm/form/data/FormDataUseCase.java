package io.github.fernandojr999.MyForm.form.data;

import io.github.fernandojr999.MyForm.form.metadata.FormMetaData;
import io.github.fernandojr999.MyForm.form.metadata.FormMetaDataRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class FormDataUseCase {

    FormDataRepository formDataRepository;
    FormMetaDataRepository formMetaDataRepository;

    public List<String> getAllByForm(UUID formDataId){
        List<String> res = new ArrayList<>();
        List<FormData> datas = formDataRepository.findByMetaDataId(formDataId);
        datas.forEach(formData -> {
            String t = formData.getContent().substring(1);
            t = "{\"id\": \""+formData.getId()+"\", "+t;
            res.add(t);
        });
        return res;
    }

    public void save(UUID formId,  String content){
        FormMetaData fmd = formMetaDataRepository.findById(formId).get();

        FormData formData = FormData.builder()
                .content(content)
                .metaData(fmd)
                .build();

        formDataRepository.save(formData);
    }

    public void delete(UUID dataId){
        formDataRepository.deleteById(dataId);
    }
}
