package edu.eci.cvds.sampleprj.dao.mybatis.mappers;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.samples.entities.ItemRentado;

public interface ItemRentadoMapper {
    
    
    public List<ItemRentado> getItemsRentados();
    
    public ItemRentado getItemRentado(int id);
    
    public void addItemRentado(String des);

}