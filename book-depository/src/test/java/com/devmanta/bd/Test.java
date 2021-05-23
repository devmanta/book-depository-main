package com.devmanta.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	@org.junit.jupiter.api.Test
	public void testConn() {
		 Connection con = null;
	        PreparedStatement pstmt = null;   
	        ResultSet rs = null;
	        try {
	            Class.forName("org.mariadb.jdbc.Driver");
	            
	            con = DriverManager.getConnection(
	                "jdbc:mariadb://localhost:3306/BOOK",
	                "root",
	                "1234");
	            
	            //git push 테스트
	                        
	            pstmt = con.prepareStatement("select * from test");
	            
	            rs = pstmt.executeQuery();
	            
	            while(rs.next()) {
	                System.out.println(rs.getInt("no"));
	                System.out.println(rs.getString("content"));
	            }
	        } catch(Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if(rs != null) {
	                    rs.close();
	                }
	                
	                if(pstmt != null) {
	                    pstmt.close();
	                }
	            
	                if(con != null) {
	                    con.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	}
	
}
