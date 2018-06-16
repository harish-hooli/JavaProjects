package BasicJava;

public class JavaInterfaceExample implements InterfaceIntExample {
	//method implement
	public void sayHello(){
		System.out.println("Hello!! I am in class");
	}
	
	//static method
	public static void main(String[] args){
		JavaInterfaceExample obj1 = new JavaInterfaceExample();
		obj1.sayHello();
	}
}
