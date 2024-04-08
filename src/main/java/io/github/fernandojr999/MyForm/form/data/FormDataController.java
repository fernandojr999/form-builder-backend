package io.github.fernandojr999.MyForm.form.data;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("data")
@AllArgsConstructor
public class FormDataController {
    FormDataUseCase formDataUseCase;

    @GetMapping("/{formId}")
    public List<String> getAllByForm(@PathVariable UUID formId){
        return formDataUseCase.getAllByForm(formId);
    }

    @PostMapping("/{formId}")
    public void save(@PathVariable UUID formId, @RequestBody String content){
        formDataUseCase.save(formId, content);
    }

}
