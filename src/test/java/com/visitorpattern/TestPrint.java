package com.visitorpattern;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPrint {
    @Test
    public void testIntValue() {
        Int myInt = new Int(42);
        assertEquals("42", new PrettyPrintVisitor().visit(myInt));
    }

    @Test
    public void testAdd() {
        Add addExpr = new Add(new Int(21), new Add(new Int (10), new Int(11)));
        assertEquals("Add(21,Add(10,11))", new PrettyPrintVisitor().visit(addExpr));
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
        assertEquals("DivUnsigned(Mult(Add(21,Add(10,11)),4),8)", new PrettyPrintVisitor().visit(divUExpr));
    }
}