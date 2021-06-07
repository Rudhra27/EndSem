package com.msc.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrthogonalMatrix {
   static boolean isOrthogonal(int [][]a,int n,int m)
   {
	   if(n!=m)
		   return false;
	   int [][]trans =new int[m][m];
	   for(int i=0;i<n;i++)
			 for(int j=0;j<n;j++)
				 trans[i][j]=a[j][i];
	   int [][]product=new int[n][n];
	   for(int i=0;i<n;i++)
	   {
			 for(int j=0;j<n;j++)
			 {
				 int sum=0;
				 for(int k=0;k<n;k++) {
					 sum=sum+(a[i][k]*a[j][k]);
				 }
				 product[i][j]=sum;
			 }
	   }
	   for(int i=0;i<n;i++)
	   {
			 for(int j=0;j<n;j++)
			 {
				 if(i!=j && product[i][j]!=0)
					 return false;
				 if(i==j && product[i][j]!=1)
					 return false;
			 }
			 }
			return true;	 
   }
	
	public static void main(String[] args)throws IOException {
		int n,m;
		BufferedReader num=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number of rows");
		 n=Integer.parseInt(num.readLine());
			System.out.println("Enter a number of columns");
			 m=Integer.parseInt(num.readLine());
			 int [][]a = new int[n][m]; 
			 for(int i=0;i<n;i++)
			   {
					 for(int j=0;j<m;j++)
					 {
						 
						 a[i][j]=Integer.parseInt(num.readLine());
					 }
			   }
			 System.out.println("Entered matrix is:");
			 for(int i=0;i<n;i++)
			   {
					 for(int j=0;j<m;j++)
					 {
						 System.out.print(a[i][j]+"\t"); 
					 					}
					 System.out.print("\n"); 

			   }

			 if(isOrthogonal(a,n,m))
			 {
				 System.out.println("It is orthogonal matrix");
			 }
			 else {
				 System.out.println("It is not a orthogonal matrix");
			 }
			 
	}

}
