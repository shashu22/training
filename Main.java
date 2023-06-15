//This is the Main class 
public class Main {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.printParent();
        p1.parent();
        Child c1 = new Child();
        c1.printParent();
        c1.printParent();
        c1.parent();
        c1.child();
        Parent p2 = new Child();
        p2.printParent();
        p2.parent();
        p2.printParent();
        // p2.child();
    }
}