package Annotation.Annot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Kitchen implements Home {

	@Autowired
	private Hall hall;
	
	@Override
	public String gotoKitchen()
	{
	
	 System.out.println("Welcome to kitchen");
	
	 return hall.bathroom();
	}

	@Override
	public String bathroom() {
		
		System.out.println("Welcome to restRoom");
		return "restroom" ;
	}
}
