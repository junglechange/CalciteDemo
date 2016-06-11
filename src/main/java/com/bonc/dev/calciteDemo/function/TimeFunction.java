package com.bonc.dev.calciteDemo.function;

import java.util.LinkedList;
import java.util.List;

import org.apache.calcite.schema.Function;
import org.apache.calcite.schema.FunctionParameter;

public class TimeFunction implements Function {

	@Override
	public List<FunctionParameter> getParameters() {
		List<FunctionParameter> params = new LinkedList<FunctionParameter>();
		params.add(new TimeParameter("year", 1));
		return params;
	}

}
