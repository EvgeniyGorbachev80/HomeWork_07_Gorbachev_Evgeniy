package org.Gorbachev.calculator;

import org.Gorbachev.complex.Complex;

public class LogCalculableFactory implements ICalculableFactory {
    private final Loggable logger;

    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(Complex firstArg) {
        return new LogCalculator(new Calculator(firstArg), this.logger);
    }
}
