import javax.naming.Context;
import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Dominos {
	static Pizza pizza;


	public Dominos() {
		System.out.println("It is Dominos");
		 
	}

	public static Pizza bake() {
		System.out.println("bake");
		return pizza;
	}
}
