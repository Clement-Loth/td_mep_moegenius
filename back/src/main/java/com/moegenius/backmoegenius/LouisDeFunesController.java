package com.moegenius.backmoegenius;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/louis")
class LouisDeFunesController {

    @Autowired
    public LouisDeFunesRepository louisrep;

    @GetMapping("")
    List<LouisDeFunes> getCitations() {
        List<LouisDeFunes> citations = louisrep.findAll();
        return citations;
    }

    @GetMapping("/ldf")
    List<LouisDeFunes> getAllCitations() {
        List<LouisDeFunes> citations = louisrep.findAll();
        return citations;
    }


}