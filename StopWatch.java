package com.bridgelabz.logicalprograms;

public class StopWatch {

	public static long start =0;
	public static long stop =0;
	public static long elapseTime =0;

	public static void main(String[] args) {
		start =System.currentTimeMillis();
		System.out.println("Start Time is: "+start);

		stop =System.currentTimeMillis();
		System.out.println("Stop Time is: "+stop);

		elapseTime = start - stop;

		System.out.println("elapstime is : " + elapseTime);
	}

}

