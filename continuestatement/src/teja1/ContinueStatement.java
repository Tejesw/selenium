package teja1; 

public class ContinueStatement {

	public static void main(String[] args) {
		int a=0;
		while(true) {
if(a>4&&a<11) {
	a++;
	continue;
}
System.out.println("the value of a:"+a);
if(a==15)
	break;
a++;
	}
System.out.println("End of the program...");
}
}
