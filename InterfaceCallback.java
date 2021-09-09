interface Member {
	public void callback();
}
class Store {
	Member members[]=new Member[100];
	int count =0;
	void register(Member m){
		members[count++] = m;
	}
	void inviteSale(){
		for(int i=0;i<count;i++){
		members[i].callback();
		}
	}
}
class Customer implements Member {
	String name;
	int age;
	Customer(String n, int a)
	{
		name = n;
		age = a;
	}
	public void callback()
	{
		System.out.println("OK. I will Visit! My Name : "+name+" Age: "+age);
	}
}

public class InterfaceCallback {
	public static void main(String args[]){
		Store s = new Store();
		Customer c1 = new Customer("Soubhagya", 21);
		Customer c2 = new Customer("Monalisha",20);
		
		s.register(c1);
		s.register(c2);
		
		s.inviteSale();
	}
}