package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import edu.eci.cvds.sampleprj.dao.ItemRentadoDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ItemRentadoMapper;
import edu.eci.cvds.samples.entities.ItemRentado;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ItemMapper;
import edu.eci.cvds.samples.entities.TipoItem;
import java.sql.SQLException;
import java.util.List;

public class MyBATISItemRentadoDAO implements ItemRentadoDAO{

  @Inject
  private ItemRentadoMapper itemRentadoMapper;    

  @Override
  public void save(ItemRentado ir) throws PersistenceException{
  try{
      itemRentadoMapper.insertarItemRentado(ir);
  }
  catch(org.apache.ibatis.exceptions.PersistenceException e){
      throw new PersistenceException("Error al registrar el item rentado"+ir.toString(),e);
  }        

  }

  @Override
  public ItemRentado load(int id) throws PersistenceException {
  try{
      return itemRentadoMapper.consultarItemRentado(id);
  }
  catch(org.apache.ibatis.exceptions.PersistenceException e){
      throw new PersistenceException("Error al consultar el item rentado"+id,e);
  }


  }

  @Override
  public List<ItemRentado> loadAll(long docu) throws PersistenceException {
    try{
      return itemRentadoMapper.consultarItemsRentados(docu);
    }
    catch(org.apache.ibatis.exceptions.PersistenceException e){
      throw new PersistenceException("Error al consultar el item rentado"+docu,e);
    }


  }


  }