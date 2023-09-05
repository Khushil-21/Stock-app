package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.UserBean;
import com.util.DBconnection;

public class UserDao {
	public void addUser(UserBean user) {
		try {

			Connection con = DBconnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert stockappusers (firstName,email,password,role) values (?,?,?,?) ");
			pstmt.setString(1, user.getFirstname());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());
			pstmt.setString(4, user.getRole());

			pstmt.executeUpdate(); //

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
