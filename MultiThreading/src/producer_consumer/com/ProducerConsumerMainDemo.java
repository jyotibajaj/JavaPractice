package producer_consumer.com;


public class ProducerConsumerMainDemo {

	public static void main(String[] args) {
		QueueClassProducerConsumerProblem q = new QueueClassProducerConsumerProblem();
		 new ProducerClass(q);
		 new ConsumerClass(q);

	}

}
