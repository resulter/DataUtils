package com.example.controller;

import com.example.service.DisplayDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/a")
public class DisplayDataController {
    @Autowired
    private  DisplayDataService displayDataService;




}
