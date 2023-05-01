package br.com.labmedicine.labmedical.repositories;

import br.com.labmedicine.labmedical.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {

  @Query("SELECT p FROM Person p WHERE p.cpf =?1")
  Optional<Person> findByCpf(String cpf);
}
