package annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	String name();
}


class A{
	
	@Test(name = "custom annotation")
	public void show(){
		System.out.println("in A");
	}
}

class B extends A{
	
//	@Test(name = "")
	public void show() {
		System.out.println("in B");
	}
}
public class Question1 {

	public static void main(String[] args) {
		
		A a = new A();
//		System.out.println(a.getClass().getMethods( ));
		Class c = a.getClass();
		Annotation an = c.getAnnotation(Test.class);
		Test s = (Test)an;
		System.out.println(s.name());

	}

}
