package Annotation.Annot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import Annotation.Annot.Service.Hall;
import Annotation.Annot.Service.Home;
import Annotation.Annot.Service.Kitchen;

@Component
public class HomeController {
   
	@Autowired
	private Home home;

	
	public String add()
	{
		

		return home.gotoKitchen();	
	}
}
