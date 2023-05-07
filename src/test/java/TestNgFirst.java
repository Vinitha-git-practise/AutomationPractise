package src.test.java;

import org.testng.annotations.Test;

import src.main.java.FirstDemo;

public class TestNgFirst extends FirstDemo{

	@Test
	public void method1() {
		FirstDemo fd = new FirstDemo();
		fd.printing();
	}
	
	
}
