package com.espritdistributedapp.clubservice.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Club {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private  Integer id;
    private  String name;
    private  String email;
}
