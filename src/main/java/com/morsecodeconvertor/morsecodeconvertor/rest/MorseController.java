package com.morsecodeconvertor.morsecodeconvertor.rest;

import com.morsecodeconvertor.morsecodeconvertor.entity.ConversionObject;
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
    public ConversionObject englishToMorse(@RequestBody ConversionObject conversionObject){
        conversionObject.setConversionString(morseCodeConvertorService.englishToMorse(conversionObject.getConversionString()));
        return conversionObject;
    }

    @PostMapping("/morsetoenglish")
    public ConversionObject morseToEnglish(@RequestBody ConversionObject conversionObject){
        conversionObject.setConversionString(morseCodeConvertorService.morseToEnglish(conversionObject.getConversionString()));
        return conversionObject;
    }

}
