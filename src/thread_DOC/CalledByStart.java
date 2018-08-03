package thread_DOC;

public class CalledByStart implements Runnable
{
	public void run()
	{
		for(int i=0; i<=3; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String args[])
	{
		Thread t = Thread.currentThread();
		
		Thread t1 = new Thread(new CalledByStart(), "t1");
		Thread t2 = new Thread(new CalledByStart(), "t2");
		
		t1.start();
		t2.start();
	}

}
