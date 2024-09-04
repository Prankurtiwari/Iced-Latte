package com.zufar.icedlatte.security.converter;

import com.zufar.icedlatte.openapi.dto.UserRegistrationRequest;
import com.zufar.icedlatte.user.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface RegistrationDtoConverter {

    UserEntity toEntity(final UserRegistrationRequest userRegistrationRequest);
}
