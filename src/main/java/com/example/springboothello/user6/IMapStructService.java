package com.example.springboothello.user6;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapStructService {
    IMapStructService INTANCE = Mappers.getMapper(IMapStructService.class);

    @Mappings({
            @Mapping(source = "name", target = "userName"),
            @Mapping(source = "age", target = "userAge"),
            @Mapping(source = "sex", target = "userSex"),
            @Mapping(source = "email", target = "userEmail"),
            @Mapping(source = "brithDay", target = "userBrith", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(source = "job.name", target = "jobName"),
            @Mapping(source = "job.address", target = "jobAddress")
    })
    PersonDto personToDto(PersonEntity model);
}
