package students;

class Students {
	static String school;//静态变量，这个类所以实例化出来的对象公用一个
	private String name;//私有化的变量——封装
	private int old;
	String getname (){
		return name;
	}
	int getold (){
		return old;
	}
	void setname(String name){
		this.name = name;//this代表当前类
	}
	void setold(int old){
		this.old = old;
	}
	
	
	public Students(){
		System.out.println("无参构造方法");
	}
	public Students(int old){
		this.old = old;
		System.out.println("old参数的构造方法");
	}
	public Students(int old,String name){
		this.old  = old;
		this.name = name; 
		System.out.println("old和name参数的构造方法");
	}

}

public class Student{
	public static void main(String []args){
		Students.school = "ccsu";
		Students P = new Students(20,"xhy");//通过构造方法给对象赋初始值
        System.out.println(P.getold());
        System.out.println(P.getname());
        System.out.println(Students.school);
		P.setold(10);
		P.setname("xiedsg");
        System.out.println(P.getold());
        System.out.println(P.getname());
        System.out.println(Students.school);
	}
}

