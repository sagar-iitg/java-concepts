package com.sagar.thread;

public class MyThread extends Thread {

	@Override
	public void run() {

		int c = 0;
		c = 10 / 0;
	}

}
