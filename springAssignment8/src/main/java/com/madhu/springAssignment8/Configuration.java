package com.madhu.springAssignment8;

import org.springframework.context.annotation.Scope;

@org.springframework.context.annotation.Configuration

public class Configuration
{
@org.springframework.context.annotation.Bean
@Scope(value="prototype")
public Lifecycle2 Bean()
{
	return new Lifecycle2();
}
}
