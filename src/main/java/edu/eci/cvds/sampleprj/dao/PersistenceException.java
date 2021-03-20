package edu.eci.cvds.sampleprj.dao;

public class PersistenceException extends Exception { 
    public PersistenceException(String errorMessage) {
        super(errorMessage);
    }

    public PersistenceException(String errorMessage, org.apache.ibatis.exceptions.PersistenceException e) {
        super(errorMessage, e);
    }
}