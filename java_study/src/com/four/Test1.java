package com.four;

class Student {
	String name;
	int    age;
	public Student(String name , int age){
		this.name = name;
		this.age  = age;
	}
	public Student(){//�̳�ʱ�����ڸ����ж���һ���޲εĹ��췽��
	}
	void show (){
		System.out.println(age);
		System.out.println(name);
	}
}

class Undergraduate extends Student{//�̳�
	String degree;
	public Undergraduate (String name,int age,String degree){
		this.name = name;
		this.age  = age;
		this.degree = degree;
	}
	void show(){
		System.out.println(age);
		System.out.println(name);
		System.out.println(degree);
	}
}

public class Test1 {
	public static void main(String [] args){
		Student stu = new Student("xhy",15);
		Undergraduate under = new Undergraduate("xdsg",19,"big");
		stu.show();
		under.show();
	}
}
