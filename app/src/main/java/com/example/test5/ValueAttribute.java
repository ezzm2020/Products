package com.example.test5;

public class ValueAttribute {

    
    private String name;
    
    private String value;

    
    public final String getName() {
        return this.name;
    }

    public final void setName( String var1) {
        this.name = var1;
    }

    
    public final String getValue() {
        return this.value;
    }

    public final void setValue( String var1) {
        this.value = var1;
    }

    public ValueAttribute( String name,  String value) {
        super();
        this.name = name;
        this.value = value;
    }

    
    public final String component1() {
        return this.name;
    }

    
    public final String component2() {
        return this.value;
    }

    
    public final ValueAttribute copy( String name,  String value) {
        return new ValueAttribute(name, value);
    }

    // $FF: synthetic method
    public static ValueAttribute copy$default(ValueAttribute var0, String var1, String var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.name;
        }

        if ((var3 & 2) != 0) {
            var2 = var0.value;
        }

        return var0.copy(var1, var2);
    }

    
    public String toString() {
        return "ValueAttribute(name=" + this.name + ", value=" + this.value + ")";
    }

    public int hashCode() {
        String var10000 = this.name;
        int var1 = (var10000 != null ? var10000.hashCode() : 0) * 31;
        String var10001 = this.value;
        return var1 + (var10001 != null ? var10001.hashCode() : 0);
    }

    public boolean equals( Object obj) {

        if (obj == null) {
            return false;
        }


        if (!ValueAttribute.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final ValueAttribute other = (ValueAttribute) obj;
        if ((this.name == null) ? (other.name != null) :
                !this.name.equals(other.name)) {
            return false;
        }
        return this.value == other.value;

    }
}
