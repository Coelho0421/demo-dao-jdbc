package modelo.DAO;

import modelo.entitidades.Departamento;

import java.util.List;

public interface DepartamendoDAO {

    void insert(Departamento obj);
    void update(Departamento obj);
    void deleteById(Integer id);
    Departamento findById(Integer id);
    List<Departamento> findAll();


}
