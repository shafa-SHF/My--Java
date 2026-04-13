package Generic;

public class app {
    public static void main(String[]args)throws Exception{
        data< String, Double > eko = new data<String,Double>("Eko", 30.0);
        System.out.println(eko);

        data< String ,Integer > nunu = new data<String , Integer>("Shafa",23);
        System.out.println(nunu);

        data <String ,String > info = new data<String,String> ("Bandung", "08512367");
        System.out.println(info);

    }
    
}
