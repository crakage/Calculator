import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImplementation extends UnicastRemoteObject implements CalculatorInterface {

    public CalculatorImplementation() throws RemoteException{

    }

    public int add(int n1, int n2) throws RemoteException {
        return n1 + n2;

    }

    public int substract(int n1, int n2) throws RemoteException {
        return n1 - n2;

    }

    public int multiply(int n1, int n2) throws RemoteException {
        return n1 * n2;

    }

    public float divide(float n1, float n2) throws RemoteException {
        return n1 / n2;

    }
}
