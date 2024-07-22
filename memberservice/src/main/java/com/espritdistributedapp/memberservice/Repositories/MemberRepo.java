package com.espritdistributedapp.memberservice.Repositories;

import com.espritdistributedapp.memberservice.Entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepo extends JpaRepository<Member, Integer> {
    List<Member> findAllByClubId(Integer clubId);
}
