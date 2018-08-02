package thread_DOC;

public class WithoutJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th1 = new Thread(new MyClass(), "th1");
		Thread th2 = new Thread(new MyClass(), "th2");
		Thread th3 = new Thread(new MyClass(), "th3");

		th1.start();
		th2.start();
		th3.start();

	}
}

class MyClass implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread Started" + t.getName());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Thread Ended" + t.getName());
	}
}
