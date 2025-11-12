package modelo.DAO;

import db.DB;
import modelo.DAO.impl.VendedorDaoJDBC;

public class DaoFactory {

    public static VendedorDAO createVendedorDao() throws Exception {
        return new VendedorDaoJDBC(DB.getConnection());

    }

}
