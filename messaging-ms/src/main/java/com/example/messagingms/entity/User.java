package com.example.messagingms.entity;

import com.example.messagingms.utils.UserStaus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class User {
    @Id
    private String nickName;
    private String fullName;
    private UserStaus status;
    private String imageUrl;
}