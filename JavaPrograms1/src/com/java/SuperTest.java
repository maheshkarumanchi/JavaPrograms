package com.java;
class TestParent
{
	public TestParent() {
	System.out.println("type");	
	}
}
class Child extends TestParent
{

	public Child(String type) {
		super();
		System.out.println("durga");
		
	}

}
class child1 extends Child
{

	public child1(String durga) {
		super("hai");
	System.out.println("etyrh");
	}
	
}
public class SuperTest {
	public static void main(String[] args) {
		new child1("");
	}

}
