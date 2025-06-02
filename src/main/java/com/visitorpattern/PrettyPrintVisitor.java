package com.visitorpattern;

public class PrettyPrintVisitor implements IVisitor<String>{

    @Override
    public String visit(Int node) {
        return Integer.toString(node.getValue());
    }

    @Override
    public String visit(Add node) {
       return "Add(" + node.getLeft().accept(this) +"," + node.getRight().accept(this)+ ")";
    }

    @Override
    public String visit(Mult node) {
       return "Mult(" + node.getLeft().accept(this) +"," + node.getRight().accept(this)+ ")";
    }

    @Override
    public String visit(Sub node) {
       return "Sub(" + node.getLeft().accept(this) +"," + node.getRight().accept(this)+ ")";
    }

    @Override
    public String visit(DivUnsigned node) {
       return "DivUnsigned(" + node.getLeft().accept(this) +"," + node.getRight().accept(this)+ ")";
    }

    
}
