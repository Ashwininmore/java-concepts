
public class ParamConstruct {
	
	ParamConstruct(){ //we can write only one default constructor in prog
		System.out.println("I am Default Constructor");
	}
	ParamConstruct(int age){
		System.out.println("Age of parameter Constructor:"+age);
	}

	public static void main(String[] args) {
		ParamConstruct p1=new ParamConstruct();
		ParamConstruct p2=new ParamConstruct(23);
	}

}
