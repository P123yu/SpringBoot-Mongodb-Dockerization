package com.mongo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    @MongoId
    private Long userId;
    private String usrName;
    private String usrAddress;
    private LocalDate userDob;
}
