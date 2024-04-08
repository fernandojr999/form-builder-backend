package io.github.fernandojr999.MyForm.form.metadata;

import io.github.fernandojr999.MyForm.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class FormMetaData extends BaseEntity {

    private String name;

    @Column(columnDefinition = "TEXT")
    private String content;
}
