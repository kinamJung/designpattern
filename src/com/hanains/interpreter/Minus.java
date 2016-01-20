package com.hanains.interpreter;

import java.util.Map;

import com.hanains.interpreter.Interface.Expression;

public class Minus implements Expression {

	Expression leftOperand;
	Expression rightOperand;
	
	public Minus(Expression leftOperand, Expression rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}


	@Override
	public int interpret(Map<String, Expression> variables) {
		return leftOperand.interpret(variables) - rightOperand.interpret(variables);
	}

}
