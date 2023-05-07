public class AccessModifiers {
    public String publicVariable = "This is a public variable";
    private String privateVariable = "This is a private variable";
    protected String protectedVariable = "This is a protected variable";

    public void publicMethod() {
        System.out.println("This is a public method");
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defaultMethod() {
        System.out.println("This is a default method");
    }

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        // Accessing public members
        System.out.println(obj.publicVariable);
        obj.publicMethod();

        // Accessing private members (within the same class)
        System.out.println(obj.privateVariable);
        obj.privateMethod();

        // Accessing protected members (within the same package or subclass)
        System.out.println(obj.protectedVariable);
        obj.protectedMethod();

        // Accessing default members (within the same package)
        obj.defaultMethod();
    }
}
