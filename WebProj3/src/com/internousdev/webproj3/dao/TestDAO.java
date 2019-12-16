package com.internousdev.webproj3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.webproj3.util.DBConnector;

public class TestDAO {
	public int insert(String username,String password) {
		int ret = 0;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "insert into users(user_name,password) values(?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			int i = ps.executeUpdate();
			if(i >0) {
				System.out.println(i + "件登録されました");
				System.out.println("1～100の数字を縦に表示させ、\n3の倍数のとき、\n5の倍数のとき、\n15の倍数のとき、\n数字の右側に「　←○の倍数」を表示させよ。");
				ret = i;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
}