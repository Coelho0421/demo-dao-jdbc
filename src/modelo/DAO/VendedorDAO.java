package modelo.DAO;

import modelo.entitidades.Departamento;
import modelo.entitidades.Vendedor;

import java.util.List;

public interface VendedorDAO {


    void insert(Vendedor obj);
    void update(Vendedor obj);
    void deleteById(Integer id);
    Vendedor findById(Integer id) throws Exception;
    List<Vendedor> findAll();

}
