package io.github.fernandojr999.MyForm.form.metadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@JsonIgnoreProperties
public class FieldMetaDataDto {
    private String name;
    private FieldInputType type;
    private Boolean mandatory;
}
