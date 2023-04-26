package br.com.labmedicine.labmedical.helpers;

import br.com.labmedicine.labmedical.exceptions.AddressExeception;
import br.com.labmedicine.labmedical.models.Address;
import br.com.labmedicine.labmedical.repositories.AddressRepository;
import org.springframework.stereotype.Component;

@Component
public class IsValidAddress {

  private final AddressRepository addressRepository;

  public IsValidAddress(AddressRepository addressRepository) {
    this.addressRepository = addressRepository;
  }


  /**
   *  Verifica se Existe o Endereço Cadastrado
   * @param id
   * @return User
   */
  public Address isValid(String id) {

    return this.addressRepository.findById(id)
            .orElseThrow(()-> new AddressExeception("Endereço não Encontrado"));
  }

}
