import java.io.*;
import  java.util.*;
class UserMainCode{
public int sumOfsumsOfDigits(int input1){
      int t=0;
			int n = input1;
			int c=0;
			while(n!=0){
				c++;
				n/= 10;
			}
			int d = (int)Math.pow(10,c-1);
			t += sum(input1);
			while(input1!=0){
				int k = input1/d;
				input1 = input1 - (k*d);
				t += sum(input1);
				d /= 10;
			}
			return t;
		}
	public static int sum(int n1){
		int s=0;
		while(n1!=0){
			int r = n1%10;
			s +=r;
			n1/= 10;
		}
		return s;
	}
}
