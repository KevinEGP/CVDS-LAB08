package edu.eci.cvds.samples.services.client;

import edu.eci.cvds.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.cvds.samples.services.ServiciosAlquilerFactory;

public class MyBatisGuice {
    public static void main(String[] args) throws ExcepcionServiciosAlquiler {
        ServiciosAlquilerFactory services = ServiciosAlquilerFactory.getInstance();
        System.out.println(services.getServiciosAlquiler().consultarClientes());
    }
}
