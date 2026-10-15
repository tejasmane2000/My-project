package com23;

import org.springframework.beans.factory.annotation.Autowired;

public class one {
private two name;
private three th;
private int age;


@Autowired(required=false)
public one(two name) {
	super();
	System.out.println("one");
	this.name = name;
}


public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "one [name=" + name + ", age=" + age + "]";
}

@Autowired(required=false)
public one(two name, three th) {
	super();
	System.out.println("2");
	this.name = name;
	this.th = th;
}
}
