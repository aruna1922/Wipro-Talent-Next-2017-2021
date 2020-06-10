import java.io.*;
import  java.util.*;
class UserMainCode {
	public class Result{
		public final int output1;
		public final int output2;
		public Result(int out1, int out2){
			output1 = out1;
			output2 = out2;
		}
	}	
    public Result decreasingSeq(int[] input1,int input2){
    int decCount = 0;
		int Len = 0;
		int Count = 0;
		boolean flag = false;
		
		for (int i = 0; i < input2 - 1; i++) {			
			if (input1[i] > input1[i + 1]) {
				if (flag == false) {
					flag = true;
					Count++;
				}
				decCount++;
				Len = decCount>Len?decCount:Len; 
			} 
      else {
				if (flag == true) {
					flag = false;
					decCount = 0;
				}
			}
		}		
		if (Count > 0) 
       Len++;
		return new Result(Count,Len);
    }
}
