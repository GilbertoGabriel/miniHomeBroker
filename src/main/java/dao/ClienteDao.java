/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.ClienteModel;
import view.ClienteView;

/**
 *
 * @author gilberto.castro
 */
public class ClienteDao {
    private int id = 1;
    private ClienteModel[ ] listClientes = new ClienteModel[10];
    ClienteView clienteView = new ClienteView();
    
    public ClienteDao (){
       this.create(clienteView.create());
    }
    
     public boolean create(ClienteModel cliente) {
           for (int i = 0; i < listClientes.length; i++) {
            if (listClientes[i] == null) {
                listClientes[i].setId(id);
                id++;
                listClientes[i] = cliente;
                return true;
            }
        }
        return false;
        
    }
     
   public boolean update(ClienteModel cliente) {
        for (int i = 0; i < listClientes.length; i++) {
            if (listClientes[i].getId() == cliente.getId()) {
                listClientes[i] = cliente;
                return true;
            }
        }
        return false;
    }
   
    public ClienteModel findById(int idCliente) {
        for (int i = 0; i < listClientes.length; i++) {
            if (listClientes[i].getId() == idCliente) {
                return listClientes[i];
            }
        }
        return null;
    }

    public ClienteModel[] getAll() {
        return listClientes;
    }
}
