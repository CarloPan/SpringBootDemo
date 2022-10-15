package com.example.springboothello.user2;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserRoleMapper2 {

    UserRoleMapper2 INSTANCES = Mappers.getMapper(UserRoleMapper2.class);

    /*@Mappings({
            @Mapping(source = "id", target = "userId"),
            @Mapping(source = "username", target = "name"),
            @Mapping(source = "role.roleName", target = "roleName"),
            @Mapping(source = "email", target = "email"),
    })*/
    @Mapping(source = "role.roleName", target = "roleName")
    UserRoleDto2 toUserRoleDto2(User2 user);

    default UserRoleDto2 defaultConvert() {
        UserRoleDto2 userRoleDto = new UserRoleDto2();
        userRoleDto.setId(0L);
        userRoleDto.setUsername("None");
        userRoleDto.setEmail("None");
        userRoleDto.setRoleName("None");
        return userRoleDto;
    }
}
