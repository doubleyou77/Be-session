package com.besession.besession.controller;

import com.besession.besession.repository.Community;
import com.besession.besession.service.CommunityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1/community")
public class CommunityController {

    private final CommunityService communityService;



    @GetMapping(value = "/{id}/getinfo")
    public ResponseEntity<Community> getInfo(@PathVariable Long id) {

        Community result = communityService.getCommunityInfo(id);
        return ResponseEntity.ok(result);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Long> saveInfo(@RequestBody Community community) {

        return ResponseEntity.ok(communityService.saveInfo(community));
    }
}
