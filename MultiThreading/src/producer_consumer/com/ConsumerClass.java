package producer_consumer.com;


public class ConsumerClass implements Runnable {

	QueueClassProducerConsumerProblem queue;

	public ConsumerClass(QueueClassProducerConsumerProblem q) {
		this.queue = q;
		new Thread(this, "consumer").start();

	}

	@Override
	public void run() {
		while(true){
		queue.get();
		}

	}

}
