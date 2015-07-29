package synchronized_demo.com;


public class SyncMainDemo {
	public static void main(String[] args){
	SynchronizedDemo threadOne  = new SynchronizedDemo("Thread_One");
//	NonSynchronized threadTwo  = new NonSynchronized("Thread_Two");
//	NonSynchronized threadThree  = new NonSynchronized("Thread_Three");
	// so here we are using three threads on same object of Runnable, hence once a lock is placed on an object .
	//Other thread wont be able to access it.  
	Thread thread1 = new Thread(threadOne);
	Thread thread2 = new Thread(threadOne);
	Thread thread3 = new Thread(threadOne);

	thread1.start();
	thread2.start(); 
	thread3.start(); 
	//output if synchronized block is not used.
/*	count number onThread_One 1
//	count number onThread_One 1
//	count number onThread_One 1
//	count number onThread_One 2
//	count number onThread_One 2
//	count number onThread_One 2
//	count number onThread_One 3
//	count number onThread_One 3
//	count number onThread_One 3
//	count number onThread_One 4
//	count number onThread_One 4
//	count number onThread_One 4
//	count number onThread_One 5
//	count value is:10
//	count number onThread_One 5
//	count value is:12
//	count number onThread_One 5
//	count value is:12 */


	}
}
