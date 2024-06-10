package com.tlc.msa.service;

import com.tlc.msa.redisDao.SampleUserRepository;
import com.tlc.msa.model.user.User;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleRedisService {
    private final SampleUserRepository sampleUserRepository;

    public Object getUser(String id) {
        Object user = sampleUserRepository.findById(id).orElse(null);
        return user;
    }

    public Object updateUser(User user) {
        user = sampleUserRepository.save(user);
        return user;
    }

    public boolean deleteUser(String id) {
        sampleUserRepository.deleteById(id);
        return true;
    }
}