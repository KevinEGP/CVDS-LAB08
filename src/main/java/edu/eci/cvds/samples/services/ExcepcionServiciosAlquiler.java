package edu.eci.cvds.samples.services;

import edu.eci.cvds.sampleprj.dao.PersistenceException;

public class ExcepcionServiciosAlquiler extends Exception { 
    public ExcepcionServiciosAlquiler(String errorMessage , PersistenceException e) {
        super(errorMessage, e);
    }

    public ExcepcionServiciosAlquiler(String errorMessage) {
        super(errorMessage);
    }
}