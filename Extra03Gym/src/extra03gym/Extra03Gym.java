/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra03gym;

import extra03gym.entities.Client;
import extra03gym.services.ActivityService;
import extra03gym.services.ClientService;
import java.util.Arrays;

/**
 *
 * @author blue_
 */
public class Extra03Gym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ClientService cs = new ClientService();
        ActivityService ac = new ActivityService();
        cs.registerClient("Tam1", 25, 1.8, 70.2, "running");
        cs.registerClient("Tam2", 50, 1.8, 70.2, "swimming");
        cs.registerClient("Tam3", 35, 1.8, 70.2, "yoga");
        cs.registerClient("Tam2", 50, 1.8, 70.2, "swimming");
        cs.registerClient("Tam3", 35, 1.8, 70.2, "yoga");
        
        ac.createActivity("running", 10, "medium", "running for 10 minutes");
        ac.createActivity("swimming", 10, "medium", "swimming for 10 minutes");
        ac.createActivity("jogging", 10, "medium", "jogging for 10 minutes");
        ac.createActivity("weight lift", 10, "hard", "weight lifting for 10 minutes");
        ac.createActivity("whatever", 10, "medium", "running for 10 minutes");
        System.out.println("Activity List:\n"+ac.getAllActivities().toString());
        ac.updateActivity(4, "sprint", 0, null, null);
        
        ac.deleteActivityById(0);

        
        System.out.println("Client List:\n" + cs.getClientList().toString());
        System.out.println("Activity List:\n"+ac.getAllActivities().toString());

        cs.deleteClient(0);
        cs.deleteClient(100);
        System.out.println("Client List:\n" + cs.getClientList().toString());


    }

}
