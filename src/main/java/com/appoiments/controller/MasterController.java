package com.appoiments.controller;

import com.appoiments.service.MasterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("master")
public class MasterController {

    @Autowired
    private MasterServiceImpl masterServiceImpl;


}

