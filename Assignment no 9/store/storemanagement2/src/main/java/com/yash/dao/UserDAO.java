package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.yash.controller.Admin;

import com.yash.controller.User;



public class UserDAO {
@Autowired	
JdbcTemplate objJdbc;

public void setObjJdbc(JdbcTemplate objJdbc) {
}
 public int saveAdmin(Admin obja)
 {
	 String sql="insert into admin (username,name,password) values(?,?,?)";
	 return objJdbc.update(sql, obja.getUsername(),obja.getName(),obja.getPassword() );

 }
   public List<Admin> getAllAdmin()
   {	   
	  return objJdbc.query("select * from admin",new RowMapper <Admin>() 		{
		  public Admin mapRow(ResultSet rs,int rowno) throws SQLException
		  {
			  Admin obja = new Admin();
			  obja.setUsername(rs.getString("username"));
			  obja.setName(rs.getString("name"));
			  obja.setPassword(rs.getString("password"));
			return obja;
			  
		  }
	  	}  );
   }
   
   
   
   public int updateAdmin(Admin obja)
   {
  	 String sql="insert into admin (username,name,password) values(?,?,?)";
  	 return objJdbc.update(sql, obja.getUsername(),obja.getName(),obja.getPassword() );

   }
   
   
   
   
   
   public List<Admin> getLogin()
   {	   
	  return objJdbc.query("select * from admin",new RowMapper <Admin>() 		{
		  public Admin mapRow(ResultSet rs,int rowno) throws SQLException
		  {
			  Admin obja = new Admin();
			  
			  obja.setPassword(rs.getString("password"));
			  
			  return obja;
		  }
	  	}  );
   }
   
   public int saveUser(Admin obju)
   {
  	 String sql="insert into user2 (item,category,customer) values(?,?,?)";
  	 return objJdbc.update(sql, obju.getItem(),obju.getCategory(),obju.getCustomer());

   }
   
   public List<Admin> getAllUser()
   {	   
	  return objJdbc.query("select * from user2",new RowMapper <Admin>() 		{
		  public Admin mapRow(ResultSet rs,int rowno) throws SQLException
		  {
			  Admin obja = new Admin();
			  obja.setItem(rs.getString("item"));
			  obja.setCategory(rs.getString("category"));
			  obja.setCustomer(rs.getString("customer"));
			return obja;
			  
		  }
	  	}  );
   }
   
 
	public int updateUser(Admin obju) {
		String sql = "update user2 set item=?,category=? where uid=? ";
		return objJdbc.update(sql, obju.getItem(), obju.getCategory(),obju.getUid()
				);

	}
//	
//	public void DeleteItem(int i) {
//		
//		String sql = "delete from item where item_no = "+i;
//		System.out.println(i);
////		return objJdbc.update(sql, objitem.getItemno());
//
//	}
//	
//	
//
//	
   
	 public int saveItem(Admin obja)
	 {
		 String sql="insert into item2 (catid,itemname,price, dom, doe) values(1,?,?,?,?)";
		 return objJdbc.update(sql, obja.getItemname(),obja.getPrice(),obja.getDom(),obja.getDoe() );

	 }
	   public List<Admin> getAllItem()
	   {	   
		  return objJdbc.query("select * from item2",new RowMapper <Admin>() 		{
			  public Admin mapRow(ResultSet rs,int rowno) throws SQLException
			  {
				  Admin obja = new Admin();
				  obja.setItemname(rs.getString("itemname"));
				  obja.setPrice(rs.getString("price"));
				  obja.setDom(rs.getString("dom"));
				  obja.setDoe(rs.getString("doe"));
				return obja;
				  
			  }
		  	}  );
	   }
	   
	   
	   
	   public int saveCustomer(Admin obja)
		 {
			 String sql="insert into item2 (custname, emailid,password, address, mobileno) values(?,?,?,?,?)";
			 return objJdbc.update(sql, obja.getCustname(),obja.getEmailid(),obja.getAddress(),obja.getMobileno() );

		 }
		   public List<Admin> getAllCustomer()
		   {	   
			  return objJdbc.query("select * from item2",new RowMapper <Admin>() 		{
				  public Admin mapRow(ResultSet rs,int rowno) throws SQLException
				  {
					  Admin obja = new Admin();
					 obja.setCustname(rs.getString("custname"));
					 obja.setEmailid(rs.getString("emailid"));
					 obja.setPassword(rs.getString("password"));
					 obja.setAddress(rs.getString("address"));
					 obja.setMobileno(rs.getString("mobileno"));
					return obja;
					  
				  }
			  	}  );
		   }
		   
	  
		   public int saveCategory(Admin obju)
		   {
		  	 String sql="insert into user2 (item,category,customer) values(?,?,?)";
		  	 return objJdbc.update(sql, obju.getItem(),obju.getCategory(),obju.getCustomer());

		   }
		   
		   public List<Admin> getAllCategory()
		   {	   
			  return objJdbc.query("select * from user2",new RowMapper <Admin>() 		{
				  public Admin mapRow(ResultSet rs,int rowno) throws SQLException
				  {
					  Admin obja = new Admin();
					  obja.setItem(rs.getString("item"));
					  obja.setCategory(rs.getString("category"));
					  obja.setCustomer(rs.getString("customer"));
					return obja;
					  
				  }
			  	}  );
		   }
	
}





   
