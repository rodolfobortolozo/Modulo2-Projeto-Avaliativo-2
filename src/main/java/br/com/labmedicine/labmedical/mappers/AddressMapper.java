package br.com.labmedicine.labmedical.mappers;

import br.com.labmedicine.labmedical.dto.request.AddressRequest;
import br.com.labmedicine.labmedical.dto.response.AddressResponse;
import br.com.labmedicine.labmedical.models.Address;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper( AddressMapper.class );

    Address reqtoAdress (AddressRequest addressRequest);

    AddressResponse addressToAdrResponse(Address address);
}
