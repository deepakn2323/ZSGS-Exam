package com.test1;

import java.util.Scanner;

public class Program1 {
	
	private static void sort(int[]arr) {
		int n=arr.length;
		boolean swap;
		for(int i=0;i<n-1;i++) {
			swap=false;
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(!swap) {
				break;
			}
		}
	}
	
	private static void reverse(int[]arr) {
		int i=0,j=arr.length-1;
		while(i<j) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;j--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		
		int oddPos[]=new int[(nums.length+1)/2];
		int evenPos[]=new int[(nums.length/2)];
		int evenIndex=0,oddIndex=0;
		
		for(int i=0;i<nums.length;i++) {
			if(i%2==0) {
				oddPos[oddIndex++]=nums[i];
			}else {
				evenPos[evenIndex++]=nums[i];
			}
		}
		
		sort(evenPos);
		sort(oddPos);
		reverse(oddPos);
		
		evenIndex=0;
		oddIndex=0;
		for(int i=0;i<nums.length;i++) {
			if(i%2==0) {
				nums[i]=oddPos[oddIndex++];
			}else {
				nums[i]=evenPos[evenIndex++];
			}
		}
		
		for(int i:nums) {
			System.out.print(i+" ");
		}
	}

}
