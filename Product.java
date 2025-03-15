package database;

public class Product {
	String Pid;



    String Pname;



    String Ptype;



    public float price;



    int quantity;







    // Empty constructor



    public Product() {



    }







    // Constructor



    public Product(String pid, String pname, String ptype, float price, int quantity) {



        this.Pid = pid;



        this.Pname = pname;



        this.Ptype = ptype;



        this.price = price;



        this.quantity = quantity;



    }







    // Setter methods



    public void setPid(String pid) {



        this.Pid = pid;



    }







    public void setPname(String pname) {



        this.Pname = pname;



    }







    public void setPtype(String ptype) {



        this.Ptype = ptype;



    }







    public void setPrice(float price) {



        this.price = price;



    }







    public void setQuantity(int quantity) {



        this.quantity = quantity;



    }







    // Getter methods



    public String getPid() {



        return Pid;



    }







    public String getPname() {



        return Pname;



    }







    public String getPtype() {



        return Ptype;



    }







    public float getPrice() {



        return price;



    }







    public int getQuantity() {



        return quantity;



    }







    // toString method



   

    public String toString() {



        return "Product [Pid=" + Pid + ", Pname=" + Pname + ", Ptype=" + Ptype + ", price=" + price + ", quantity=" + quantity + "]";



    }
	

}
