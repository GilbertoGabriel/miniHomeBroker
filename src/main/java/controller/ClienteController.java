/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ClienteDao;
import java.util.Scanner;
import view.ClienteView;
import model.ClienteModel;

/**
 *
 * @author gilberto.castro
 */
public class ClienteController {
    ClienteView clienteView = new ClienteView();
    Scanner scan = new Scanner(System.in);
    boolean confirm = false;
    
    public void menu(ClienteDao clienteDao){
        int opcao;
        int idCliente;
        
        System.out.println("1 - ADICIONAR");
        System.out.println("2 - MOSTRAR");
        System.out.println("3 - MODIFICAR");
        System.out.println("4 - EXCLUIR");
        opcao = Integer.parseInt(scan.nextLine());
        
        ClienteModel[] clienteVet = clienteDao.getAll();
        switch (opcao) {
            case 1:
                ClienteModel cliente = clienteView.create();
                confirm = clienteDao.create(cliente);
                if (confirm) {
                    System.out.println("Cliente inserido");
                } else {
                    System.err.println("Cliente não inserido");
                }
                break;
            case 2:
                cl;ienteView.show(clienteVet);
                break;
            case 3:
                clienteView.mostrarId(clienteVet);
                System.out.println("Escolha o id: ");
                idJogador = Integer.parseInt(ler.nextLine());

                Jogador findJogador = jogadorDao.findById(idJogador);

                if (findJogador != null) {
                    findJogador = jogadorView.modificar(findJogador);
                    confirm = jogadorDao.update(findJogador);
                    if (confirm) {
                        System.out.println("Jogador modificado");
                    } else {
                        System.err.println("Jogador não modificado");
                    }
                } else {
                    System.err.println("Jogador não encontrado");
                }
                break;
            case 4:
                jogadorView.mostrarId(jogadorVet);
                System.out.println("Escolha o id: ");
                idJogador = Integer.parseInt(ler.nextLine());

                confirm = jogadorDao.delete(idJogador);
                if (confirm) {
                    System.out.println("Jogador excluido");
                } else {
                    System.err.println("Jogador não excluido");
                }
                break;
        }
    }
}
