package Annotation.Annot.Scope;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value =ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingleTonScope {

	public SingleTonScope()
	{
		System.out.println("SingleTonScope");
	}
}
