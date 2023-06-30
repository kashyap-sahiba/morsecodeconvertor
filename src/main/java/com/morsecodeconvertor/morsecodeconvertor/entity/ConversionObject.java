package com.morsecodeconvertor.morsecodeconvertor.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ConversionObject {

    private String conversionString;

    @Autowired
    public ConversionObject(){
    }

    public String getConversionString() {
        return conversionString;
    }

    public void setConversionString(String conversionString) {
        this.conversionString = conversionString;
    }
}
