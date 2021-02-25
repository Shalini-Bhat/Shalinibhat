package sample;

public class bus implements interfaceVehicle {
	public static void main(String[] args) {
	
	// TODO Auto-generated method stub
	bus b=new bus();
	b.wheels();
	b.engines();
}

@Override
public void wheels() {
	// TODO Auto-generated method stub
	System.out.println("Bus has 4 wheels");
}

@Override
public void engines() {
	// TODO Auto-generated method stub
	System.out.println("Bus has 4 engines");
}
}
