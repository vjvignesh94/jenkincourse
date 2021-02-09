package com.training.jenkin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JenkinTraining {
	
	private final static Logger LOGGER = Logger.getLogger(JenkinTraining.class.getName());
	public static void main(String args[])
	{
		LOGGER.log(Level.INFO,"Indiside code");
	}
	
	public static int multiplyNumber(int a, int b)
	{
		int c = a*b;
		LOGGER.log(Level.INFO,"The result is "+c);
		return c;
	}
	public static int multiplyNumber(int a, int b, int c)
	{
		int d = a*b*c;
		LOGGER.log(Level.INFO,"The result is "+d);
		return d;
	}
	public static int addNumber(int a,int b)
	{
		int c = a+b;
		LOGGER.log(Level.INFO,"The result is "+c);
		return c;
	}
	public static int addNumber(int a,int b,int c)
	{
		int d = a+b+c;
		LOGGER.log(Level.INFO,"The result is "+d);
		return d;
	}

}
