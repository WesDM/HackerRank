package jahvah;

import java.util.ArrayDeque;
import java.util.Scanner;

public class StackProblem {
		public static void main(String []argh)
		{
			Scanner sc = new Scanner(System.in);
	        ArrayDeque<Character> stack = new ArrayDeque<Character>();
	        boolean result = true;
			
			while (sc.hasNext()) {
	            
				String input=sc.next();
	            if(input.isEmpty()){
	                result = true;
	                System.out.println(result);
	                continue;
	            }
	            
	            if(input.length() % 2 != 0){
	                result = false;
	                System.out.println(result);
	                continue;
	            }
	            
	            result = true;
	            char[] chars = input.toCharArray();
	            if(((Character)chars[0]).equals("}") || ((Character)chars[0]).equals(")") ||
	              ((Character)chars[0]).equals("]")){
	                result = false;
	                System.out.println(result);
	                continue;
	            }
	             if(((Character)chars[chars.length-1]).equals("{") || ((Character)chars[chars.length-1]).equals("(") ||
	              ((Character)chars[chars.length-1]).equals("[")){
	                result = false;
	                System.out.println(result);
	                continue;
	            }
	            for(Character c : chars){
	                if(c.equals("{") || c.equals("[") || c.equals("(")){
	                    stack.push(c);
	                }
	                
	                else if(!stack.isEmpty()){
	                    Character beginParen = stack.pop();
	                    if(beginParen.equals("{") && !c.equals("}") ||
	                        beginParen.equals("(") && !c.equals(")") ||
	                        beginParen.equals("[") && !c.equals("]")){
	                        result = false;
	                    }
	                }   
	            }
	            System.out.println(result);
	        }
			
			
//			   while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
//			    System.out.println(input.isEmpty()); 
		}
}
