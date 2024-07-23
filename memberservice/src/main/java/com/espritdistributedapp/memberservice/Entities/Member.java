package com.espritdistributedapp.memberservice.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@Data
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor @Builder
public class Member implements Serializable {
    @Id
    private  Long id;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  Integer clubId;
}
