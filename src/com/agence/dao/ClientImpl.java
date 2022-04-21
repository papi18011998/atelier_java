package com.agence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.agence.entities.Client;

public class ClientImpl implements IClient{

	@Override
	public void create(Client client) {
		try {
			String request = "INSERT INTO client(`nom`,`prenom`,`adresse`,`tel`,`email`) VALUES(?,?,?,?,?)";
			Connection connection = DB.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(request);
			preparedStatement.setString(1, client.getNom());
			preparedStatement.setString(2, client.getPrenom());
			preparedStatement.setString(3, client.getAdresse());
			preparedStatement.setString(4, client.getTel());
			preparedStatement.setString(5, client.getEmail());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

	@Override
	public ArrayList<Client> list() {
		ArrayList<Client> clients = new ArrayList<Client>();
		try {
			String request = "SELECT * FROM client";
			Connection connection = DB.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(request);
			while(resultSet.next()) {
				Client client = new Client();
				client.setNumero(resultSet.getInt(1));
				client.setNom(resultSet.getString(2));
				client.setPrenom(resultSet.getString(3));
				client.setAdresse(resultSet.getString(4));
				client.setTel(resultSet.getString(5));
				client.setEmail(resultSet.getString(6));
				clients.add(client);
				
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		return clients;
	}

	@Override
	public void update(Client client) {
		try {
			String request = "UPDATE client SET prenom = ?, nom = ?,adresse = ?,tel = ?,email = ?  WHERE numero = ?";
			Connection connection = DB.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(request);
			preparedStatement.setString(1, client.getPrenom());
			preparedStatement.setString(2, client.getNom());
			preparedStatement.setString(3, client.getAdresse());
			preparedStatement.setString(4, client.getTel());
			preparedStatement.setString(5, client.getEmail());
			preparedStatement.setInt(6, client.getNumero());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	@Override
	public void delete(Client client) {
		try {
			String request = "DELETE FROM client  WHERE numero = ?";
			Connection connection = DB.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(request);
			preparedStatement.setInt(1, client.getNumero());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

	@Override
	public Client find(Client client) {
		try {
			String request = "SELECT * FROM client WHERE numero = ?";
			Connection connection = DB.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(request);
			preparedStatement.setInt(1, client.getNumero());
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				client.setNumero(resultSet.getInt(1));
				client.setNom(resultSet.getString(2));
				client.setPrenom(resultSet.getString(3));
				client.setAdresse(resultSet.getString(4));
				client.setTel(resultSet.getString(5));
				client.setEmail(resultSet.getString(6));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return client;
	}

}
