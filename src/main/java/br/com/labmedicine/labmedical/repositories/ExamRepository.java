package br.com.labmedicine.labmedical.repositories;

import br.com.labmedicine.labmedical.models.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam, String> {

  Boolean existsByPatientId (String id);
  Boolean existsByUserId (String id);
}
