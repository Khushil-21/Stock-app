package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.UserBean;
import com.util.DBconnection;

public class UserDao {
	public String addUser(UserBean user) {
		try {

			Connection con = DBconnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert stockappusers (firstName,email,password,role) values (?,?,?,?) ");
			pstmt.setString(1, user.getFirstname());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());
			pstmt.setString(4, user.getRole());

			pstmt.executeUpdate(); //
			return "ok";

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public UserBean authenitcate(String email, String password) {
		try {
			Connection con = DBconnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from stockappusers where email = ? and password =  ?");
			pstmt.setString(1, email);
			pstmt.setString(2, password);
	
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) { //rs.next() -> false 
				UserBean user = new UserBean();
				user.setUser_id(rs.getInt("user_id"));
				user.setFirstname(rs.getString("firstName"));
				user.setEmail(email);
				user.setPassword(password);
				user.setRole(rs.getString("role"));
				return user;// user's email and password match
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}




