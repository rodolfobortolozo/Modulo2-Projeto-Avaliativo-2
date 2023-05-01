package br.com.labmedicine.labmedical.controllers;

import br.com.labmedicine.labmedical.dto.request.AddressRequest;
import br.com.labmedicine.labmedical.dto.response.AddressResponse;
import br.com.labmedicine.labmedical.services.AddressService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping({"/api/enderecos", "/address"})
public class AddressController {

  private final AddressService addressService;

  public AddressController(AddressService addressService) {
    this.addressService = addressService;
  }

  @GetMapping
  public ResponseEntity<Object> getAll(){

    return this.addressService.getAll();
  }

  @PostMapping
  public ResponseEntity<AddressResponse> saveAddress(@Valid @RequestBody AddressRequest addressRequest){

    return this.addressService.save(addressRequest);
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<Optional<AddressResponse>> getAddressbyId(@PathVariable(name = "id") String id){

    return this.addressService.getById(id);
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Optional<AddressResponse>> updateConsult(@PathVariable(name = "id") String id,
                                                                 @Valid @RequestBody AddressRequest addressRequest){

    return this.addressService.update(id, addressRequest);
  }

}
