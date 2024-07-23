package com.espritdistributedapp.memberservice.Repositories;

import com.espritdistributedapp.memberservice.Entities.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MemberRepo extends MongoRepository<Member, Long> {
    List<Member> findAllByClubId(Integer clubId);
}
