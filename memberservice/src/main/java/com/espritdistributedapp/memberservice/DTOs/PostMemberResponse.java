package com.espritdistributedapp.memberservice.DTOs;

import com.espritdistributedapp.memberservice.Entities.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostMemberResponse {
    public  PostMemberResponse(Member member){
        id = member.getId();
        firstName = member.getFirstName();
        lastName = member.getLastName();
        email = member.getEmail();
        clubId = member.getClubId();
    }
    private  long id;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  Integer clubId;
}
