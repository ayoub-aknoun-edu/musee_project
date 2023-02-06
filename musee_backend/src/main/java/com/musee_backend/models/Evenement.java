package com.musee_backend.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@MappedSuperclass
public class Evenement {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Long id ;

    @JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDate date;
    private String time;
    private  String description;
    private String imageLink ;


}
