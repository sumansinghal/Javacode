package OOP_Abstract;

public class CallByValueCallByReference {

int p;
int q;

public static void main(String[] args) {
	CallByValueCallByReference obj = new CallByValueCallByReference();
	int x= 10;
	int y=20;
	obj.testSum(x, y);//call by value
	obj.p= 50;
	obj.q= 60;
	
	
}

public int testSum(int a, int b) {
	 a=30;
	b=40;
	int c= a+b;
	return c;
}

public void swap(CallByValueCallByReference t) {
	int temp;
	temp=t.p;
	t.p=t.q;
	t.q=temp;
	
}
}