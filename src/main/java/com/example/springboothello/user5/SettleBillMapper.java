package com.example.springboothello.user5;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SettleBillMapper {
    SettleBillMapper INSTANCE = Mappers.getMapper(SettleBillMapper.class);

    SettleBill converToSettleBill(SettleBillReqDto settleBillReqDto);

    List<SettleBill> converToSettleBills(List<SettleBillReqDto> settleBillReqDtos);

    SettleBillReqDto fromSettleBill(SettleBill settleBill);

    SettleBillReqDto converToSettleBillDto(SettleBill settleBill);
}
