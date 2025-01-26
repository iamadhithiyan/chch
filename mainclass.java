import java.util.Scanner;
import java.util.InputMismatchException;

class Demo {
    
    public int add(int a,int b){
        System.out.println("ADD");
        return a + b;
    }
    public int mul(int X,int Y){
        System.out.println("mul");
        return X * Y;
    } 
}
class Demo1{
    
    public int add(int X,int Y){
        System.out.println("SUB");
        return X - Y;
    }
}

class mainclass{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a=0,b=0;
        try{
        System.out.println("ENTER NUM 1");
        a = i.nextInt();
        System.out.println("ENTER NUM 2");
        b = i.nextInt();
    }
    catch (InputMismatchException o) {
        System.out.println(o);
    }    

    catch(Exception o){
        System.out.println(o);
 } 
        
        Demo ob = new Demo();
        int c = ob.add(a,b);
        System.out.println("Add: " + c);
    
        Demo1 ob1 = new Demo1();
        Demo ob3 = new Demo();
        
        System.out.println("Sub: " + ob1.add(a,b));
       
        System.out.println("MUL: " + ob3.mul(a,b));
    }
}
