package com.example.c;

import java.util.Map;
import java.util.Properties;

public class footballer {
    private Map<String ,Integer> player;
    private Properties country;

    public footballer(){}
    public Map<String, Integer> getPlayer() {
        return player;
    }

    public void setPlayer(Map<String, Integer> player) {
        this.player = player;
    }

    public Properties getCountry() {
        return country;
    }

    public void setCountry(Properties country) {
        this.country = country;
    }

    public String toString(){
        return player+"is from "+country;
    }

}
