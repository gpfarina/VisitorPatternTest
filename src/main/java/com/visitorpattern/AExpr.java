package com.visitorpattern;
public abstract class AExpr implements IVisitable {
    @Override
    public abstract <T> T accept(IVisitor<T> visitor);
}