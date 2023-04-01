package com.fundamentos.bean;

public class MyBeanWhitDependencyImplement implements MyBeanWithDependendy{
    private MyOperation myOperation;

    public MyBeanWhitDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWhitDependency() {
        int numero =1;
        System.out.println(myOperation.suma(numero) );

        System.out.println("hola desde la implementacion con dependencia");

    }
}
