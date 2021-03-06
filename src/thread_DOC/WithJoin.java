package thread_DOC;

public class WithJoin 
{
	
	public static void main(String args[]) {
		Thread th1 = new Thread(new EnteClass(), "th1");
		Thread th2 = new Thread(new EnteClass(), "th2");
		Thread th3 = new Thread(new EnteClass(), "th3");

		th1.start();

		try {
			th1.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		th2.start();

		try {
			th2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		th3.start();

		try {
			th3.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("All Threads have been displayed");
	}

}

class EnteClass implements Runnable {
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Starting Thread " + t.getName());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("Ending Thread " + t.getName());
	}
}