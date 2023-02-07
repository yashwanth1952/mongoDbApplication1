package com.example.mongoDbApplication.service;

import com.example.mongoDbApplication.entity.Platform;
import com.example.mongoDbApplication.repository.PlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlatformService {
    @Autowired
    private PlatformRepository platformRepository;

    public List<Platform> findAll(){
        return platformRepository.findAll();
    }
    public Platform findById(String id){
        return platformRepository.findById(id).get();
    }
    public void deleteById(String id){
        platformRepository.deleteById(id);
    }
    public Platform save(Platform platform){
        return platformRepository.save(platform);
    }

}
