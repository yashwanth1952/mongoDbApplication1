package com.example.mongoDbApplication.controller;

import com.example.mongoDbApplication.entity.Platform;
import com.example.mongoDbApplication.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/platforms")
public class PlatformController {
    @Autowired
    private PlatformService platformService;

    @GetMapping("/")
    public List<Platform> getAllPlatforms(){
        return platformService.findAll();
    }
    @GetMapping("/{id}")
    public Platform getPlatform(@PathVariable String id){
        return platformService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deletePlatform(@PathVariable String id){
        platformService.deleteById(id);
    }
    @PostMapping("/")
    public  Platform save(@RequestBody Platform platform){
        return platformService.save(platform);
    }

    @PutMapping("/")
    public  Platform saveOrUpdate(@RequestBody Platform platform){
        return platformService.save(platform);
    }
}
