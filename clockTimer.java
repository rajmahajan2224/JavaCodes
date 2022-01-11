package com.mycompany;

public class clockTimer {
	public static class Timer extends Thread {

		public static void main(String[] args) {
			
			new Timer().start();
		}
		
		@Override
		public void run() {
			int i =1;
			while(true) {
				System.out.print(i + "\r");
				i++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Some issues : " + e.getMessage());
				}
			}
		}
	}
}
