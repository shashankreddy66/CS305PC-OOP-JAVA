import java.util.*;
class Lab2P1{ 
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value");
		int a = s.nextInt();
		s.nextLine();
		String op = s.nextLine();
		
		switch(op)
		{ 
			case "++":
				System.out.println("Post:"+(a++));
				System.out.println("Pre:"+(++a));
			break;
			case "--":
				System.out.println("Post:"+(a++));
				System.out.println("Pre:"+(++a));
			break;
			case "+":
				a = a +a;
				System.out.println("Unary:"+(a));
			break;
			case "-":
				a = -a;
				System.out.println("unary:"+(-a));
			break;
			case "~":
				System.out.println("unary:"+(a));
			break;
			default:
				System.out.println("hello");
		
	}
	}
	}
