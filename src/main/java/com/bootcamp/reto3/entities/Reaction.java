package com.bootcamp.reto3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(value="reactions")
public class Reaction {

    @Id
    private String id;
    @Field(name = "type")
    private String type;
    @Field(name = "date")
    private Date date;
    @Field(name = "userId")
    private int userId;
}
