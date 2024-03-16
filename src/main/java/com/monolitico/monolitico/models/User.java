package com.monolitico.monolitico.models;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class User {
    private Long id;
    private String fullName;
    private LocalDate brittDay;
    private String email;



}
