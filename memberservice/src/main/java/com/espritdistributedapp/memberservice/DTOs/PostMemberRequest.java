package com.espritdistributedapp.memberservice.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostMemberRequest {
    private  String firstName;
    private  String lastName;
    private  String email;
    private  long clubId;
}
