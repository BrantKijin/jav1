package com.example.javaadv1_1.ex01;

import static com.example.javaadv1_1.util.MyLogger.*;
import static com.example.javaadv1_1.util.ThreadUtils.*;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JoinMainV0 {
	public static void main(String[] args) {

		log("Start");
		Thread thread1 = new Thread(new Job(), "thread1");
		Thread thread2 = new Thread(new Job(), "thread2");

		thread1.start();
		thread2.start();

		log("End");


	}

	static class Job implements Runnable {

		@Override
		public void run() {
			log("작업 시작");
			sleep(2000);
			log("작업 완료");
		}
	}
}
