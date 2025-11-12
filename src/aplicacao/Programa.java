package aplicacao;

import modelo.DAO.DaoFactory;
import modelo.DAO.VendedorDAO;
import modelo.entitidades.Departamento;
import modelo.entitidades.Vendedor;

import java.util.Date;

public class Programa {

    public static void main(String[] args){

        Departamento obj = new Departamento(1, "Livros");
        Vendedor vendedor = new Vendedor(21, "bob", "bob123@gmail.com", new Date(), 3000.0);

        VendedorDAO vendedorDAO = DaoFactory.createVendedorDao();

        System.out.println(vendedor);

    }
}
