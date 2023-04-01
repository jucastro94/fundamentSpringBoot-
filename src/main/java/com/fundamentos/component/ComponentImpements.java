package com.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImpements implements ComponentDependency {
    @Override
    public void saludar() {
        System.out.println("Hola mundo");
    }
}
