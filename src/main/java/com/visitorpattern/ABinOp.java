package com.visitorpattern;
public abstract class ABinOp extends AExpr{
    private final AExpr left;
    private final AExpr right;

    public ABinOp(AExpr left, AExpr right) {
        this.left = left;
        this.right = right;
    }
    public AExpr getLeft(){
        return left;
    }
    public AExpr getRight(){
        return right;
    }
}
