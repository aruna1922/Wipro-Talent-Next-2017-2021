import java.io.*;
import  java.util.*;
class UserMainCode{
  public int nonRepeatDigitsCount(int input1){
			int c=0;
			int[] a = new int[10];
			while(input1>0){
				int r = input1 % 10;
				a[r]++;
				input1 /= 10;
			}
			for(int i=0;i<10;i++){
				if(a[i]==1)
					c++;
			}
			return c;
	}
}
