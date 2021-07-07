public class MyThread {
	public static void main(String[] args) {
		System.out.println("Welcome to shown of threads");
		Thread thread1=new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("My thread: "+i);
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException ne) {
						ne.printStackTrace();
					} 
				}
			}
		});
		thread1.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main thread: "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ne) {
				ne.printStackTrace();
			} 
		}
	}
}