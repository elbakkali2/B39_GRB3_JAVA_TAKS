package Aisha;

public class OddOrEven {
    public static void main(String[] args) {
        evenOrOdd(-3);
    }


    public static void evenOrOdd(int n) {
        if (n == 0) {
            System.out.println(n + " is even number, but zero is a special number");
            return;
        }
            if(n%2==0)
            System.out.println("even");
            else {
                System.out.println("odd");
            }

        }

    }

/*
  if (n == 0) {
            System.out.println("Cannot be zero");
        } else if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
 */


