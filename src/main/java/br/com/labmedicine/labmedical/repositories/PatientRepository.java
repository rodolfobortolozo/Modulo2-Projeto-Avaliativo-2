package br.com.labmedicine.labmedical.repositories;

import br.com.labmedicine.labmedical.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, String> {

  Optional<Patient> findByCpf(String cpf);
}
