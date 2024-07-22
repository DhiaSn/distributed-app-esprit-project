package com.espritdistributedapp.clubservice.Services.client;

import com.espritdistributedapp.clubservice.DTOs.getAllMemberResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "member-service", url = "${application.config.members-url}")
public interface MemberClient {
    @GetMapping("/Club/{clubId}")
    List<getAllMemberResponse> getAllByClub(@PathVariable("clubId") Integer clubId);
}
