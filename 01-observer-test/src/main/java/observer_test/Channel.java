package observer_test;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	
	private List<Observer> subscribers = new ArrayList<>();

	@Override
	public void add(Observer o) {
		subscribers.add(o);
		
	}

	@Override
	public void remove(Observer o) {
		subscribers.remove(o);
		
	}

	@Override
	public void notify(String title) {
		for(Observer o : subscribers) {
			o.update(title);
		}
		
	}
	
	
	public void uploadVideo(String vdtitle) {
		System.out.println("New video is uploaded :" + vdtitle);
		notify(vdtitle);
	}
	
	

}
