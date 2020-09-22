package FunctionalInterfaces;

public class Main{

    public static void main(String[] args) {
	ZeroArgument z = () -> "Shit works";
	OneArgument o = (int i) -> i+i;
	TwoArgument t = (int x, int y) -> x+y;
	int i = 1;
	int x = 2;
	int y = 3;
	System.out.println(z.zeroArg());
	System.out.println(o.oneArg(i));
	System.out.println(t.twoArg(x,y));
    }
}
