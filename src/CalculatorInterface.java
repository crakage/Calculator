import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorInterface  extends Remote {

    public int add(int n1, int n2) throws RemoteException;

    public int substract(int n1, int n2) throws RemoteException;

    public int multiply(int n1, int n2) throws RemoteException;

    public float divide(float n1, float n2) throws RemoteException;

}
