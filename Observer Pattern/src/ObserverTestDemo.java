
public class ObserverTestDemo {
	
	public static void main(String args[]){
		
         Subject subject = new Subject();
		
		new EarthObserver(subject);
	      new JupiterObserver(subject);
	      new MarsObserver(subject);
		
		System.out.println("My date of Birth : 5th September 1998 \n");
		
		System.out.println("MY AGE ON OTHER WORLDS -: \n");
		
		subject.setAge(24);
		//System.out.println("My date of Birth : 5th September 1999 \\n");
		
	}

}
