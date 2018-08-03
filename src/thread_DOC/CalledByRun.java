package thread_DOC;

public class CalledByRun implements Runnable
{
	public void run()
	{
		for(int i=0; i<3; i++)
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
		Thread th1 = new Thread(new CalledByRun(), "th1");
		Thread th2 = new Thread(new CalledByRun(), "th2");
		
		th1.run();
		th2.run();
		
	}
}

