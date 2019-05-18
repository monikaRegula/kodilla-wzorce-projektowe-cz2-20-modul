package com.kodilla.kodillapatterns2.aop.calculator;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@EnableAspectJAutoProxy//włącza obsługę aspektów przez SpringBoot
public class Calculator {
    public double add(double a, double b){
        return a+b;
    }
    public double sub(double a, double b){
        return a-b;
    }
    public double mul(double a, double b){
        return a*b;
    }
    public double div(double a, double b){
        if (a == 0){
            throw new ArithmeticException("Dzielenie przez zero");
        }
        return a/b;
    }

    public BigDecimal factorial(BigDecimal n){
        if (n.compareTo(BigDecimal.ONE)>0){
            return n.multiply(factorial(n.subtract(BigDecimal.ONE)));
        }else if(n.equals(BigDecimal.ONE) || n.equals(BigDecimal.ZERO)){
            return BigDecimal.ONE;
        }else{
            throw new ArithmeticException("Factorial argumnet is negative");
        }

    }
}
