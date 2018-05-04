package com.cg.java;

public class MinimalJump2 {
public static void main(String args[]){
	
	MinimalJump2 mj = new MinimalJump2();
	System.out.println(mj.solution(2, 6, 2));
}


//Detected time complexity:O(Y-X)

/*public int solution(int X, int Y, int D){
	int b=X;
	int h=0;
	if(X==Y){
		return 0;
	}
	for(int g=1;g<Y;g++){
		b+=D;
		if(b<Y){
			continue;
		}else{
			h= g;
			break;
			
		}
	}
	return h;
}*/


//Detected time complexity:O(1)
public int solution(int X, int Y, int D){

	if(X==Y){
		return 0;
	}
	int n= (Y-X)/D;
	
	if(!((Y-X) % D == 0)) {
			return ++n;
	} else {
			return n;
	}
	
}
}
