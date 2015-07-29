package deadlock.com;

public class DeadLockDemo2 {
	private static Object mutex1 = new Object();
	private static Object mutex2 = new Object();

	public static void main(String[] args) {
		ThreadOne threadOne = new ThreadOne();
		ThreadTwo threadTwo = new ThreadTwo();
		threadOne.start();
		threadTwo.start();

	}

	private static class ThreadOne extends Thread {
		@Override
		public void run() {
			//nested synchronization
			synchronized (mutex1) {
				System.out.println("Enetered first thread mutex1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}

			

			synchronized (mutex2) {
				System.out.println("Enetered first thread mutex2");

			}
		}
		}
	}

	private static class ThreadTwo extends Thread {
		@Override
		public void run() {
			//nested synchronization
			synchronized (mutex2) {
				System.out.println("Enetered second thread mutex2");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			

			synchronized (mutex1) {
				System.out.println("Enetered second thread mutex1");

			}
			}
		}
	}

}
