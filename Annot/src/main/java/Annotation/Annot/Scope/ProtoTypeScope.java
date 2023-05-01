package Annotation.Annot.Scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProtoTypeScope {
	
	public ProtoTypeScope()
	{
		
		System.out.println("protoTypeScope");
	}

}
