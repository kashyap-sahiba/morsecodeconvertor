package com.morsecodeconvertor.morsecodeconvertor.rest;

import com.morsecodeconvertor.morsecodeconvertor.service.MorseCodeConvertorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MorseController {

    private MorseCodeConvertorServiceImpl morseCodeConvertorService;

    @Autowired
    public MorseController(MorseCodeConvertorServiceImpl morseCodeConvertorService){
        this.morseCodeConvertorService = morseCodeConvertorService;
    }

    @PostMapping("/englishtomorse")
    public String englishToMorse(@RequestBody String english){
        return morseCodeConvertorService.englishToMorse(english);
    }

    @PostMapping("/morsetoenglish")
    public String morseToEnglish(@RequestBody String morse){
        return  morseCodeConvertorService.morseToEnglish(morse);
    }

}
