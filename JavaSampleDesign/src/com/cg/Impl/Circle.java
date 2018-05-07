package com.cg.Impl;

import com.cg.inter.Shape;

//Example of Op-en and closed principle
public class Circle implements Shape{

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Calcluate Area of Circle");
		return 0;
	}

}
