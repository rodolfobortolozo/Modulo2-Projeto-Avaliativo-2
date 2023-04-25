package br.com.labmedicine.labmedical.repositories;

import br.com.labmedicine.labmedical.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

  Optional<User> findByCpf(String cpf);

}
