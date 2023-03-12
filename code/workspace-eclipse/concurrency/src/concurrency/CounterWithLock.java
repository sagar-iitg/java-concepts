package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterWithLock {

	private int i = 0;
	private int j = 0;
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public void incrementI() {
		// Get Lock
		lockForI.lock();
		i++;
		lockForI.unlock();

		// release Lock
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

	public void incrementJ() {

		// get lock
		lockForJ.lock();
		j++;
		lockForI.unlock();
		// release lock
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
