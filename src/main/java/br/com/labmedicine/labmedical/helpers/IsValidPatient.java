package br.com.labmedicine.labmedical.helpers;

import br.com.labmedicine.labmedical.exceptions.UserExeception;
import br.com.labmedicine.labmedical.models.Patient;
import br.com.labmedicine.labmedical.repositories.PatientRepository;
import org.springframework.stereotype.Component;

@Component
public class IsValidPatient {

  private final PatientRepository patientRepository;

  public IsValidPatient(PatientRepository patientRepository) {
    this.patientRepository = patientRepository;
  }


  /**
   *  Verifica se Existe o Paciente Cadastrado
   * @param id
   * @return Patient
   */

  public Patient isValid(String id) {

    return this.patientRepository.findById(id)
            .orElseThrow(()-> new UserExeception("Paciente não Encontrado"));
  }

}
