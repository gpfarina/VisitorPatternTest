package com.visitorpattern;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestExpr {
    @Test
    public void testIntValue() {
        Int myInt = new Int(42);
        assertEquals(42, myInt.getValue());
    }

    @Test
    public void testAdd() {
        Add addExpr = new Add(new Int(21), new Add(new Int (10), new Int(11)));
        assertEquals(42, new EvalVisitor().visit(addExpr));
    }
    @Test
    public void testDivU() {
        DivUnsigned divUExpr = new DivUnsigned(
                                                new Mult(
                                                    new Add(new Int(21), 
                                                            new Add(new Int (10), 
                                                                    new Int(11))), 
                                                    new Int(4)), 
                                                new Int(8));
        assertEquals(21, new EvalVisitor().visit(divUExpr));
    }
}