package com.example.springboothello.user6;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
public class PersonDto {
    private String userName;
    private Integer userAge;
    private String userSex;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date userBrith;
    private String userEmail;

    private String jobName;
    private String jobAddress;

    private List<CarDto> carList;
}
