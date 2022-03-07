package com.bootcamp.reto3.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value="User")
public class User {
    @Id
    private String id;

    @Field(name="login")
    private String login;
    @Field(name="password")
    private String password;
    @Field(name="authorId")
    private int authorId;
}
