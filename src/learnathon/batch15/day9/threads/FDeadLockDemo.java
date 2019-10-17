package learnathon.batch15.day9.threads;

public class FDeadLockDemo {
	public static void main(String[] args) throws InterruptedException {
		
		final Friend tom = new Friend("Tom");
		final Friend ram = new Friend("Ram");
	
		/*
		new Thread(new Runnable() {
			public void run() {
				tom.bow(ram);
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				ram.bow(tom);
			}
		}).start();
		*/
		
		Thread a = new Thread(new Runnable() {
			public void run() {
				tom.bow(ram);
			}
		});
		
		Thread b = new Thread(new Runnable() {
			public void run() {
				ram.bow(tom);
			}
		});
		
		a.start();
		a.join(1000);
		b.start();
		b.join(1000);
	}
}
	
	class Friend{
		private final String name;
		
		public Friend(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public synchronized void bow(Friend bower) {
			System.out.println(getName() + " :" + bower.getName() + " bowed to me. I have to bow back");
			bower.bowBack(this);
		}
		
		public synchronized void bowBack(Friend bower) {
			System.out.println(getName() + " :" + " bowed back to " + bower.getName());
		}
	}
