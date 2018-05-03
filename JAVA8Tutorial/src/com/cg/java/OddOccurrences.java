package com.cg.java;

import java.util.Scanner;

public class OddOccurrences {

	
	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int[] arrays = new int[20];
        s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            arrays[i] = s.nextInt();
            
        }
        OddOccurrences IA = new OddOccurrences();
        System.out.println(IA.solution(arrays));

        
        
        
        
        

	}
	
	public int solution(int[] A){
		
		int num = 0;

		for (int i = 0; i < A.length; i++) {
			num ^= A[i];
		}
		return num;
        
        
        
	}
}
