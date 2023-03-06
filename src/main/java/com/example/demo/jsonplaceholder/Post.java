package com.example.demo.jsonplaceholder;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Post {
    private long id;
    private long userId;
    private String title;
    private String body;
}
