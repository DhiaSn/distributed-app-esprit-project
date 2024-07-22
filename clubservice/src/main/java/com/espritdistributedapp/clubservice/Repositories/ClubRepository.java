package com.espritdistributedapp.clubservice.Repositories;

import com.espritdistributedapp.clubservice.Entities.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubRepository extends JpaRepository<Club, Integer> {
}
