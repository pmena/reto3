package com.bootcamp.reto3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "authors")
public class Author {
    @Id
    private String id;
    
    @Field(name = "name")
    private String name;
    @Field(name = "email")
    private String email;
    @Field(name = "phone")
    private String phone;
    @Field(name = "birthDate")
    private Date birthDate;

}
