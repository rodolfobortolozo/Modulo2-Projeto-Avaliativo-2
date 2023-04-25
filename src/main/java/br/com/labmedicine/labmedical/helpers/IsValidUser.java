package br.com.labmedicine.labmedical.helpers;

import br.com.labmedicine.labmedical.exceptions.UserExeception;
import br.com.labmedicine.labmedical.models.User;
import br.com.labmedicine.labmedical.repositories.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class IsValidUser {

  private final UserRepository userRepository;

  public IsValidUser(UserRepository userRepository) {
    this.userRepository = userRepository;
  }



  /**
   *  Verifica se Existe o Usuário Cadastrado
   * @param id
   * @return User
   */
  public User isValid(String id) {

    return this.userRepository.findById(id)
            .orElseThrow(()-> new UserExeception("Médico não Encontrado"));
  }

}
