public class cons2{
    int i;
    float m;
    String n;

    cons2(int id,String name,float marks){
        this.i=id;//this.class variable=parameter variable
        this.n=name;
        this.m=marks;//current classs object

    }

    void display(){
        System.out.println("student name::"+n);
        System.out.println("student marks::"+m);
        System.out.println("student id:"+i);
    }

    public static void main(String[] args){
        cons2 c11= new cons2(1,"lavya",45);
        c11.display();
    }
    

}