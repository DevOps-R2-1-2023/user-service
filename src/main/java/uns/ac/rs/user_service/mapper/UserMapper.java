package uns.ac.rs.user_service.mapper;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import uns.ac.rs.user_service.dto.UserDTO;
import uns.ac.rs.user_service.dto.request.RegistrationRequest;
import uns.ac.rs.user_service.model.User;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toDto(User user);

    User fromRegistrationRequest(RegistrationRequest request);
}
