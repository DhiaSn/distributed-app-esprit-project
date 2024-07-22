package com.espritdistributedapp.clubservice.DTOs;

import com.espritdistributedapp.clubservice.Entities.Club;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class postClubResponse {
    public postClubResponse(Club club)
    {
        id = club.getId();
        name = club.getName();
        email = club.getEmail();
    }
    private  Integer id;
    private  String name;
    private  String email;

}
