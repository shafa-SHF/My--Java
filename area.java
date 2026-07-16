class Rectangle {
    int length;
    int width;
     int Area(){
        return length * width;
     }

}
public class area {
    public static void main(String[]args){
        Rectangle r1 = new Rectangle();

        r1.length = 12 ;
        r1.width = 6;

        System.out.println ("Rectangle Area is "+ r1.Area());


    }
    
}
