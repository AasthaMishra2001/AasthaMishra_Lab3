package com.greatlearning.driver;
import com.greatlearning.utils.BalancingBrackets;
public class Driver {
	public static void main(String args[]) {
		String bracketExpression="}}";
		boolean isBalanced=BalancingBrackets.checkBalancingBrackets(bracketExpression);
		if(isBalanced) {
			System.out.println("Balanced Brackets");
		}
		else {
			System.out.println("Unalanced Brackets");
		}
	}
}
