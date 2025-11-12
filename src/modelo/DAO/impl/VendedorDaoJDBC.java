package modelo.DAO.impl;

import java.sql.Connection;

import db.DB;
import db.DbException;
import modelo.DAO.VendedorDAO;
import modelo.entitidades.Departamento;
import modelo.entitidades.Vendedor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class VendedorDaoJDBC implements VendedorDAO {

    private Connection conn;

    public VendedorDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Vendedor obj) {

    }

    @Override
    public void update(Vendedor obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Vendedor findById(Integer id) throws Exception {
        PreparedStatement st = null;
        ResultSet rs = null;

        try{
            st = conn.prepareStatement(
                  "SELECT seller.*,department.Name as DepName "
                    + "FROM seller INNER JOIN department "
                    + "ON seller.departmentId = department.Id "
                    + "WHERE seller.id = ?");

            st.setInt(1, id);
            rs = st.executeQuery();
            if(rs.next()){
                Departamento dep = new Departamento();
                dep.setId(rs.getInt("DepartmentId"));
                dep.setNome(rs.getString("DepName"));
                Vendedor obj = new Vendedor();

                obj.setId(rs.getInt("Id"));
                obj.setNome(rs.getString("Name"));
                obj.setEmail(rs.getString("Email"));
                obj.setSalario(rs.getDouble("BaseSalary"));
                obj.setAniversario(rs.getDate("BirthDate"));
                obj.setDepartamento(dep);
                return obj;
            }
            return null;
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {

        }
    }

    @Override
    public List<Vendedor> findAll() {
        return List.of();
    }
}

