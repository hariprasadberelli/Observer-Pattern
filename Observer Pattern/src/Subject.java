import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	   private int age;
	public List<Observer> getObservers() {
		return observers;
	}
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}
	 
	
	public void notifyAllObservers(){
	      for (Observer observer : observers) {
	         observer.update();
	      }
	   }
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		notifyAllObservers();
	} 	
	
	public void attach(Observer observer){
	      observers.add(observer);		
	   }

}
