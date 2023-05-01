package br.com.labmedicine.labmedical.repositories;

import br.com.labmedicine.labmedical.models.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization, String> {
}
