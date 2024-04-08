package io.github.fernandojr999.MyForm.form.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FormDataRepository extends JpaRepository<FormData, UUID> {
    List<FormData> findByMetaDataId(UUID formDataId);
}
