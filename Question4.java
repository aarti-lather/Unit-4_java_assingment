package firstSpringQues3;

public class Question4 {
	Inversion Of Control:
		it is a design principle
		IOc invert different kinds of controls in object-oriented design to
		achieve losse caouping.
		or
		one class depend on another class then dependendt class create he object of its depenency class directly, then use method

		 this is a design princple  which an external entity provide the ependency to the application component. external entity creating the dependeny object called this is called Inversion of Control (IOC);




		++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		+++++++++++++++++++++++++QUESTION2++++++++++++++++++++++++++++++++++++++++++
		spring beans are the object which are created and managed completly by spring container.
		Beans can be defined in spring either by using XML configuration or by using Annotation
		In XML configuation bean cane be defined using the annotation  on top oof he class defination.


		key advantage of making any class as spring bean is that, its entire life cycle is managed by spring conatiner and it hlep us to achive decouping.


		Any java class, which will be registered with the "Spring container software" is known as Spring bean.
		The Spring bean is basically a POJO class



		++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		+++++++++++++++++++++++++QUESTION 3++++++++++++++++++++++++++++++++++++++++++
		Bean scope:
		spring framework have 4 scops for bean;

		session scope
		request scope
		singleton scope
		prototype scope


		session scope:---->
		session scope return same bean class obj for all getbean()
		method  call the same bean id
		when we pull an object with same id multiple time, container return same object

		b one = ctx.getBean("b1",b.class);
		b two = ctx.getBean("b1",b.class);
		System.out.println(one == two); //true


		Prototype scope:
		   it return a deffernt bean class object  with the same id call  getBean() method;
		   we have to mention "SCOPE" attributs of the <bean>tag , in order to tell the contaion to put bean obj in prorotyp scope


		   <bean id="b1" class="com.company.A" scope="prototype">
		   <property name="text" value="Hello  Welcome"/>
		   </bean>
		   ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		  b one = ctx.getBean("b1",b.class);
		  b two = ctx.getBean("b1",b.class);
		 System.out.println(one == two); //false


		 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		 +++++++++++++++++++++++++++QUESTION 4++++++++++++++++++++++++++++++++++++++++


		  Auto Wiring = If spring container on its own detects the dependencies implicitly and injecting them into the
		 dependent bean is known as "auto-wiring".

		 Types:
		 1. no (default)
		 2. byName
		 3. byType
		 4. constructor

		 Limitation of Auto Wiring:
		 1. It can be used only to inject the objects but not the simple value dependencies.
		 2. If container have multiple dependencies of same type to inject , then ambiguity problem may raise.
}
