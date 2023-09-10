package com.jspider.multithreading.main;

import com.jspider.multithreading.thread.MyThread;

public class ThreadMain1 {

	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		
		myThread.start();
		
	}
}

