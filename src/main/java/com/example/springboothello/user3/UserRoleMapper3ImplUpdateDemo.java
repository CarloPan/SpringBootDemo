package com.example.springboothello.user3;

import javax.annotation.Generated;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2022-09-25T15:57:48+0800",
        comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_333 (Oracle Corporation)"
)
public abstract  class UserRoleMapper3ImplUpdateDemo implements UserRoleMapper3 {

    public void update(User3 user, UserRoleDto3 userRoleDto) {
        if ( user == null ) {
            return;
        }

        userRoleDto.setUserId( user.getId() );
        userRoleDto.setName( user.getUsername() );
        userRoleDto.setRoleName( userRoleRoleName( user ) );
    }

    private String userRoleRoleName(User3 user3) {
        if ( user3 == null ) {
            return null;
        }
        Role3 role = user3.getRole();
        if ( role == null ) {
            return null;
        }
        String roleName = role.getRoleName();
        if ( roleName == null ) {
            return null;
        }
        return roleName;
    }
}
