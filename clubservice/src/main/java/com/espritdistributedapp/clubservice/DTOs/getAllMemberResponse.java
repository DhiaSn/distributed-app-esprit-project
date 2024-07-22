package com.espritdistributedapp.clubservice.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class getAllMemberResponse {
    private  long id;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  Integer clubId;
}
