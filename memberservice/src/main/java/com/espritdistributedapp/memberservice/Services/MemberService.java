package com.espritdistributedapp.memberservice.Services;

import com.espritdistributedapp.memberservice.DTOs.PostMemberRequest;
import com.espritdistributedapp.memberservice.DTOs.PostMemberResponse;
import com.espritdistributedapp.memberservice.DTOs.getAllMemberResponse;
import com.espritdistributedapp.memberservice.Entities.Member;
import com.espritdistributedapp.memberservice.Repositories.MemberRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {
    private  final  MemberRepo memberRepo;

    public List<getAllMemberResponse> getAll() {
        List<Member> members = memberRepo.findAll();

        return members.stream()
                .map(getAllMemberResponse::new)
                .collect(Collectors.toList());
    }
    public PostMemberResponse post(PostMemberRequest request) {
        Member member = new Member();
        member.setFirstName(request.getFirstName());
        member.setLastName(request.getLastName());
        member.setEmail(request.getEmail());
        member.setClubId(request.getClubId());
        return new PostMemberResponse(memberRepo.save(member));
    }

    public List<getAllMemberResponse> getAllByClub(Integer clubId){
        List<Member> members = memberRepo.findAllByClubId(clubId);

        return members.stream()
                .map(getAllMemberResponse::new)
                .collect(Collectors.toList());
    }

}
