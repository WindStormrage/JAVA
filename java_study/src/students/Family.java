package students;

class Father{
	private String name = "zhangjun";
	class Child{//Father���ڲ���
		void introFather(){
			System.out.println(name);//�����ⲿ���еı���
		}
	}
}

public class Family {
	public static void main(String []args){
		//ʵ����һ���ڲ���
		Father.Child child = new Father().new Child();
		child.introFather();
		//Father father = new Father();
		//father.Child.introFather();
	}
}
