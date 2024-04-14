package org.Gorbachev.calculator;

import org.Gorbachev.complex.Complex;
public class CalculableFactory implements ICalculableFactory {
    @Override
    public Calculable create(Complex firstArg) {
        return new Calculator(firstArg);
    }
}
