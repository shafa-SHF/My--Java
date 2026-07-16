package Generic;

public class data <T,U>{
    private T data1;
    private U data2;

    public data(T a,U b){
        this.data1 = a ;
        this.data2 = b ;

    }
    public T getdata(){
        return this.data1;
    }
    public U getUdata(){
        return this.data2;
    }
     public String toString(){
        return this.getdata()+ " "+this.getUdata();
     }
}
