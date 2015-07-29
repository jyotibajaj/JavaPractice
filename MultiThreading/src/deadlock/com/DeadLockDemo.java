package deadlock.com;

public class DeadLockDemo {
	private Object mutexOne = new Object();
	private Object mutexTwo = new Object();

	Thread trd1 = new Thread("ThreadOne") {
		public void run() {
			while (true) {
				synchronized (mutexOne) {
					System.out.println("Eneterd first lock in first thread");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
					}
					synchronized (mutexTwo) {
						System.out.println("Eneterd second lock in first thread");

						System.out.println("Hi, I Have locked both the objects");
					}
				}
			}
		}
	};

	Thread trd2 = new Thread("Thread") {
		public void run() {
			while (true) {
				synchronized (mutexTwo) {
					System.out.println("Eneterd second lock in second thread");

					try {

						Thread.sleep(10);

					} catch (InterruptedException e) {

					}
					synchronized (mutexOne) {
						System.out
								.println("Eneterd first lock in second thread");

						System.out
								.println("Hi, I Have locked both the objects, I am inside the second thread");

					}
				}
			}
		}
	};

	public static void main(String a[]) {
		DeadLockDemo mdl = new DeadLockDemo();
		mdl.trd1.start();
		System.out.println("Hi, First thread started");
		mdl.trd2.start();
		System.out.println("Hi, Second thread started");

	}

}
