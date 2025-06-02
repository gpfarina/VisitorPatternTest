package com.visitorpattern;

public class Int extends AExpr {
    private final int value;

    public Int(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}