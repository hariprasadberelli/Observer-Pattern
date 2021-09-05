 

public class EarthObserver extends Observer {
	
	public EarthObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	@Override
	public void update() {
		 
		System.out.println( "My age in Earth 24 years");
	}

	 

}
