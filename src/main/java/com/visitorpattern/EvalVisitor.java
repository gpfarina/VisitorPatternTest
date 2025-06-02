package com.visitorpattern;
public class EvalVisitor implements IVisitor<Integer>{
    @Override
    public Integer visit(Int node) {
        return node.getValue();
    }
    @Override
    public Integer visit(Add node) {
        return node.getLeft().accept(this) + node.getRight().accept(this);
    }
     @Override
    public Integer visit(Sub node) {
        return node.getLeft().accept(this) - node.getRight().accept(this);
    }
    @Override
    public Integer visit(Mult node) {
        return node.getLeft().accept(this) * node.getRight().accept(this);
    }
    @Override
    public Integer visit(DivUnsigned node) {
        return Integer.divideUnsigned(node.getLeft().accept(this), node.getRight().accept(this));
    }
}
