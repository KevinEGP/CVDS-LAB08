package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import edu.eci.cvds.sampleprj.dao.ClienteDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ItemMapper;
import edu.eci.cvds.samples.entities.TipoItem;
import java.sql.SQLException;
import java.util.List;

public class MyBATISClienteDAO implements ClienteDAO{

  @Inject
  private ClienteMapper clienteMapper;

  @Override
  public void save(Cliente cl) throws PersistenceException{
  try{
      clienteMapper.insertarCliente(cl);
  }
  catch(org.apache.ibatis.exceptions.PersistenceException e){
      throw new PersistenceException("Error al registrar el cliente "+cl.toString(),e);
  }        

  }

  @Override
  public Cliente load(long id) throws PersistenceException {
  try{
      return clienteMapper.consultarCliente(id);
  }
  catch(org.apache.ibatis.exceptions.PersistenceException e){
      throw new PersistenceException("Error al consultar el cliente "+id,e);
  }


  }
  public List<Cliente> loadAll() throws PersistenceException{
    try{
      return clienteMapper.consultarClientes();
    }
    catch(org.apache.ibatis.exceptions.PersistenceException e){
      throw new PersistenceException("Error al consultar los clientes",e);
    }
  }

  }