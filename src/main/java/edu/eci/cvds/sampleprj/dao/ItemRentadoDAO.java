package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.samples.entities.ItemRentado;

import java.util.List;

public interface ItemRentadoDAO {

   public void save(ItemRentado it) throws PersistenceException;

   public ItemRentado load(int id) throws PersistenceException;

   public List<ItemRentado> loadAll(long docu) throws PersistenceException;

}