package com.cg.Impl;

import com.cg.inter.Shape;

//Example of Op-en and closed principle
public class Square implements Shape{

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Calcluate Area of Square");
		return 0;
	}

}
