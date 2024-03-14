package com.appoiments.controller;

import com.appoiments.dto.AppoimentDto;
import com.appoiments.dto.TestDto;
import com.appoiments.service.AppoimentServiceImpl;
import com.appoiments.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appoiment")
public class AppoimentController {

    @Autowired
    private AppoimentServiceImpl appoimentServiceImpl;

    @GetMapping
    public List<AppoimentDto> getAllAppoiment( ){
        return appoimentServiceImpl.getAppoiment();
    }

    @GetMapping("/findAppoiment/{id}")
    public AppoimentDto getAppoimentById(@PathVariable("id") int id){
        return appoimentServiceImpl.getAppoimentById(id);
    }

    @PostMapping("/newAppoiment")
    public @ResponseBody AppoimentDto postAppoiment(@RequestBody AppoimentDto appoimentDto){
        return appoimentServiceImpl.newAppoiment(appoimentDto);
    }

    @PutMapping("/updateAppoiment")
    public @ResponseBody AppoimentDto putAppoiment(@RequestBody AppoimentDto appoimentDto){
        return appoimentServiceImpl.updateAppoiment(appoimentDto);
    }

    @DeleteMapping("/deleteAppoiment/{id}")
    public boolean deleteAppoiment(@PathVariable("id")int id){
        return appoimentServiceImpl.deleteAppoiment(id);
    }
}
