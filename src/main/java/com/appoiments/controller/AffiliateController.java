package com.appoiments.controller;

import com.appoiments.dto.AffiliateDto;
import com.appoiments.service.AffiliateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patient")
public class AffiliateController {

    @Autowired
    private AffiliateServiceImpl affiliateServiceImpl;

    @GetMapping
    public List<AffiliateDto> getAllAffiliate( ){
        return affiliateServiceImpl.getAllAffiliate();
    }

    @GetMapping("/findAffiliate/{id}")
    public AffiliateDto getAffiliateById(@PathVariable("id") int id){
        return affiliateServiceImpl.getAffiliateById(id);
    }

    @PostMapping("/newAffiliate")
    public @ResponseBody AffiliateDto postAffiliate(@RequestBody AffiliateDto affiliateDto){
        return affiliateServiceImpl.newAffiliate(affiliateDto);
        /*if(affiliateDto == null){
            AffiliateDto nuevoAffiliateDto = affiliateServiceImpl.newAffiliate(affiliateDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(nuevoAffiliateDto);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);*/
    }


    @PutMapping("/updateAffiliate")
    public @ResponseBody AffiliateDto putAffiliate(@RequestBody AffiliateDto affiliateDto){
        return affiliateServiceImpl.updateAffiliate(affiliateDto);
    }

    @DeleteMapping("/deleteAffiliate/{id}")
    public boolean deleteAffiliate(@PathVariable("id")int id){
        return affiliateServiceImpl.deleteAffiliate(id);
    }

}
