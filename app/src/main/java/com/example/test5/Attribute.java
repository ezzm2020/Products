package com.example.test5;

enum AttributeType {
   COLOR,
   TEXT
}

public class Attribute {

    
    private String name = "";
    
    private AttributeType type;

    private String[]  values;

    public Attribute( String name,  AttributeType type, String[] values) {
        this.name = name;
        this.type = type;
        this.values = values;
    }

    public Attribute() {
    }

    
    public String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }

    
    public AttributeType getType() {
        return type;
    }

    public void setType( AttributeType type) {
        this.type = type;
    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }
}
