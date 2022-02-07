package collections;
import java.time.*;
import java.util.Iterator;
import java.util.LinkedList;
class Date{
	
	LocalDate d;
	public Date(int year,int month , int day) {
		super();
		this.d = LocalDate.of(year,month,day);
		
	}
	
	public LocalDate getDate() {
		return d;
	}
}

public class Question4 {
	public static void main(String[]  args) {
		
	
	Date d1=new Date(2004,12,15);
	Date d2=new Date(2001,12,15);
	Date d3=new Date(2008,12,15);
	Date d4 = new Date(2006,12,15);
	
	LinkedList<Date> l = new LinkedList<>();
	l.add(d1);
	l.add(d2);
	l.add(d3);
	l.add(d4);
	
	Iterator<Date> itr = l.descendingIterator();
	while(itr.hasNext()) {
		
		Date r= itr.next();
		
		LocalDate z = r.getDate();
		if(z.isLeapYear()) {
			System.out.println("Your date of year "+z+ "it was a leap year");
		}else {
			System.out.println("Your date of year "+z+ "it was not a leap year");
			
		}
	}
	
		
	}
}