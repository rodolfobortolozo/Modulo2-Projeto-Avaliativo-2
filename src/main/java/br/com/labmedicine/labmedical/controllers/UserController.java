package br.com.labmedicine.labmedical.controllers;

import br.com.labmedicine.labmedical.dto.request.UserRequest;
import br.com.labmedicine.labmedical.dto.request.UserRequestPass;
import br.com.labmedicine.labmedical.dto.response.UserResponse;
import br.com.labmedicine.labmedical.services.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping({"/api/usuarios","/doctor"})
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  public ResponseEntity<Object> getAll(){

    return this.userService.getAll();
  }

  @PostMapping
  public ResponseEntity<UserResponse> saveUser(@Valid @RequestBody UserRequest userRequest){

    return this.userService.save(userRequest);
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<Optional<UserResponse>> getbyUserId(@PathVariable(name = "id") String id){

    return this.userService.getById(id);
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Optional<UserResponse>> updateUser(@PathVariable(name ="id")String id,
                                                           @Valid @RequestBody UserRequest userRequest){

    return this.userService.update(id, userRequest);
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Object> deleteUser(@PathVariable(name = "id") String id){

    return this.userService.deleteById(id);
  }

  @PutMapping(path = {"/{id}/password", "/{id}/senha"})
  public ResponseEntity<Optional<UserResponse>> updatePasswordUser(@PathVariable(name ="id")String id,
                                                                   @Valid @RequestBody UserRequestPass userRequestPass){

    return this.userService.updatePassword(id, userRequestPass);
  }

}
