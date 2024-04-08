package io.github.fernandojr999.MyForm;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@MappedSuperclass
@SuperBuilder
@Data
public class BaseEntity {
    @Id
    @GeneratedValue
    protected UUID id;

    public BaseEntity() {
    }
}
