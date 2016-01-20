package com.hanains.interpreter;

import java.util.Map;

import com.hanains.interpreter.Interface.Expression;

public class Variable implements Expression {

	private String name;
	
	public Variable(String name) {
		super();
		this.name = name;
	}

	@Override
	public int interpret(Map<String, Expression> variables) {
		
		if( variables.get(name) == null){
			return 0;
		}
		return variables.get(name).interpret(variables);
	}

}
