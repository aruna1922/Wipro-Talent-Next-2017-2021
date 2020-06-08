import java.io.*;
import  java.util.*;
class UserMainCode{
  public int allDigitsCount(int input1){
  int c=0,rem;
	while(input1!=0)
  {
			rem=input1%10;
			c++;
			input1/=10;
	}
		return c;
	}
}
