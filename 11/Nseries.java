import java.io.*;
import  java.util.*;
class UserMainCode{
public int Nseries(int input1, int input2, int input3, int input4){
    int m1 = input2 - input1; 
		int m2 = input3 - input2;
		int m1=0;int m2=0;int m3=0;
		n1 = input1;
		for(int i=0;i<input4/2;i++){
			n2 = n1 + m1;
			n3 = n2 + m2;
			if(input4%2==0){
				if(i==input4/2-1)
				return n2;
			}
			else{
				if(i==input4/2-1)
				return n3;
			}
			n1=n3;
		}
		return 0;
	}
}
