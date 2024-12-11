package DemoMaven.DemoMavenId;

class newthread implements Runnable {
	Thread t;

	newthread() {
		t = new Thread(this, "New Thread");
		t.start();
	}

	@Override
	public void run() {
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t);
	}
}

class multithreaded_programing {
	public static void main(String args[]) {
		new newthread();
	}
}
