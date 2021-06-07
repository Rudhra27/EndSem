package com.msc.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong {
public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int c=0,a,temp,n;
BufferedReader num=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
 n=Integer.parseInt(num.readLine());
temp=n;
while(n>0) {
	a=n%10;
	n=n/10;
	c=c+(a*a*a);
}
if(temp==c) {
	System.out.println("Armstrong number");
}
else {
	System.out.println("Not a Armstrong number");
}
	}

}
