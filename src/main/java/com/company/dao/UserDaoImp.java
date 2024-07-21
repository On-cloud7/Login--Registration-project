package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.util.DBUtil;



public class UserDaoImp implements UserDao {
	 @Override
	    public boolean isValidUser(String username,String  password) {
	        String query = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";

	        try (Connection connection = DBUtil.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

	            preparedStatement.setString(1, username());
	            preparedStatement.setString(3, password());

	            int rowsAffected = preparedStatement.executeUpdate();

	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	private String password() {
		// TODO Auto-generated method stub
		return null;
	}

	private String username() {
		// TODO Auto-generated method stub
		return null;
	}