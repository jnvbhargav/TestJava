package javaProblemSolving;

import java.util.Stack;

public class ValidateParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "{}{}[()(){}()]{}";
		
		Boolean isValidParenthesis = false;
		
		isValidParenthesis = ValidateParenthesis(str);
		
		System.out.println("Provided String is valid or not : " + isValidParenthesis);

	}
	
	public static boolean ValidateParenthesis(String givenstring)
	{
		Stack<Character> stack = new Stack<>();
		
		if(givenstring.isEmpty())
			return false;
		
		for (int i=0;i<givenstring.length(); i++)
		{
			if(givenstring.charAt(i) == '{' || givenstring.charAt(i) == '(' || givenstring.charAt(i) == '[' )
			{
				stack.push(givenstring.charAt(i));
				System.out.println(stack);
				stack.push('a');
				System.out.println("Element " + givenstring.charAt(i) + " Pushed ");
			}
			if(stack.isEmpty())
			{
				System.out.println(stack);
				System.out.println("Stack is Empty");
				return false;
			}
			else if ((givenstring.charAt(i) == '}' && (stack.peek() != '{') ) || 
					(givenstring.charAt(i) == ')' && (stack.peek() != '(')) || 
					(givenstring.charAt(i) == ']' && (stack.peek() != '[')))
			{
				System.out.println("Entered the closing bracket Loop " + givenstring.charAt(i));
				return false;
			}
			stack.pop();
		}
		
		if(stack.size()>0)
			return false;
		
		return true;
	}
	
}
