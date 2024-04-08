package io.github.fernandojr999.MyForm.form.metadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@JsonIgnoreProperties
public class FormMetaDataDto {
    UUID id;
    String name;
    List<FieldMetaDataDto> fields;

}
