
public class MarsObserver extends Observer  {
	
	public MarsObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	@Override
	public void update() {
 
		System.out.println( "My age in Mars 11.3 years");
		
	}

}
