package com.visitorpattern;
public class Mult extends ABinOp{

    public Mult(AExpr left, AExpr right) {
        super(left, right);
        //TODO Auto-generated constructor stub
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
