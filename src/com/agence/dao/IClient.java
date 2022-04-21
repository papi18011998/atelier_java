package com.agence.dao;

import java.util.ArrayList;

import com.agence.entities.Client;

public interface IClient {
	public void create(Client client);
	public ArrayList<Client> list();
	public void update(Client client);
	public void delete(Client client);
	public Client find(Client client);

}
