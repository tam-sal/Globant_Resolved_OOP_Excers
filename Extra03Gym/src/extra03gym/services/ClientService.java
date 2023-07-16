/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra03gym.services;

import extra03gym.entities.Client;
import java.util.ArrayList;

/**
 *
 * @author blue_
 */
public class ClientService {

    private final ArrayList<Client> _clientList = new ArrayList<>();
    private static int _clientCount = 0;

    public Client registerClient(String name, int age, double height, double weight, String target) {
        Client newClient = new Client(name, age, height, weight, target);
        _clientList.add(newClient);
        _clientCount++;
        return newClient;
    }

    public int getClientCount() {
        return _clientCount;
    }

    public ArrayList<Client> getClientList() {
        return _clientList;
    }

    private int getClientIdxById(int clientId) {
        for (Client c : _clientList) {
            if (c.getId() == clientId) {
                return _clientList.indexOf(c);
            }
        }
        return -1;
    }

    public void updateClientData(int clientId, String name, int age, double height, double weight, String target) {
        int clientIdx = getClientIdxById(clientId);
        if (clientIdx == -1) {
            System.out.println("Client Id: " + clientId + " doesn't exist");
        } else {
            Client clientToUpdate = _clientList.get(clientIdx);
            clientToUpdate.setName(name);
            clientToUpdate.setAge(age);
            clientToUpdate.setHeight(height);
            clientToUpdate.setWeight(weight);
            clientToUpdate.setTarget(target);
        }
    }

    public void deleteClient(int clientId) {
        int clientIdx = getClientIdxById(clientId);
        if (clientIdx != -1) {
            Client clientToDelete = _clientList.remove(clientId);
            System.out.println("Client has been successfully deleted:\n" + clientToDelete);
            _clientCount--;
        } else {
            System.out.println("Client Id: " + clientId + " doesn't exist!");
        }
    }

}
