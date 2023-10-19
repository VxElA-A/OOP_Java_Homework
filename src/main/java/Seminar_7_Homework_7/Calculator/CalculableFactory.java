package Seminar_7_Homework_7.Calculator;

import Seminar_7_Homework_7.Complex.Complex;

public class CalculableFactory implements ICalculableFactory{
    @Override
    public Calculable create(Complex firstArg) {
        return new Calculator(firstArg);
    }
}
