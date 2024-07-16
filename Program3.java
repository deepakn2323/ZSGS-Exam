package com.test1;

import java.util.Arrays;
import java.util.Scanner;

public class Program3 {
	private static boolean isName(String str,String name) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=name.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		String[][]relations=new String[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				relations[i][j]=sc.next();
			}
		}
		String name=sc.next();
		String currName=null;
		int count=0;
		for(int i=0;i<n;i++) {
			String curr=relations[i][1];
			if(isName(curr,name)) {
				currName=relations[i][0];
				
				for(int j=0;j<n;j++) {
					String curr1=relations[j][1];
					if(isName(curr1,currName)) {
						count++;
					}
				}
			}
		}

		
		System.out.println(count);


//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				System.out.print(relations[i][j]+" ");
//			}
//			System.out.println();
//		}
	}

}
