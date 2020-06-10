import java.io.*;
import  java.util.*;
class UserMainCode{
public int digitRemove_Palin(int input1){
    int[] a = new int[10];
		int r=0,m=-1;
		int n = input1;
		while(n!=0){
			int k=n%10;
			a[k]++;
			r=(r*10) + k;
			n /= 10;
		}
		if(input1==r)
			return -1;
		for(int i=0;i<10;i++){
			if(a[i]%2==1)
				m=i;
		}
		return m;
	}
}
