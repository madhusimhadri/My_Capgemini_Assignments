package com.madhu.springAssignment9;

public class Lifecycle
{
public String message;

public void setMessage(String message)
{
	this.message=message;
}

public void getMessage()
{
	System.out.println("My Message:" +message);
}

public void init()
{
	System.out.println("Init method called");
}
public void destroy()
{
	System.out.println("Destroy method called");
}
}
