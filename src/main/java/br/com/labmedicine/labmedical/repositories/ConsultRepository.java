package br.com.labmedicine.labmedical.repositories;

import br.com.labmedicine.labmedical.models.Consult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultRepository extends JpaRepository<Consult, String> {

  Boolean existsByPatientId (String id);

  Boolean existsByUserId (String id);

}
