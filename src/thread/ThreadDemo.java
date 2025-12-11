package thread;

public class ThreadDemo extends Thread {
	public void run() {
		System.out.println("ThreadDemo called");
	}
	
	public static void main(String[] arg) {
		ThreadDemo tDemo=new ThreadDemo();
		tDemo.start();
	}
}
