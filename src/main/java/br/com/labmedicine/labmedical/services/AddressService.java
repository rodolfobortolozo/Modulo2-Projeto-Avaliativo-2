package br.com.labmedicine.labmedical.services;

import br.com.labmedicine.labmedical.dto.request.AddressRequest;
import br.com.labmedicine.labmedical.dto.response.AddressResponse;
import br.com.labmedicine.labmedical.exceptions.AddressExeception;
import br.com.labmedicine.labmedical.helpers.IsValidPatient;
import br.com.labmedicine.labmedical.helpers.IsValidUser;
import br.com.labmedicine.labmedical.mappers.AddressMapper;
import br.com.labmedicine.labmedical.models.Address;
import br.com.labmedicine.labmedical.repositories.AddressRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AddressService {

  private final AddressRepository addressRepository;
  private final IsValidUser isValidUser;
  private final IsValidPatient isValidPatient;

  public AddressService(AddressRepository addressRepository, IsValidUser isValidUser, IsValidPatient isValidPatient) {
    this.addressRepository = addressRepository;
    this.isValidUser = isValidUser;
    this.isValidPatient = isValidPatient;
  }

  public ResponseEntity<Object> getAll(){

    return ResponseEntity.status(HttpStatus.OK).body(
            this.addressRepository.findAll().stream()
                    .map(AddressMapper.INSTANCE::addressToAdrResponse
                    ));

  }

  @Transactional
  public ResponseEntity<AddressResponse> save(AddressRequest addressRequest){

    Address address = AddressMapper.INSTANCE.reqtoAdress(addressRequest);
    Address newAddress = this.addressRepository.save(address);

    return ResponseEntity.status(HttpStatus.CREATED).body(AddressMapper.INSTANCE.addressToAdrResponse(newAddress));
  }

  public ResponseEntity<Optional<AddressResponse>> getById(String id){

    return ResponseEntity.status(HttpStatus.CREATED).body(
            Optional.ofNullable(
                    this.addressRepository.findById(id)
                            .map(AddressMapper.INSTANCE::addressToAdrResponse)
                            .orElseThrow(() -> new AddressExeception("Nenhum Registro Encontrado."))
            )
    );

  }

  @Transactional
  public ResponseEntity<Optional<AddressResponse>> update(String id, AddressRequest addressRequest){

    return  ResponseEntity.status(HttpStatus.OK).body(
            Optional.ofNullable(
                    this.addressRepository.findById(id)
                            .map(address -> {

                              Address updateAddress = AddressMapper.INSTANCE.reqtoAdress(addressRequest);
                              updateAddress.setId(id);
                              Address newAddress = this.addressRepository.save(updateAddress);
                              return AddressMapper.INSTANCE.addressToAdrResponse(newAddress);

                            })
                            .orElseThrow(() -> new AddressExeception("Nenhum Registro Encontrado.")))
    );

  }

}