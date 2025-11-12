package aplicacao;

import modelo.entitidades.Departamento;
import modelo.entitidades.Vendedor;

import java.util.Date;

public class Programa {

    public static void main(String[] args){

        Departamento obj = new Departamento(1, "Livros");
        Vendedor vendedor = new Vendedor(21, "bob", "bob123@gmail.com", new Date(), 3000.0);

        System.out.println(vendedor);

    }
}
