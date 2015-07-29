package multithreading_practice.com;

public class ThreadDemo1Main {

	public static void main(String[] args) {
		new ThreadDemo1();
		
		
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("MainThread " + i);

				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main Thread interrupted");
		}
		System.out.println("Main thread exited");

	}
}


