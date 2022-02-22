package assignment8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Student{

    String name;

  
    public String getName() {
        return name;
    }
    public void getDetails()
    {
        System.out.println("the name of the student is: "+getName());
    }
    @PostConstruct
    public void myInit()
    {
        System.out.println("myInit method started");
    }
    @PreDestroy
    public void myDestroy()
    {
        System.out.println("myInit method started");
    }
}


public class Q8student {
	 public static void main(String[] args) {
	        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	        ((ConfigurableApplicationContext) context).registerShutdownHook();
	        Student obj = (Student) context.getBean("student");
	        obj.getDetails();
	    }
}

