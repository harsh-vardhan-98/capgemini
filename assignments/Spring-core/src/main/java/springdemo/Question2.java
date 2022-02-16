package springdemo;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Question{
	public int quesid;
	public String question;
//	public List<String> answerlist;
//	public Set<String> answerset;
	public Map<Integer, String> answer;
	
	public Map<Integer, String> getAnswermap() {
		return answer;
	}
	public void setAnswer(Map<Integer, String> answer) {
		this.answer = answer;
	}

	public int getQuesid() {
		return quesid;
	}
	public void setQuesid(int quesid) {
		this.quesid = quesid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Question [quesid=" + quesid + ", question=" + question + ", answer=" + answer + "]";
	}
//	public List<String> getAnswerlist() {
//		return answerlist;
//	}
//	public void setAnswer(List<String> answer) {
//		this.answerlist = answer;
//	}
//	@Override
//	public String toString() {
//		return "Question [quesid=" + quesid + ", question=" + question + ", answer=" + answer + "]";
//	}
//	public Set<String> getAnswer() {
//		return answerset;
//	}
//	public void setAnswer(Set<String> answer) {
//		this.answerset = answer;
//	}
	
	
	
	
	
	
}





public class Question2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		Question q1 = (Question)context.getBean("question1");
//		Question q2 = (Question)context.getBean("question2");
		Question q3 =(Question)context.getBean("question3");
//		System.out.println(q1);
//		System.out.println(q2);
		System.out.println(q3);

	}

	

}


/*
 * 
 * <?xml version="1.0" encoding="UTF-8"?> <beans
 * xmlns="http://www.springframework.org/schema/beans"
 * xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 * xmlns:context="http://www.springframework.org/schema/context"
 * xsi:schemaLocation="http://www.springframework.org/schema/beans
 * http://www.springframework.org/schema/beans/spring-beans.xsd
 * http://www.springframework.org/schema/context
 * http://www.springframework.org/schema/context/spring-context.xsd">
 * 
 * <!-- <bean id = "question1" class="springdemo.Question"> <property
 * name="quesid" value="10"></property> <property name="question"
 * value="what is spring"></property> <property name="answer"> <list > <value>
 * spring is a framework </value> <value>spring has different varient</value>
 * </list>
 * 
 * </property> </bean> --> <!-- <bean id = "question2"
 * class="springdemo.Question"> <property name="quesid" value="11"></property>
 * <property name="question" value="What is Spring framework"></property>
 * <property name="answer"> <set> <value>framework used to do things
 * simple</value> <value>framework used to do things simple for
 * developer</value> </set> </property> </bean> --> <bean id="question3"
 * class="springdemo.Question"> <property name="quesid" value="12"></property>
 * <property name="question"
 * value="which type of company capgemini is"></property> <property
 * name="answer"> <map key-type="java.lang.Integer"
 * value-type="java.lang.String"> <entry key = "12" value="product based" />
 * </map> </property> </bean>
 * 
 * 
 * 
 * </beans>
 * 
 * 
 */






