package thread_DOC;

class DaemonThreadEx2 extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String args[]) {
		DaemonThreadEx2 dt2 = new DaemonThreadEx2();
		DaemonThreadEx2 dt1 = new DaemonThreadEx2();

		// dt2.start(); Will give ILLEGAL_THREAD_STATE_EXCEPTION

		/*
		 * if daemon thread is set before start() it won't give error, whereas if daemon
		 * thread is set true after start() it will give the above mentioned exception.
		 */

		dt2.setDaemon(true);
		dt2.start(); //Comment this line and uncomment the previous start(), and run to get error

	}
}