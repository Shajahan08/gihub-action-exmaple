package Annotation.Annot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class Hall implements Home {
     
	
	//private Kitchen kitchen;
	
	
	@Override
	public String bathroom()
	{
		System.out.println("don't forget to hall light off");
		return "hi";
	}

	@Override
	public String gotoKitchen() {
		
		System.out.println("don't come hall kitchen");
		return "welocme";
	}
	
	
}
