package encapsulation;

public class Test {
    public static void main(String[] args) {

        Person p = new Person("John", 25, "USA");

        p.setName("Mike");   // private via setter
        p.age = 30;          // protected
        p.country = "Canada"; // public

        System.out.println(p.getName());
        p.display();
    }
}
    

