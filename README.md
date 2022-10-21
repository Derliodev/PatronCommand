## Getting Started

Este patrón resulta útil en escenarios en los que se han de enviar peticiones a otros objetos sin saber qué operación se ha de realizar, y ni tan siquiera quién es el receptor de dicha petición.
Dicho de otro modo: tenemos varios objetos que realizan acciones similares de forma diferente, y queremos que se procese la adecuada dependiendo del objeto solicitado.

- Nuestro Receiver es la clase Cuenta.java
- Nuestro Command es la interfaz IOperacion.java, la cual solo tiene un metodo execute
- Las clases que implementan IOperacion son las clases concretas DepositarImpl.java y RetirarImpl.java
- La Clase Invoker es la encargada de apilar las distintas operaciones.
- Finalmente, nuestra clase Main, instancia la clase Cuenta, llama a DepositarImpl y RetirarImpl para terminar instanciando a la Clase Invoker y llamando a los métodos apilados.


## Salida

[COMANDO DEPOSITAR] Cuenta: 1 Saldo: 300.0
[COMANDO RETIRAR] Cuenta: 1 Saldo: 250.0