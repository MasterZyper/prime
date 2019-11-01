package prime;

public class Logtread implements Runnable{
	
	String msg;
	public Logtread(String msg) {
		this.msg = msg;
		
		
	}

	@Override
	public void run() {
		System.out.println(msg);		
	}
	
	

}
