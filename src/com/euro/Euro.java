package com.euro;

public class Euro {
    private final int value;

    public Euro(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object thatObject) {
        if (this == thatObject) return true;
        if (thatObject instanceof Dollar ) {
            if (value * 1.35 == ((Dollar) thatObject).getValue())
                return true;
        }
        if (!(thatObject instanceof Euro) ) return false;
        Euro euro = (Euro) thatObject;
        if (value != euro.value) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return value;
    }

    public Euro add(Euro thatEuro) {
        return new Euro(this.value + thatEuro.value);
    }
}
