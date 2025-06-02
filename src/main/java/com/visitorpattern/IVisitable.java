package com.visitorpattern;
interface IVisitable {
    <T> T accept(IVisitor<T> visitor);
}