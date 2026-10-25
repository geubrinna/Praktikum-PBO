package guided.gd1;

public class Demo {
    public static void main(String[] agrs){

        A superClass = new A();
        B subClass = new B();

        superClass.x = 3;
        superClass.y = 4;

        System.out.println("SuperClass: ");
        superClass.tampilxy();

        subClass.x = 1;
        subClass.y = 2;
        subClass.z = 3;

        System.out.println("SubClass: ");
        subClass.jumlahxyz();
    }
}
