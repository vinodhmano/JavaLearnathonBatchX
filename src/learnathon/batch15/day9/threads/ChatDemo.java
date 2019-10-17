package learnathon.batch15.day9.threads;

class MessageSender{
	public void send(String user, String msg) {
		System.out.println(user +":" + msg);
		//some complex piece code of code to send the message
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Message Sent");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MessageSenderThread implements Runnable{
	Thread t;
	String user;
	String msg;
	MessageSender sender;
	
	public MessageSenderThread(String user, String msg, MessageSender sender) {
		this.user = user;
		this.msg = msg;
		this.sender = sender;
	}
	
	public void run() {
		synchronized(sender) {
			sender.send(user, msg);
		}
	}
}

public class ChatDemo {
	public static void main(String[] args) {
		MessageSender sender = new MessageSender();
		new Thread(new MessageSenderThread("Vinodh","Hi. How are you?",sender)).start();
		new Thread(new MessageSenderThread("Client","I am good. How are you?",sender)).start();
	}
}
