package aplicacao;

import modelo.DAO.DaoFactory;
import modelo.DAO.VendedorDAO;
import modelo.entitidades.Departamento;
import modelo.entitidades.Vendedor;

import java.util.Date;
import java.util.List;

public class Programa {

    public static void main(String[] args) throws Exception {

        VendedorDAO vendedorDAO = DaoFactory.createVendedorDao();

        System.out.println("=== TESTE 1");
        Vendedor vendedor = vendedorDAO.findById(1);

        System.out.println(vendedor);

        System.out.println("TEste 2");
        Departamento departamento = new Departamento(1, null);
        List<Vendedor> list = vendedorDAO.findByDepartamento(departamento);
        for(Vendedor obj : list){
            System.out.println(obj);
        }


    }
}
