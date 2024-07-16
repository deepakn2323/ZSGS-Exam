package com.test1;

import java.util.Arrays;
import java.util.Scanner;

public class Program4 {
	private static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	private static int min(int p,int q) {
		int originalP=p,originalQ=q; 
		while(!isPrime(p)) {
			p--;
		}
		int minlp=originalP-p;
		p=originalP;
		while(!isPrime(p)) {
			p++;
		}
		int minrp=p-originalP;
		if(minlp>minrp) {
			minlp=minrp;
		}

		while(!isPrime(q)) {
			q--;
		}
		int minlq=originalQ-q;
		q=originalQ;
		while(!isPrime(q)) {
			q++;
		}
		int minrq=q-originalQ;
		if(minlq>minrq) {
			minlq=minrq;
		}
		if(minlp<minlq) {
			return originalP;
		}else if(minlp==minlq) {
			return originalP>originalQ?originalQ:originalP;
		}else {
			return originalQ;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]nums= new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				int p=nums[j];
				int q=nums[j+1];
				if(min(p,q)==q) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}
