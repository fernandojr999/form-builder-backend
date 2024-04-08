package io.github.fernandojr999.MyForm.form.data;

import io.github.fernandojr999.MyForm.BaseEntity;
import io.github.fernandojr999.MyForm.form.metadata.FormMetaData;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormData extends BaseEntity {

    @ManyToOne
    private FormMetaData metaData;

    @Column(columnDefinition = "TEXT")
    private String content;
}
