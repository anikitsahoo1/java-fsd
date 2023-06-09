public class MethodExecution {

    public int multiplyNumbers(int a, int b) {
        int z = a * b;
        return z;
    }

    public static void main(String[] args) {
        MethodExecution b = new MethodExecution();
        int ans = b.multiplyNumbers(10, 3);
        System.out.println("Multiplication is: " + ans);
    }
}


public class CallMethod {

    int val = 150;

    int operation(int val) {
        val = val * 10 / 100;
        return val;
    }

    public static void main(String args[]) {
        CallMethod d = new CallMethod();
        System.out.println("Before operation value of data is " + d.val);
        d.operation(100);
        System.out.println("After operation value of data is " + d.val);
    }
}


public class OverloadMethod {
    
    public void area(int b, int h) {
        System.out.println("Area of Triangle: " + (0.5 * b * h));
    }
    
    public void area(int r) {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }

    public static void main(String args[]) {
        OverloadMethod ob = new OverloadMethod();
        ob.area(10, 12);
        ob.area(5);
    }
}
