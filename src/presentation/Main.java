package presentation;

import java.util.ArrayList;
import java.util.Scanner;

import com.agence.dao.ClientImpl;
import com.agence.entities.Client;

public class Main {

	public static void main(String[] args) {
		ArrayList<Client> clients = new ArrayList<Client>();
		ClientImpl clientImpl = new ClientImpl();
		boolean reprise;
		int choix;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("====================== MENU ============================");
			System.out.println("1-Liste des clients");
			System.out.println("2-Ajouter un client");
			System.out.println("3-Modifier un client");
			System.out.println("4-Supprimer un client");
			System.out.println("Faites votre choix !!!");
			choix = sc.nextInt();
			switch (choix) {
			case 1: 
				System.out.println("====================== LISTE DES CLIENTS ============================");
				clients = clientImpl.list();
				for(Client client : clients) {
					System.out.println(client.getPrenom()+" "+client.getNom());
				}
				break;
			case 2:
				Client client = new Client();
				System.out.println("====================== AJOUTER UN CLIENT ============================");
				System.out.println("Saisir le prenom du client");
				client.setPrenom(sc.next());
				System.out.println("Saisir le nom du client");
				client.setNom(sc.next());
				System.out.println("Saisir l'adresse du client");
				client.setAdresse(sc.next());
				System.out.println("Saisir le numero de telephone du client");
				client.setTel(sc.next());
				System.out.println("Saisir l'email du client");
				client.setEmail(sc.next());
				
				clientImpl.create(client);
				System.out.println("Client Ajouté !!!");
				break;
			case 3:
				System.out.println("====================== MODIFICATION DE CLIENT ============================");
				int index_client;
				clients = clientImpl.list();
				for(int i = 0;i<clients.size();i++) {
					System.out.println(i+"-"+clients.get(i).getPrenom()+" "+ clients.get(i).getNom());
				}	
				System.out.println("Saisir le numero du client que vous voulez modifier");
				index_client = sc.nextInt();
				
				Client client_update = clients.get(index_client);
				System.out.println(client_update.getPrenom());
				System.out.println("Saisir le prenom du client");
				client_update.setPrenom(sc.next());
				System.out.println("Saisir le nom du client");
				client_update.setNom(sc.next());
				System.out.println("Saisir l'adresse du client");
				client_update.setAdresse(sc.next());
				System.out.println("Saisir le numero de telephone du client");
				client_update.setTel(sc.next());
				System.out.println("Saisir l'email du client");
				client_update.setEmail(sc.next());
				clientImpl.update(client_update);
				break;
			case 4 :
				clients = clientImpl.list();
				for(int i = 0;i<clients.size();i++) {
					System.out.println(i+"-"+clients.get(i).getPrenom()+" "+ clients.get(i).getNom());
				}	
				System.out.println("Saisir le numero du client que vous voulez supprimer");
				index_client = sc.nextInt();
				Client client_delete = clients.get(index_client);
				clientImpl.delete(client_delete);
				break;
			default:
				System.out.println("Choix indisponible");
				break;
			}
			System.out.println("Souhaitez vous reprendre le programme true/false");
			reprise = sc.nextBoolean();
		}while(reprise);

		sc.close();
	}

}
