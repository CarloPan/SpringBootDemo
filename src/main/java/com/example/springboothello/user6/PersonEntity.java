package com.example.springboothello.user6;

import com.fasterxml.jackson.annotation.JsonFormat;
import javafx.beans.NamedArg;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
public class PersonEntity {
    private Long id;
    private String name;
    private Integer age;
    private Integer sex;//0-女，1-男
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date brithDay;
    private String email;
    private JobEntity job;
    private List<CarEntity> carList;
}
