package students;

class Father{
	private String name = "zhangjun";
	class Child{//Father的内部类
		void introFather(){
			System.out.println(name);//调用外部类中的变量
		}
	}
}

public class Family {
	public static void main(String []args){
		//实例化一个内部类
		Father.Child child = new Father().new Child();
		child.introFather();
		//Father father = new Father();
		//father.Child.introFather();
	}
}
