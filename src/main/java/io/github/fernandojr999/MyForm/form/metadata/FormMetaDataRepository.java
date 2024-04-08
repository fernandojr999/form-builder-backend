package io.github.fernandojr999.MyForm.form.metadata;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FormMetaDataRepository extends JpaRepository<FormMetaData, UUID> {
}
