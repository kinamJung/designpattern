package com.hanains.interpreter;

import java.util.HashMap;
import java.util.Map;

import com.hanains.interpreter.Interface.Expression;


/*
 	아래의 Reverse Polish notation 예는 interpreter 패턴을 묘사한다.
		expression ::= plus | minus | variable | number
		plus ::= expression expression '+'
		minus ::= expression expression '-'
		variable  ::= 'a' | 'b' | 'c' | ... | 'z'
		digit = '0' | '1' | ... '9'
		number ::= digit | digit number
		
		
	위의 문법은 아래의 reverse Polish 표현법을 포함하는 언어를 정의한다.
	a b +
	a b c + -
	a b + c a - -
	
*/
public class InterpreterExample {

	public static void main(String[] args) {
	
		String expression = "a b + c a - -";
		Evaluator sentence = new Evaluator(expression);
		Map<String, Expression> variables = new HashMap<>();
		
		variables.put("a", new Number(6));
		variables.put("b", new Number(5));
		variables.put("c", new Number(1));
		int result = sentence.interpret(variables);
		
		System.out.println(result);
		
	}
	
}
