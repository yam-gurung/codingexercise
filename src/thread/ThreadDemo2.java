package thread;

public class ThreadDemo2 implements Runnable {

	public static void main(String[] args) {
		ThreadDemo2 tDemo2=new ThreadDemo2();
		new Thread(tDemo2).start();
	}

	@Override
	public void run() {
		System.out.println("ThreadDemo2 called with Runnable interface");
	}

}
