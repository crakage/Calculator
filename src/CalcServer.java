import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalcServer {

    public static void main(String[] args) {

        try{
            Registry reg = LocateRegistry.createRegistry(1099);
            CalculatorImplementation c = new CalculatorImplementation();
            reg.rebind("mycalc", c);

            System.out.println("Server is ready...");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
