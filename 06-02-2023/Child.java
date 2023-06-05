public class Child extends Parent {
    String childName;

    public Child(String parentName, String childName) {
        super.parentName = parentName;
        this.childName = childName;
    }

    public Child(String childName) {
        this.childName = childName;
    }
}