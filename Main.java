package evaltuaion2;

public class Main {
    public static void main(String[] args) {
        InterfaceThree obj1 = new ClassTwo();
        System.out.println(obj1);
        obj1.methodOne();
        obj1.methodTwo();
        obj1.methodThree();

        InterfaceOne obj2 = new ClassTwo();
        obj2.methodOne();

        ClassTwo c4 = (ClassTwo) obj2;
        c4.methodTwo();
        c4.methodThree();
    }
}
