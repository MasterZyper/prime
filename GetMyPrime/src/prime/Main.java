package prime;

public class Main {

	public static void main(String[] args) {
		if(args[0]!= null) {
			long i = Long.valueOf(args[0]);		
			while(true) {
				i = i + 2;
				Thread t = new Thread(new PrimeCheckThread(i));
				t.start();
			}
		}
	}
}
