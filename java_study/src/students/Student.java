package students;

class Students {
	static String school;//��̬���������������ʵ���������Ķ�����һ��
	private String name;//˽�л��ı���������װ
	private int old;
	String getname (){
		return name;
	}
	int getold (){
		return old;
	}
	void setname(String name){
		this.name = name;//this����ǰ��
	}
	void setold(int old){
		this.old = old;
	}
	
	
	public Students(){
		System.out.println("�޲ι��췽��");
	}
	public Students(int old){
		this.old = old;
		System.out.println("old�����Ĺ��췽��");
	}
	public Students(int old,String name){
		this.old  = old;
		this.name = name; 
		System.out.println("old��name�����Ĺ��췽��");
	}

}

public class Student{
	public static void main(String []args){
		Students.school = "ccsu";
		Students P = new Students(20,"xhy");//ͨ�����췽�������󸳳�ʼֵ
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

