class Sleep {
	 synchronized public void mySleep(long threadId) {
			System.out.println("I am entering mySleep Thread" + threadId);
			try {
				
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("I am exiting from mySleep Thread" + threadId);
		}

}

public class ThreadSample extends Thread {
	Sleep s1;
	ThreadSample (Sleep s2) {
		s1 = s2;
	}
	public void run() {

		long threadId = Thread.currentThread().getId();
		System.out.println("I am entering in Thread " + threadId);
		/*try {
		
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
		}*/
		s1.mySleep(threadId);
		System.out.println("I am exiting from Thread" + threadId);
	}
	public static void main(String[] args) {
		Sleep obj = new Sleep();
	ThreadSample t1 = new ThreadSample(obj);
	ThreadSample t2 = new ThreadSample(obj);
	t1.start();
	t2.start();
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("I am exiting from Main Thread");
	//return 0;
}
}
