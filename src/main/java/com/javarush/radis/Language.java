package com.javarush.radis;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Language {
    private String language;
    private Boolean isOfficial;
    private BigDecimal percentage;

    //Getters and Setters omitted
    public Boolean getOfficial() {
        return isOfficial;
    }
    public void setOfficial(Boolean isOfficial) {
        this.isOfficial = isOfficial;
    }
}