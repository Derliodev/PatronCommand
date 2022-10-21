package ejecucion;
import banco.Cuenta;
import banco.DepositarImpl;
import banco.Invoker;
import banco.RetirarImpl;

public class App {
    public static void main(String[] args) throws Exception {
        Cuenta cuenta = new Cuenta(1, 200);

        DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
        RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);

        Invoker ivk = new Invoker();
        ivk.recibirOperaciones(opDepositar);
        ivk.recibirOperaciones(opRetirar);

        ivk.realizarIperaciones();
    }
}
