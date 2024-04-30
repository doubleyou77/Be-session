package com.besession.besession.service;

import com.besession.besession.controller.CommunityController;
import com.besession.besession.repository.Community;
import com.besession.besession.repository.CommunityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommunityService {

    private final CommunityRepository communityRepository;

    public Community getCommunityInfo(Long id) {
        return communityRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Long saveInfo(Community community) {

        return communityRepository.save(community).getId();
    }
}
