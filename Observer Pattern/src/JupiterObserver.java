
public class JupiterObserver extends Observer {
	
	public JupiterObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	@Override
	public void update() {
		 
		System.out.println( "My age in Jupitor 1.79 years");
	}

}
