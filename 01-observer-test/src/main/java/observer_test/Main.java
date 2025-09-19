package observer_test;

public class Main {
	public static void main(String[] args) {
		Channel yt = new Channel();
		
		Observer ob1 = new Subscriber("Alice");
		Observer ob2 = new Subscriber("Bob");
		
		yt.add(ob1);
		yt.add(ob2);
		
		yt.uploadVideo("Me at a Zoo");
	}
}
