package Annotation.Annot;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Annotation.Annot.Controller.HomeController;
import Annotation.Annot.Scope.ProtoTypeScope;
import Annotation.Annot.Scope.SingleTonScope;
import Annotation.Annot.Service.Hall;

@SpringBootApplication
public class AnnotApplication {

	public static void main(String[] args) {
	  
	  ConfigurableApplicationContext context = SpringApplication.run(AnnotApplication.class, args);
	 
	  //HomeController home=(HomeController)context.getBean("homeController");
	  //home.add();
		
		//Hall hall=context.getBean(Hall.class);
		//hall.gotoKitchen();
	  
	  SingleTonScope single1=context.getBean(SingleTonScope.class);
	  
	  System.out.println(single1.hashCode());
	  SingleTonScope single2=context.getBean(SingleTonScope.class);
	  
	  SingleTonScope single3=context.getBean(SingleTonScope.class);
	  
	  
	 ProtoTypeScope pro1=context.getBean(ProtoTypeScope.class);
	 
	 ProtoTypeScope pro2=context.getBean(ProtoTypeScope.class);
	 
	 ProtoTypeScope pro3=context.getBean(ProtoTypeScope.class);
	 
	  
	}

}
