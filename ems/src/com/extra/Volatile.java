package com.extra;

public class Volatile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //create a thread instance
        StopThread stop_thread = new StopThread();
        //start the thread         
        stop_thread.start();
        try {
            Thread.sleep(1);
        } 
        catch (InterruptedException e)   {
            e.printStackTrace();
        }
          
        //call stopRunning() method to stop the thread
         stop_thread.stopRunning();

	}

}

class StopThread extends Thread {
    private volatile boolean stop_flag = true;      //initially set to true
    public void stopRunning() {
        stop_flag = false;          //set stop_flag to false
    }
    @Override
    public void run() {
        while (stop_flag) {         //keep checking value of stop_flag 
            System.out.println("Thread is running...");
        }
     System.out.println("Thread stopped!!!");
    }
}
  
