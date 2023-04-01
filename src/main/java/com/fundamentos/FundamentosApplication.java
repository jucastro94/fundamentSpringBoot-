package com.fundamentos;

import com.fundamentos.bean.MyBean;
import com.fundamentos.bean.MyBeanWithDependendy;
import com.fundamentos.component.ComponentDependency;
import com.fundamentos.component.ComponentTwoImplement;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
	private ComponentDependency componentDependency;
private MyBean myBean;
private MyBeanWithDependendy myBeanWithDependendy;

	/*@Qualifier indica de que componente sse va a implementaar,
	 se toma el nombre del componente pero con la primera en minusscula*/
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependendy myBeanWithDependendy) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependendy =myBeanWithDependendy;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependendy.printWhitDependency();
	}
}
