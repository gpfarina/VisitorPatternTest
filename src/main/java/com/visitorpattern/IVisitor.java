package com.visitorpattern;
interface IVisitor<T>{
    T visit(Int node);
    T visit(Add node);
    T visit(Mult node);
    T visit(Sub node);
    T visit(DivUnsigned node);
}
