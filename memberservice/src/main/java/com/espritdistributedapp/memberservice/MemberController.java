package com.espritdistributedapp.memberservice;

import com.espritdistributedapp.memberservice.DTOs.PostMemberRequest;
import com.espritdistributedapp.memberservice.DTOs.PostMemberResponse;
import com.espritdistributedapp.memberservice.DTOs.getAllMemberResponse;
import com.espritdistributedapp.memberservice.Services.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/Member")
public class MemberController {
    private  final MemberService memberService;
    @GetMapping
    @ResponseBody
    public List<getAllMemberResponse> getAll() {
        return memberService.getAll();
    }
    @PostMapping
    public PostMemberResponse post(@RequestBody PostMemberRequest request) {
        return memberService.post(request);
    }
}
