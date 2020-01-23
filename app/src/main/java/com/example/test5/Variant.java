package com.example.test5;


import java.util.ArrayList;
import java.util.List;

public class Variant extends ArrayList {
    
    private  List<ValueAttribute>  valueAttributes;

    
    public List<ValueAttribute> getValueAttributes() {
        return valueAttributes;
    }

    public void setValueAttributes( List<ValueAttribute> valueAttributes) {
        this.valueAttributes = valueAttributes;
    }
}
