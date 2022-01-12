public class Scope {
    public static void main(String[] args) {
        sayHello("budi");

    }
    static void sayHello(String name){
        String hello = "Hello " + name;

        if (!name.isBlank()){
            String hi = "hi " + name;
            System.out.println(hi);
        }


        System.out.println(hello);
    }
}
