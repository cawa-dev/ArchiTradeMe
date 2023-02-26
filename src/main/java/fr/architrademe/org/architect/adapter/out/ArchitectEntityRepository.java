package fr.architrademe.org.architect.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArchitectEntityRepository extends JpaRepository<ArchitectEntity, String> {
    List<ArchitectEntity> findArchitectEntitiesByFirstname(String firstname);
}