package com.extra;

class ChildThread implements Runnable {
	Thread t;

	ChildThread() {
		t = new Thread(this, "ChildThread");
		System.out.println("Thread created: " + t);
		System.out.println(t + " Thread 0 is alive ? : " + t.isAlive());
		t.start();
		System.out.println(t + " Thread is alive ? : " + t.isAlive());
	}

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(t + "loop :" + i);
				System.out.println(t + "is alive ? : " + t.isAlive());
				Thread.sleep(500);
			}
		} catch (InterruptedException obj) {
			System.out.println("Thread :" + t + "interrupted");
		}
	}
}

public class JoinDemo {
	public static void main(String args[]) {
		ChildThread obj = new ChildThread();
		System.out.println("Main Started");
		System.out.println(obj.t + "is alive ? : " + obj.t.isAlive());
		try {
			System.out.println("Main thread waiting for child thread to finish");
			obj.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread is interrupted");
		}
		System.out.println(obj.t + "is alive ? : " + obj.t.isAlive());
		System.out.println("Main Thread is exiting");
	}
}