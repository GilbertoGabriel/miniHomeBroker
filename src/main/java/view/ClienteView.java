/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.time.LocalDateTime;
import java.util.Scanner;
import model.ClienteModel;

/**
 *
 * @author gilberto.castro
 */
public class ClienteView {
    
Scanner scan = new Scanner(System.in);
    public ClienteModel create() {

        ClienteModel cliente = new ClienteModel();
        cliente.setNome("Eduardo No Arms");
        cliente.setCpf("25414422308");
        cliente.setPais("Brasil");
        cliente.setEstado("Minas Gerais");
        cliente.setCidade("Uberaba");
        cliente.setBairro("Beija flor");
        cliente.setRua("Ramid Mauad");
        cliente.setNumeroCasa(198);
        cliente.setTelefone("034988801232");
        cliente.setLogin("dudu");
        cliente.setSenha("123");
        cliente.setTipoUsuario(2);//ADM
        cliente.setDataCriacao(LocalDateTime.now());
         cliente.setDataModificacao(LocalDateTime.now());
        return cliente;
       }
    
    public ClienteModel update (ClienteModel cliente){
        cliente.setNome(scan.nextLine());
        cliente.setCpf(scan.nextLine());
        cliente.setPais(scan.nextLine());
        cliente.setEstado(scan.nextLine());
        cliente.setCidade(scan.nextLine());
        cliente.setBairro(scan.nextLine());
        cliente.setRua(scan.nextLine());
        cliente.setNumeroCasa(Integer.parseInt(scan.nextLine()));
        cliente.setTelefone(scan.nextLine());
        cliente.setLogin(scan.nextLine());
        cliente.setSenha(scan.nextLine());
         cliente.setDataModificacao(LocalDateTime.now());
        return cliente;
    }
    
   public ClienteModel show(ClienteModel cliente){
       System.out.println("Id" + cliente.getId());
       System.out.println("Nome" + cliente.getNome());
       System.out.println("Cpf" + cliente.getCpf());
       System.out.println("Endereço");
       System.out.println("Pais" + cliente.getPais());
       System.out.println("Estado" + cliente.getEstado());
       System.out.println("Cidade" + cliente.getCidade());
       System.out.println("Bairro" + cliente.getBairro());
       System.out.println("Rua" + cliente.getRua());
       System.out.println("Numero" + cliente.getNumeroCasa());
       System.out.println("Telefone" + cliente.getNumeroCasa());
       System.out.println("Login" + cliente.getLogin());
       System.out.println("Senha" + cliente.getSenha());
       System.out.println("-------------------------------------------\n\n");
       return cliente;
   }
}
