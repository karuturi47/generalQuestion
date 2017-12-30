/**
 * 
 */
package com.veera.face.book;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Veera
 *
 */
public class Calendar implements Runnable{
	private Thread t;
	private String tname;
	

	public Calendar(String tname) {
		
		this.tname = tname;
	}


	@Override
	public void run() {
	 System.out.println(tname);
		
	}
	
	
	public void start() {
		 if(t==null)
		 {
			 t=new Thread(this,tname);
			 t.start();
		 }
			
		}
	
	public static class TestThread
	{
		public static void main(String[] args) {
			
			Calendar c=new Calendar("a");
			
			Calendar c1=new Calendar("b");
			c1.start(); 
			c.start();

			
		}
	}
	
	
	
	
	
}
