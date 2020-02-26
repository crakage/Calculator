import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalcClient {

    public static void main(String[] args) {
        try{
            Registry myReg = LocateRegistry.getRegistry("127.0.0.1", 1099);
            CalculatorInterface c = (CalculatorInterface)myReg.lookup("mycalc");

            int n1 = Integer.valueOf(args[1]);
            int n2 = Integer.valueOf(args[2]);


            if(args[0].equals("add")){
                System.out.println("Result is: " + c.add(n1,n2));

            } else if (args[0].equals("substract")){
                System.out.println("Result is: " + c.substract(n1,n2));

            } else if (args[0].equals("multiple")){
                System.out.println("Result is: " + c.multiply(n1,n2));

            } else if (args[0].equals("divide")){
                System.out.println("Result is: " + c.divide(n1,n2));

            } else {
                System.out.println("Operation error!");
            }


        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
