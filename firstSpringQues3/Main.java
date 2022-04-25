package firstSpringQues3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		calArea ca = ctx.getBean(calArea.class, "s");
//		ca.funA();
		CalArea ca=ctx.getBean(CalArea.class,"s");
		ca.funA();
		
	}

}