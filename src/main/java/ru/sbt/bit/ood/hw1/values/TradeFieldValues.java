package ru.sbt.bit.ood.hw1.values;

import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

public class TradeFieldValues {
    private Map<String, String> values = new HashMap<String, String>();

    public String get(String s){
        return values.get(s);
    }

    public void put(String a, String b){
       values.put(a,b);
    }

    public Map<String, String> toMap(){
        return values;
    }

    public void setMap(Map<String, String> map){
        this.values = map;
    }

}
