/**
 * 
 */
package multithreading_practice.com;

/**
 * @author aashi Creation of thread by extending thread class.
 */

public class ThreadDemo1 extends Thread {

	public ThreadDemo1() {
		super("childThread");
		System.out.println("current thread name:" + this.getName());
		start();
	}

	// entry point for thread
	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			System.out.println(this.getName() + " " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("child thread interrupted");
			}
		}
		System.out.println("child thread exited");

	}
}
