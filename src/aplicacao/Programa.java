package aplicacao;

import modelo.DAO.DaoFactory;
import modelo.DAO.VendedorDAO;
import modelo.entitidades.Departamento;
import modelo.entitidades.Vendedor;

import java.util.Date;

public class Programa {

    public static void main(String[] args) throws Exception {

        Departamento obj = new Departamento(1, "Livros");


        VendedorDAO vendedorDAO = DaoFactory.createVendedorDao();

        Vendedor vendedor = vendedorDAO.findById(1);

        System.out.println(vendedor);

    }
}
