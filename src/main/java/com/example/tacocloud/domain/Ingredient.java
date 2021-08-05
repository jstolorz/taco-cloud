package com.example.tacocloud.domain;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public static enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}