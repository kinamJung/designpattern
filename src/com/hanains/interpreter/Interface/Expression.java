package com.hanains.interpreter.Interface;

import java.util.Map;

public interface Expression {
	int interpret(Map<String, Expression > variables);
}
