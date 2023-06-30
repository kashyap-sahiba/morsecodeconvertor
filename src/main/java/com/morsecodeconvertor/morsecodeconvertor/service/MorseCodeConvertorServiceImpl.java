package com.morsecodeconvertor.morsecodeconvertor.service;

import com.morsecodeconvertor.morsecodeconvertor.repository.MorseDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MorseCodeConvertorServiceImpl implements MorseCodeConvertorService{

    private MorseDictionary morseDictionary;

    @Autowired
    public MorseCodeConvertorServiceImpl(MorseDictionary morseDictionary){
        this.morseDictionary=morseDictionary;
    }

    @Override
    public String englishToMorse(String x) {
        String morse="";

        for(int i=0;i<x.length();i++){
            if(i==x.length()-1){
                morse=morse+morseDictionary.EnglishToMorse(String.valueOf(x.charAt(i)));}
            else{
            morse=morse+morseDictionary.EnglishToMorse(String.valueOf(x.charAt(i)))+" ";}
        }

        System.out.println(morse);
        return morse;
    }

    @Override
    public String morseToEnglish(String x) {

        String english ="";
        String letter="";

        for(int i=0;i<x.length();i++){
            if(x.charAt(i)==' '){
                english+=morseDictionary.MorseToEnglish(String.valueOf(letter));
                letter="";
                continue;
            }
            letter+=x.charAt(i);

        }
        english+=morseDictionary.MorseToEnglish(String.valueOf(letter));

        return english;
    }
}
