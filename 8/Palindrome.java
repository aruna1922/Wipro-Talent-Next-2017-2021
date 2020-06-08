import java.io.*;
import  java.util.*;
class UserMainCode{
  public int isPalindrome(int input1){
  int s=0,r;
			int m = input1;
			while(m != 0){
				r = m % 10;
				s = (s * 10) + r;
				m /= 10;
			}
			if(input1==s)
				return 2;
			return 1;
		}
  }  
