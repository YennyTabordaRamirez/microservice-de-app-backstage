package com.appoiments.controller;

import com.appoiments.dto.TestDto;
import com.appoiments.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestServiceImpl testServiceImpl;

    @GetMapping
    public List<TestDto> getAllAffiliate( ){
        return testServiceImpl.getTest();
    }

    @GetMapping("/findTest/{id}")
    public TestDto getTestById(@PathVariable("id") int id){
        return testServiceImpl.getTestById(id);
    }

    @PostMapping("/newTest")
    public @ResponseBody TestDto postTest(@RequestBody TestDto testDto){
        return testServiceImpl.newTest(testDto);
    }

    @PutMapping("/updateTest")
    public @ResponseBody TestDto putTest(@RequestBody TestDto testDto){
        return testServiceImpl.updateTest(testDto);
    }

    @DeleteMapping("/deleteTest/{id}")
    public boolean deleteTest(@PathVariable("id")int id){
        return testServiceImpl.deleteTest(id);
    }

}
