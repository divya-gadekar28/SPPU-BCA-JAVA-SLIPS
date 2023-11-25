//Define a class MyNumber having one private integer data member. Write a parameterized
//constructor to initialize to a value. Write isOdd() to check given number is odd or not. Use command
//line argument to pass a value to the object.

class number{
    int n;
    number(int n){
        this.n=n;
    }
    boolean isOdd(){
        if(n%2!=0){
            return true;
        }
        else{
            return false;
        }
    }
}


public class slip17_q1 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        number num=new number(n);
        if(num.isOdd()){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
   
}
