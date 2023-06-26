package com.example.Cal;
public class Calculator{
public static void opr(int a,int b ,char op){
	switch(op){
	case '+':System.out.println(a+b);
			break;
	case '-':System.out.println(a-b);
                        break;
	case '*':System.out.println(a*b);
                        break;
	case '/':System.out.println(a/b);
                        break;
	default:System.out.println("Wrong Input");
				break;

}
}
}
