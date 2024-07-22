package com.espritdistributedapp.clubservice.DTOs;

import com.espritdistributedapp.clubservice.Entities.Club;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class getClubByIdWithMembersResponse {
    public getClubByIdWithMembersResponse(Club club, List<getAllMemberResponse> memberList){
        this.id = club.getId();
        this.name = club.getName();
        this.email = club.getEmail();
        this.members = memberList;
    }
    private  Integer id;
    private  String name;
    private  String email;
    private List<getAllMemberResponse> members;
}
