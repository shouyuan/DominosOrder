import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	public static void main(String []args){
		System.out.println("go go go!");
	 	ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
	    
	Customer a=(Customer) context.getBean("customer1");
	
}
}
