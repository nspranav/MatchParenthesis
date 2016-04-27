package matcherSeries;

import java.util.Stack;

public class CheckParenthesis {
	private String s;
	Stack<Character> stk=new Stack<>();
	
	public CheckParenthesis(String s)
	{
		this.s=s;
	}
	
	boolean checkParenthesis()
	{
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)=='(')
			{
				stk.push(s.charAt(i));
			}
			else if(s.charAt(i)==')')
			{
				if(stk.isEmpty())
				{
					return false;
				}
				else
				{
					stk.pop();
				}
			}
		}
		if(!stk.isEmpty())
		{
			return false;
		}
		return true;
	}
	
	

}
