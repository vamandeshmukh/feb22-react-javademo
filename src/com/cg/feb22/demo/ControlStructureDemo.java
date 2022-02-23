// ternary operator 

package com.cg.feb22.demo;

public class ControlStructureDemo {

	public static void main(String[] args) {

		int num1 = 10, num2 = 20, num3;

//		if (num1 > num2)
//			num3 = num1;
//		else
//			num3 = num2;

		num3 = num1 > num2 ? num1 : num2;
//		num3 = (num1 > num2) ? num1 : num2;

		System.out.println(num3);

	}
}

//// switch case 
//
//package com.cg.feb22.demo;
//
//public class ControlStructureDemo {
//
//	public static void main(String[] args) {
//
//		int num = 7;
//
//		switch (num) {
//		case 1:
//			System.out.println("one");
//			break;
//		case 2:
//			System.out.println("two");
//			break;
//		case 3:
//			System.out.println("three");
//			break;
//		case 4:
//			System.out.println("four");
//			break;
//		default:
//			System.out.println("other");
//		}
//	}
//}

//// else if 
//
//package com.cg.feb22.demo;
//
//public class ControlStructureDemo {
//
//	public static void main(String[] args) {
//
//		int num1 = 20;
//		int num2 = 20;
//
//		if (num1 > num2) {
//			System.out.println(num1 + " is greater than " + num2);
//		} else if (num2 > num1) {
//			System.out.println(num2 + " is greater than " + num1);
//		} else {
//			System.out.println("Both are same");
//		}
//	}
//}

// if else 

//package com.cg.feb22.demo;
//
//public class ControlStructureDemo {
//
//	public static void main(String[] args) {
//
//		int num1 = 20;
//		int num2 = 20;
//
//		if (num1 > num2) {
//			System.out.println(num1 + " is greater than " + num2);
//		} else {
//			System.out.println(num2 + " is greater than " + num1);
//		}
//	}
//}

//// if else 
//// without curly braces 
//package com.cg.feb22.demo;
//
//public class ControlStructureDemo {
//
//	public static void main(String[] args) {
//
//		int num1 = 10;
//		int num2 = 20;
//
//		if (num1 > num2)
//			System.out.println(num1 + " is greater than " + num2);
//		else
//			System.out.println(num2 + " is greater than " + num1);
//	}
//}
