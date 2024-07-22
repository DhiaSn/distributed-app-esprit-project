package com.espritdistributedapp.memberservice.Repositories;

import com.espritdistributedapp.memberservice.Entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member, Integer> {
}
