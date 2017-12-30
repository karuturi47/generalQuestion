/**
 * 
 */
package com.veera.face.book;

/**
 * @author Veera
 *
 */
public abstract class Animal {
	
	
	public static void main(String[] args) {
		
		Animal dog1=new Dog1();
		dog1.printAnimal("dog");
		
	}
	protected boolean isMammal;
	protected boolean isCarnivorous;
	public Animal(boolean isMammal, boolean isCarnivorous) {
		super();
		this.isMammal = isMammal;
		this.isCarnivorous = isCarnivorous;
	}
	public boolean getisMammal() {
		return isMammal;
	}
	public boolean getisCarnivorous() {
		return isCarnivorous;
	}
	 public abstract String getGreeting();
	 
	 
	 void printAnimal(String name)
	 {
		 
	 }
	 
	
	



}

class Dog1 extends Animal {

	public Dog1() {
		super(true, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "boo";
	}
	

}
