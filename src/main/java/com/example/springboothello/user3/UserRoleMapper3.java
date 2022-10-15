package com.example.springboothello.user3;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserRoleMapper3 {
    UserRoleMapper3 INSTANCES = Mappers.getMapper(UserRoleMapper3.class);

    @Mappings({
            @Mapping(source = "id", target = "userId"),
            @Mapping(source = "username", target = "name"),
            @Mapping(source = "role.roleName", target = "roleName")
    })
    UserRoleDto3 toUserRoleDto(User3 user);

    //java: Method has no source parameter named "id". Method source parameters are: "user, role".
    /*@Mappings({
            @Mapping(source = "user.id", target = "userId"), // 把user中的id绑定到目标对象的userId属性中
            @Mapping(source = "user.username", target = "name"), // 把user中的username绑定到目标对象的name属性中
            @Mapping(source = "role.roleName", target = "roleName") // 把role对象的roleName属性值绑定到目标对象的roleName中
    })
    UserRoleDto3 toUserRoleDto(User3 user, Role3 role);

    @Mappings({
            @Mapping(source = "user.id", target = "userId"), // 把user中的id绑定到目标对象的userId属性中
            @Mapping(source = "user.username", target = "name"), // 把user中的username绑定到目标对象的name属性中
            @Mapping(source = "myRoleName", target = "roleName") // 把role对象的roleName属性值绑定到目标对象的roleName中
    })
    UserRoleDto3 useParameter(User3 user, String myRoleName);*/

    // --------------------------------------------- 更新---------------------------------------------
    /*@Mappings({
            @Mapping(source = "userId", target = "id"),
            @Mapping(source = "name", target = "username"),
            @Mapping(source = "roleName", target = "role.roleName")
    })
    void updateDto(UserRoleDto3 userRoleDto, @MappingTarget User3 user);*/

    /*@Mappings({
            @Mapping(source = "id", target = "userId"),
            @Mapping(source = "username", target = "name"),
            @Mapping(source = "role.roleName", target = "roleName")
    })
    void update(User3 user, @MappingTarget UserRoleDto3 userRoleDto);*/
}
