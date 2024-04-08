package io.github.fernandojr999.MyForm.form.metadata;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("metadata")
@AllArgsConstructor
public class FormMetaDataController {
    FormMetaDataUseCase formMetaDataUseCase;

    @GetMapping
    public List<FormMetaDataDto> getAll(){
        return formMetaDataUseCase.getAll();
    }

    @PostMapping
    public void save(@RequestBody FormMetaDataDto formMetaDataDto){
        formMetaDataUseCase.save(formMetaDataDto);
    }

}
