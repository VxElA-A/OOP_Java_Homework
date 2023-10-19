package Seminar_7_Homework_7.Calculator;

import Seminar_7_Homework_7.Complex.Complex;

public interface Calculable {
    Calculable sum(Complex arg);
    Calculable multi(Complex arg);
    Calculable div(Complex arg);
    Calculable minus(Complex arg);
    Complex getResult();
}
