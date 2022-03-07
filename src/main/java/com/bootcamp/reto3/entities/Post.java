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
@Document(value = "posts")
public class Post {
    @Id
    private String id;
    @Field(name = "title")
    private String title;
    @Field(name = "date")
    private Date date;
    @Field(name = "status")
    private String status;
    @Field(name = "content")
    private String content;
}
