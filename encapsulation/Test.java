package encapsulation;

public class Test {
    public static void main(String[] args) {

        Person p = new Person("John", 25, "USA");

        p.setName("Mike");   
        p.age = 30;          
        p.country = "Canada"; 

        System.out.println(p.getName());
        p.display();
    }
}
    

