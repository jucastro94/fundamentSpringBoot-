package com.fundamentos.Configuracion;

import com.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBean2Implement();
    }
    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplemento();
    }
    @Bean
    public MyBeanWithDependendy beanOperationOperationWhitDependency(MyOperation myOperation){
        return new MyBeanWhitDependencyImplement(myOperation);
    }
}
