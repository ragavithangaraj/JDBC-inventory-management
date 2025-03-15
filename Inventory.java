package database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
	Statement stmt;
	ResultSet rs;
	String qry=null;
	Connection con;
	int count;   
	    // Declaration of the collection's list
	    List<Product> list = new ArrayList<>();
	    Product p;
	DBUtil db=new DBUtil();
	 Main m; 
	    // Add method
	    public void add(Product p) {
	        //list.add(p);
	    	boolean sts=false;
	        try {
	        con=db.getDBConnection();
	        stmt=con.createStatement();
	        int count = stmt.executeUpdate("insert into details(id,name,type,price,qnty) values('"+p.getPid()+"','"+p.getPname()+"','"+p.getPtype()+"','"+p.getPrice()+"','"+p.getQuantity()+"')");
	        if(count==1)
	        sts=true;
	        else
	        throw new Exception();
	        }
	        catch(Exception ex) {
	        System.out.println(ex.getMessage());
	        }
	    }
	   
	    // Display the product details
	    public void show() {
	        // To print the entire list
	        // System.out.println(list);
	        // Readable format
	        /*for (Product p : list) {
	            System.out.println(p);*/
	    try {
	    con=db.getDBConnection();
	    stmt=con.createStatement();
	    rs=stmt.executeQuery("select * from details");
	    while(rs.next())
	       System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4)+" "+rs.getInt(5));
	    }catch(Exception ex)
	    {
	    System.out.println(ex.getMessage());
	    }
	       
	    }
	   
	    // Search
	    public Product search(String Pid) {
	        for (int i = 0; i < list.size(); i++) {
	            if (Pid.equals(list.get(i).getPid())) {
	                return list.get(i);
	            }
	        }
	        return null;
	    }
	   
	    // Update the product data
	    public void update() {
//	        System.out.println("Product Updated");
//	        show();
	    	boolean sts=false;
	        try {
	        con=db.getDBConnection();
	        stmt=con.createStatement();
	        count=stmt.executeUpdate("update details set name='"+p.getPname()+"' where id='"+p.getPid()+"'");
	        if(count==1)
	        sts=true;
	        else
	        throw new Exception();
	        }catch(Exception ex) {
	        System.out.println(ex.getMessage());
	        }
	        //System.out.println("Successfully updated");
	         }
	         
	   
	    // Remove the product
	    public void remove(String Pid) {
//	        for (int i = 0; i < list.size(); i++) {
//	            if (Pid.equals(list.get(i).getPid())) {
//	                list.remove(i);
//	                break;  // Exit the loop after removing the product
//	            }
//	        }
//	    }
	    	boolean sts=false;
	    	try {
	    		con= db.getDBConnection();
	    		stmt=con.createStatement();
	    		qry="delete from details where id="+Pid;
	    		count=stmt.executeUpdate(qry);
	    		if(count==1)
	    			sts=true;
	    	
	    		
	    	}catch(Exception ex)
	    	{
	    		System.out.println(ex.getMessage());
	    		
	    	}

	    }
}
