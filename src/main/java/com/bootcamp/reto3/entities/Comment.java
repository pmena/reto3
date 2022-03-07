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
@Document(value="comments")
public class Comment {

    @Id
    private String id;

    @Field(name = "date")
    private Date date;
    @Field(name = "name")
    private String name;
    @Field(name = "status")
    private String status;
    @Field(name = "comment")
    private String comment;

}
