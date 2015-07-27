package multithreading_practice.com;

public class ThreadDemo2 implements Runnable {
	Thread t;
	String name;

	public ThreadDemo2(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("current thread name: " + t.getName());
		t.start();
	}

	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			System.out.println(t.getName() + " " +  i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println();
			}
		}
		System.out.println("child thread exited");


	}
}
