package com.moegenius.backmoegenius;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @PostMapping("/newldf")
    void createNewCitation(@RequestParam String citation, String film){
        LouisDeFunes ldf = new LouisDeFunes();
        ldf.setCitation(citation);
        ldf.setFilm(film);
        louisrep.save(ldf);
    }


}