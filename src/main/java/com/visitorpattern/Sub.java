package com.visitorpattern;
public class Sub extends ABinOp{

    public Sub(AExpr left, AExpr right) {
        super(left, right);
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
