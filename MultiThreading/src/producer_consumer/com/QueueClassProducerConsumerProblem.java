package producer_consumer.com;

public class QueueClassProducerConsumerProblem {
	boolean valueSet = false;
	int value;

	public synchronized void put(int value) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("thread interrupted");
			}
		}
		this.value = value;
		System.out.println("Put:" + value);
		valueSet = true;
		notify();

	}

	public synchronized int get() {
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("thread interrupted");
			}
		}
		System.out.println("Got: " + value);
		valueSet = false;
		notify();
		return value;

	}

	
}
