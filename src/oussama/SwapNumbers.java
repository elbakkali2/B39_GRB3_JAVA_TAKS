package oussama;

public class SwapNumbers {
    public static void main(String[] args) {
        //SWAP NUMBERS
        //Swap 2 numbers without creating x 3rd variable

                int x = 50;
                int y = 100;

                System.out.println("Before swap: x = " + x + ", y = " + y);

                x = x + y;  // x becomes 150
                y = x - y;  // y becomes 50 (original x)
                x = x - y;  // x becomes 100 (original y)

                System.out.println("After swap: x = " + x + ", y = " + y);
            }



}
