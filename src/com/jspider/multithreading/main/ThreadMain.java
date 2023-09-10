package com.jspider.multithreading.main;

import com.jspider.multithreading.thread.MyThread1;
import com.jspider.multithreading.thread.MyThread2;

public class ThreadMain {
	public static void main(String[] args) {
		MyThread1 myThread=new MyThread1();
		MyThread2 myThread2=new MyThread2();
		
		Thread thread=new Thread(myThread2);
				
				myThread.start();
				thread.start();
		
	}

}
