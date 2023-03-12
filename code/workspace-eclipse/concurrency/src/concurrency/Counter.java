package concurrency;

public class Counter {

	private int i = 0;
	private int j = 0;

	synchronized public void incrementI() {
		i++;
//		get i
//		increment
//		set i

	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	synchronized public void incrementJ() {
		j++;
//		get i
//		increment
//		set i

	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

}
