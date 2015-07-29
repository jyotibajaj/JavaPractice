package producer_consumer.com;


public class ProducerClass implements Runnable {
	QueueClassProducerConsumerProblem queue;
	
	public ProducerClass(QueueClassProducerConsumerProblem q){
		this.queue = q;
		new Thread(this, "producer").start();
		
	}
	
	@Override
	public void run(){
		int counter = 1;
		while(counter<=10){
		queue.put(counter++);
		}
		
	}

}
