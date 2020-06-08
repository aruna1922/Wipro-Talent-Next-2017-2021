import java.io.*;
import  java.util.*;
class UserMainCode{
  public int EvenOdddigitssum(int input1, String input2){
int esum = 0,osum=0;
		while(input1 != 0){
			int r = input1 % 10;
			if(r % 2==0)
				esum += r;
			else
				osum += r;
			input1 /= 10;
		}
		if(input2.equals("even"))
			return esum;
		else
			return osum;
	}
}
