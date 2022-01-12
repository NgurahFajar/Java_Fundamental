public class MethodOverLoading {
    public static void main(String[] args) {
sayHello();
sayHello("budi");
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);

    }
}

