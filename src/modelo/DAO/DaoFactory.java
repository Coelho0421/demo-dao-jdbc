package modelo.DAO;

import modelo.DAO.impl.VendedorDaoJDBC;

public class DaoFactory {

    public static VendedorDAO createVendedorDao(){
        return new VendedorDaoJDBC();
    }

}
