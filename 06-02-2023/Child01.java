public class Child01 extends Parent01 {
    String childName;

    public Child01(String parentName, String childName) {
        super.parentName = parentName;
        this.childName = childName;
    }

    public Child01(String childName) {
        this.childName = childName;
    }
}