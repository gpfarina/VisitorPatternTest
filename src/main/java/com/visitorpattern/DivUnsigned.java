package com.visitorpattern;
public class DivUnsigned extends ABinOp{

    public DivUnsigned(AExpr left, AExpr right) {
        super(left, right);
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
