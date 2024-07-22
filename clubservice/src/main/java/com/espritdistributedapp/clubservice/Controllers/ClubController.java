package com.espritdistributedapp.clubservice.Controllers;

import com.espritdistributedapp.clubservice.DTOs.getAllClubsResponse;
import com.espritdistributedapp.clubservice.DTOs.getClubByIdWithMembersResponse;
import com.espritdistributedapp.clubservice.DTOs.postClubRequest;
import com.espritdistributedapp.clubservice.DTOs.postClubResponse;
import com.espritdistributedapp.clubservice.Services.ClubService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/Club")
public class ClubController {
    private  final ClubService clubService;
    @GetMapping
    @ResponseBody
    public List<getAllClubsResponse> getAll() {
        return clubService.getAll();
    }
    @PostMapping
    public postClubResponse post(@RequestBody postClubRequest request) {
        return clubService.post(request);
    }

    @GetMapping("/with-members/{id}")
    @ResponseBody
    public getClubByIdWithMembersResponse getClubByIdWithMembers(@PathVariable("id") Integer id) {

        return clubService.getClubByIdWithMembers(id);
    }
}
