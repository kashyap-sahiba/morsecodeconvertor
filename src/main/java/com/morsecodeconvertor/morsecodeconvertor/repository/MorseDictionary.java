package com.morsecodeconvertor.morsecodeconvertor.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MorseDictionary {

    public String EnglishToMorse(String x){
    Map<String, String> englishToMorse = new HashMap<>();
        englishToMorse.put("a",".-" );
        englishToMorse.put("b","-...");
        englishToMorse.put("c","-.-.");
        englishToMorse.put("d","-..");
        englishToMorse.put("e",".");
        englishToMorse.put("f","..-.");
        englishToMorse.put("g","--.");
        englishToMorse.put("h","....");
        englishToMorse.put("i","..");
        englishToMorse.put("j",".---");
        englishToMorse.put("k","-.-");
        englishToMorse.put("l",".-..");
        englishToMorse.put("m","--");
        englishToMorse.put("n","-.");
        englishToMorse.put("o","---");
        englishToMorse.put("p",".--.");
        englishToMorse.put("q","--.-");
        englishToMorse.put("r",".-.");
        englishToMorse.put("s","...");
        englishToMorse.put("t","-");
        englishToMorse.put("u","..-");
        englishToMorse.put("v","...-");
        englishToMorse.put("w",".--");
        englishToMorse.put("x","-..-");
        englishToMorse.put("y","-.--");
        englishToMorse.put("z","--..");
        englishToMorse.put("1",".----");
        englishToMorse.put("2","..---");
        englishToMorse.put("3","...--");
        englishToMorse.put("4","....-");
        englishToMorse.put("5",".....");
        englishToMorse.put("6","-....");
        englishToMorse.put("7","--...");
        englishToMorse.put("8","---..");
        englishToMorse.put("9","----.");
        englishToMorse.put("0","-----");
        englishToMorse.put(" ","_");

        return englishToMorse.get(x);
}

    public String MorseToEnglish(String x){
        Map<String, String> morseToEnglish = new HashMap<>();
        morseToEnglish.put(".-","a");
        morseToEnglish.put("-...","b");
        morseToEnglish.put("-.-.","c");
        morseToEnglish.put("-..","d");
        morseToEnglish.put(".","e");
        morseToEnglish.put("..-.","f");
        morseToEnglish.put("--.","g");
        morseToEnglish.put("....","h");
        morseToEnglish.put("..","i");
        morseToEnglish.put(".---","j");
        morseToEnglish.put("-.-","k");
        morseToEnglish.put(".-..","l");
        morseToEnglish.put("--","m");
        morseToEnglish.put("-.","n");
        morseToEnglish.put("---","o");
        morseToEnglish.put(".--.","p");
        morseToEnglish.put("--.-","q");
        morseToEnglish.put(".-.","r");
        morseToEnglish.put("...","s");
        morseToEnglish.put("-","t");
        morseToEnglish.put("..-","u");
        morseToEnglish.put("...-","v");
        morseToEnglish.put(".--","w");
        morseToEnglish.put("-..-","x");
        morseToEnglish.put("-.--","y");
        morseToEnglish.put("--..","z");
        morseToEnglish.put(".----","1");
        morseToEnglish.put("..---","2");
        morseToEnglish.put("...--","3");
        morseToEnglish.put("....-","4");
        morseToEnglish.put(".....","5");
        morseToEnglish.put("-....","6");
        morseToEnglish.put("--...","7");
        morseToEnglish.put("---..","8");
        morseToEnglish.put("----.","9");
        morseToEnglish.put("-----","0");
        morseToEnglish.put("_"," ");

        return morseToEnglish.get(x);
    }


}
