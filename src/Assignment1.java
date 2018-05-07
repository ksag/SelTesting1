
public class Assignment1 {
	
	public int add(int num1, int num2){		
		return (num1+num2);		
	}
	
	public int sub(int a, int b){
		return (a-b);
	}
	
	public int div(int x, int y){
		return (x/y);
	}
	
	public int multi(int h, int i){
		return (h*i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment1 a = new Assignment1();		
		Assignment1 s = new Assignment1();		
		Assignment1 d = new Assignment1();
		Assignment1 m = new Assignment1();		
		
		System.out.println("Sum = " + a.add(2, 3));
		System.out.println("Sub = " + s.sub(8, 4));
		System.out.println("Division = " + d.div(5, 8));
		System.out.println("Multi = " + m.multi(8, 4));	

	}

}
