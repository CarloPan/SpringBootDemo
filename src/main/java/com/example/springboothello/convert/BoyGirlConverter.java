package com.example.springboothello.convert;

import com.example.springboothello.dto.CoolBoyDto;
import com.example.springboothello.po.CoolBoy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

//@Mapper(componentModel = "spring")
@Mapper
public interface BoyGirlConverter {
    BoyGirlConverter instance = Mappers.getMapper(BoyGirlConverter.class);
    @Mappings({
            @Mapping(target="girlFriends",ignore = true)}
    )
    CoolBoyDto po2Dto(CoolBoy coolBoy);

    List<CoolBoyDto> po2DtoBoys(List<CoolBoy> coolBoyList);
}
