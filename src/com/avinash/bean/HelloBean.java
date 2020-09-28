package com.avinash.bean;

public class HelloBean implements java.io.Serializable {

	/*
	 * Private Field Members
	 */
	private String name;

/*
 * Public No-Argument Constructor
 */
public HelloBean() {
	
}
/*
 * Accessor and Mutator Methods
 */
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String sayHello() {
	return "Hello " +name+ "!";
}
}
