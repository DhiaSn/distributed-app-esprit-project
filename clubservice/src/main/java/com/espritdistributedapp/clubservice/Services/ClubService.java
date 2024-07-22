package com.espritdistributedapp.clubservice.Services;

import com.espritdistributedapp.clubservice.DTOs.getAllClubsResponse;
import com.espritdistributedapp.clubservice.DTOs.getClubByIdWithMembersResponse;
import com.espritdistributedapp.clubservice.DTOs.postClubRequest;
import com.espritdistributedapp.clubservice.DTOs.postClubResponse;
import com.espritdistributedapp.clubservice.Entities.Club;
import com.espritdistributedapp.clubservice.Repositories.ClubRepository;
import com.espritdistributedapp.clubservice.Services.client.MemberClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClubService {
    private  final ClubRepository clubRepo;
    private  final MemberClient memberClient;

    public List<getAllClubsResponse> getAll() {
        List<Club> clubs = clubRepo.findAll();

        return clubs.stream()
                .map(getAllClubsResponse::new)
                .collect(Collectors.toList());
    }
    public postClubResponse post(postClubRequest request) {
        Club club = new Club();
        club.setName(request.getName());
        club.setEmail(request.getEmail());
        return new postClubResponse(clubRepo.save(club));
    }

    public getClubByIdWithMembersResponse getClubByIdWithMembers(Integer id) {
        var club = clubRepo.findById(id)
                .orElse(
                        Club.builder()
                                .name("NOT_FOUND")
                                .email("NOT_FOUND")
                .build());
       var members = memberClient.getAllByClub(id);
       return new getClubByIdWithMembersResponse(club, members);
    }

}
