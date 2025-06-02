package com.visitorpattern;
public class Add extends ABinOp{

    public Add(AExpr left, AExpr right) {
        super(left, right);
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
