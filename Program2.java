package com.test1;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]ones= {"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten "};
		String[]teens= {"","eleven ","twelve ","thirteen ","fourteen ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen "};
		String[]tens= {"","","twenty ","thirty ","fourty ","fifty ","sixty ","seventy ","eighty ","ninty "};
		String[] places={"","","","hundred ","thousand ","ten thousand ","lakh ","ten lakh ","crore "};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pow=0;
		int temp=n;
		while(n!=0) {
			n/=10;
			pow++;
		}
		int[]nums=new int[pow];
		for(int i=pow-1;i>=0;i--) {
			nums[i]=temp%10;
			temp/=10;
		}
		String num="";
		for(int i=0;i<nums.length;i++) {
			int j=nums[i];
			if(j!=0) {
			if(pow>2) {
			String onesStr=ones[j];
			String place=places[pow];
			num=num+onesStr+place+"and ";
			}else if(pow==2) {
				if(j==1&&(nums[i+1]!=0)) {
					num=num+teens[nums[i+1]];
					break;
				}
				String ten=tens[j];
				num=num+ten;
			}else {
				String one=ones[j];
				num=num+one;
			}
						
		}
			pow--;
		}
		System.out.println(num);
	}

}
