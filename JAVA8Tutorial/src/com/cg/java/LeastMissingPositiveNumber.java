package com.cg.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LeastMissingPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{10,9,3,7,4,1,0};
		List g = Arrays.asList(arr);
		
		
		
		/*List arrayList = new ArrayList();
		//arrayList.
		
		Arrays.sort(arr);*/

      // use add() method to add elements in the list
		ArrayList<Integer> arrlist = new ArrayList<Integer>(8);
      arrlist.add(0);
      arrlist.add(25);
      arrlist.add(10);
      arrlist.add(15);
      
      
    //Logic for Least missing number
      for(int l=0;l<arrlist.size();l++){
			if(arrlist.contains(l)){
				continue;
			} else {
				System.out.println("value not present=="+l);
				break;
			}
		}
      
    //Logic for Max missing number
      Collections.sort(arrlist,Collections.reverseOrder());
      System.out.println(arrlist);

      
      for(int b=arrlist.get(0);;b--){
    	  if(arrlist.contains(b)){
    		  continue;
    	  }else {
				System.out.println("value not present=="+b);
				break;
			}
    	  
      }
      
      //USING java 8 features
      //Remove empty strings      
      List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
      List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
      System.out.println("String filtered list"+filtered);
      
    //get list of unique squares
    List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
    
    List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
    System.out.println("Uniue squreslist"+squaresList);
		
		
		
		

	}

}
