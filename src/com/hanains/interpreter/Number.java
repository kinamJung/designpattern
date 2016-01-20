package com.hanains.interpreter;

import java.util.Map;

import com.hanains.interpreter.Interface.Expression;

public class Number implements Expression {

	private int number;
	
	public Number(int number) {
		this.number = number;
	}

	@Override
	public int interpret(Map<String, Expression> variables) {
		// TODO Auto-generated method stub
		return number;
	}

}
