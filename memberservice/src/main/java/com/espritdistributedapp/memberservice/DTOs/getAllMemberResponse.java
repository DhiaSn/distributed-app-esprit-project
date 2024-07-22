package com.espritdistributedapp.memberservice.DTOs;

import com.espritdistributedapp.memberservice.Entities.Member;

public class getAllMemberResponse {
    public  getAllMemberResponse(Member member){
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
    private  long clubId;
}
