package org.Gorbachev.calculator;

import org.Gorbachev.complex.Complex;

public interface ICalculableFactory {
    Calculable create(Complex firstArg);
}
