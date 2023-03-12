package concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterWithLockWithAtomicInteger {

	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public void incrementI() {

		// This Operation is automatically thread safe
		i.incrementAndGet();

	}

	public int getI() {
		return i.get();
	}

	public void incrementJ() {

		j.incrementAndGet();

	}

	public int getJ() {
		return j.get();
	}

}
