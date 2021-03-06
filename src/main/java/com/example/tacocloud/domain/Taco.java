package com.example.tacocloud.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {

    @NotNull
    @Size(min=5, message = "Name must be at list 5 character long")
    private String name;

    @Size(min = 1, message = "You must choose at list 1 ingredient")
    private List<String> ingredients;

}
