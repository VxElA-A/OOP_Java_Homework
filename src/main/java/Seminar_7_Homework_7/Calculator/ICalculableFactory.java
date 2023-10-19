package Seminar_7_Homework_7.Calculator;

import Seminar_7_Homework_7.Complex.Complex;

public interface ICalculableFactory {
    Calculable create(Complex firstArg);
}
