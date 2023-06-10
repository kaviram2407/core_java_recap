package fuctionalprograms;

public class lambda_expresion {


    public static void main(String args[]) {
        GreetingService greetService1 = message ->
                System.out.println("welcomeeeeee " + message);
        greetService1.sayMessage("Kaviram");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
