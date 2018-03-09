package java8;

public class AddMain {
    
    public int add(int a, int b, Adder adder) {
        return adder.add(a, b);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AddMain am = new AddMain();
        int aa = am.add(1, 2, (a,b) -> {return a + b;});
        System.out.println(aa);
    }

}
