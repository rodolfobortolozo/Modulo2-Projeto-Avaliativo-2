package br.com.labmedicine.labmedical.mappers;

import br.com.labmedicine.labmedical.dto.request.UserRequestPass;
import br.com.labmedicine.labmedical.dto.response.UserResSimple;
import br.com.labmedicine.labmedical.dto.response.UserResponse;
import br.com.labmedicine.labmedical.models.User;
import br.com.labmedicine.labmedical.dto.request.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );

    User reqtoUser(UserRequest userRequest);

    User reqPasstoUser(UserRequestPass userRequestPass);

    UserResponse userToUserResponse (User user);

    UserResSimple userToResSimple (User user);
}
