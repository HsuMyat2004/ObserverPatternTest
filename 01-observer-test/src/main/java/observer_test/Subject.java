package observer_test;

public interface Subject {
	void add(Observer o);
	void remove(Observer o);
	void notify(String title);
}
