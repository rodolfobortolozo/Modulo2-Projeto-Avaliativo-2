package br.com.labmedicine.labmedical.services;

import br.com.labmedicine.labmedical.dto.request.UserRequest;
import br.com.labmedicine.labmedical.dto.request.UserRequestPass;
import br.com.labmedicine.labmedical.dto.response.UserResponse;
import br.com.labmedicine.labmedical.exceptions.UserConflitExeception;
import br.com.labmedicine.labmedical.exceptions.UserExeception;
import br.com.labmedicine.labmedical.exceptions.UserNotFoundExeception;
import br.com.labmedicine.labmedical.mappers.UserMapper;
import br.com.labmedicine.labmedical.repositories.ConsultRepository;
import br.com.labmedicine.labmedical.repositories.ExamRepository;
import br.com.labmedicine.labmedical.repositories.UserRepository;
import br.com.labmedicine.labmedical.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

  private final UserRepository userRepository;

    private final ExamRepository examRepository;
    private final ConsultRepository consultRepository;


  private String MSG_NOT_FOUND = "Nenhum Registro Encontrado com o id: ";

  public UserService(UserRepository userRepository, ExamRepository examRepository, ConsultRepository consultRepository) {
    this.userRepository = userRepository;
      this.examRepository = examRepository;
      this.consultRepository = consultRepository;
  }

  public ResponseEntity<Object> getAll(){

    return ResponseEntity.status(HttpStatus.OK).body(
            this.userRepository.findAll().stream()
                    .map(UserMapper.INSTANCE::userToUserResponse
                    ));

  }

  public ResponseEntity<UserResponse> save(UserRequest userRequest){

    if(this.userRepository.findByCpf(userRequest.getCpf()).isPresent()) {
      throw new UserConflitExeception("Cpf Ja Cadastrado");
    }

    User user = UserMapper.INSTANCE.reqtoUser(userRequest);
    User newUser = this.userRepository.save(user);

    return ResponseEntity.status(HttpStatus.CREATED).body(UserMapper.INSTANCE.userToUserResponse(newUser));
  }

  public ResponseEntity<Optional<UserResponse>> getById(String id){

    return ResponseEntity.status(HttpStatus.OK).body(
            Optional.ofNullable(
                    this.userRepository.findById(id)
                            .map(UserMapper.INSTANCE::userToUserResponse)
                            .orElseThrow(() -> new UserNotFoundExeception(MSG_NOT_FOUND +id))
            )
    );

  }

  public ResponseEntity<Optional<UserResponse>> update(String id, UserRequest userRequest){

    return  ResponseEntity.status(HttpStatus.OK).body(
            Optional.ofNullable(
                    this.userRepository.findById(id)
                            .map(s -> {

                              User user = UserMapper.INSTANCE.reqtoUser(userRequest);
                              user.setId(id);
                              user.setPassword(s.getPassword());
                              User newUser = this.userRepository.save(user);
                              return UserMapper.INSTANCE.userToUserResponse(newUser);

                            })
                            .orElseThrow(() -> new UserNotFoundExeception(MSG_NOT_FOUND +id)))
    );

  }

  public ResponseEntity<Object> deleteById(String id)  {

      if(this.consultRepository.existsByUserId(id) || this.examRepository.existsByUserId(id)){
          throw new UserExeception("Médico possui Exame/ Consulta Cadastrada");
      }

    return this.userRepository.findById(id)
            .map( user -> {

              this.userRepository.deleteById(user.getId());
              return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);

            }).orElseThrow(() -> new UserNotFoundExeception(MSG_NOT_FOUND +id));

  }

  public ResponseEntity<Optional<UserResponse>> updatePassword(String id, UserRequestPass userRequestPass){

    return  ResponseEntity.status(HttpStatus.OK).body(
            Optional.ofNullable(
                    this.userRepository.findById(id)
                            .map(user -> {

                              if(Objects.equals(user.getPassword(), userRequestPass.getPassword())){

                                user.setPassword(userRequestPass.getNewPassword());
                                User newUser = this.userRepository.save(user);
                                return UserMapper.INSTANCE.userToUserResponse(newUser);

                              }else{
                                throw  new UserExeception("Senha Atual não corresponde com a cadastrada");
                              }
                            })
                            .orElseThrow(() -> new UserNotFoundExeception(MSG_NOT_FOUND +id)))
    );

  }

}
