import java.io.*;
import  java.util.*;
class UserMainCode{
  public int evenDigitSum(int input1){
  int sum = 0;
		while(input1 != 0){
			int r = input1 % 10;
			if(r % 2==0)
				sum += r;
			input1 /= 10;
		}
		return sum;
	}
  }
