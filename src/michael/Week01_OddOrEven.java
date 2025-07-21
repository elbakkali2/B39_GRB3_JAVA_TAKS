package michael;

public class Week01_OddOrEven {
    public static void main(String[] args) {
        System.out.println("Number you provided is "+ identifyOddEven(5));
        System.out.println("Number you provided is "+identifyOddEven(6));
        System.out.println("Number you provided is "+identifyOddEven(0));
        System.out.println("Number you provided is "+identifyOddEven(-1));
        System.out.println("Number you provided is "+identifyOddEven(-2));
    }



    public  static  String  identifyOddEven( int  n ) {
        return  n%2==0 ? "Even" : "Odd" ;
    }

}
