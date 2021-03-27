//mvn exec:java -D"exec.mainClass"="edu.eci.cvds.samples.services.client.MyBatisGuice"
package edu.eci.cvds.samples.services.client;

import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.entities.ItemRentado;
import edu.eci.cvds.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.cvds.samples.services.ServiciosAlquiler;
import edu.eci.cvds.samples.services.ServiciosAlquilerFactory;
import edu.eci.cvds.samples.services.impl.ServiciosAlquilerImpl;

import java.util.ArrayList;

public class MyBatisGuice {
    public static void main(String[] args) throws ExcepcionServiciosAlquiler {
        ServiciosAlquilerFactory factory = ServiciosAlquilerFactory.getInstance();
        ServiciosAlquiler services = factory.getServiciosAlquiler();
        //Cliente cl =  new Cliente("Name", 215298803, "30000", "Cl 0 #0-0", "mail3@email.co");
        //services.registrarCliente(cl);
        //System.out.println(services.consultarClientes());
        System.out.println(services.consultarCliente(215298801));
        //System.out.println(services.consultarItemsCliente(5));
    }
}
