package synchronized_demo.com;

public class SynchronizedDemo implements Runnable {
	Thread thread;
	String threadName;
	int count;
	// private so that the object can't be modified from outside.
	private Object mutex = new Object();

	public SynchronizedDemo(String threadName) {
		this.threadName = threadName;
	}

	public void increementMethod() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("thread interrupted");
			}
			count++;
			System.out.println("count number on " + this.threadName + " " + i);
		}
		System.out.println("count value is:" + count);

	}

	/*
	 * synchronized block making sure that method is accessed by one thread at a
	 * time.hence avoiding discrepancies.
	 */
	@Override
	public void run() {
		// synchronized block
		synchronized (mutex) {
			increementMethod();

		}
	}

}
