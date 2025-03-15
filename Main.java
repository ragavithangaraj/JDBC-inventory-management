package database;
import java.util.*;
public class Main {

	public static void main(String[] args) throws StorageEmpty {
		// TODO Auto-generated method stub
Inventory inv = new Inventory();

        

        Scanner sc = new Scanner(System.in);

        String role = "";

        int opt;

        do {



            System.out.println("Are you an Admin or a User? Type 'exit' to terminate the program.");

            role = sc.nextLine().trim().toLowerCase();

            if (role.equals("exit")) {

                System.out.println("Terminating the program...");

                break;

            }

            if (role.equals("admin") || role.equals("user")) {

                do {

                    if (role.equals("admin")) {

                        System.out.println("1. Add \n2. Update \n3. Search \n4. Remove \n5. Show \n6. Logout");

                    } else if (role.equals("user")) {

                        System.out.println("3. Search \n5. Show \n6. Logout");



                    }

                    opt = sc.nextInt();



                    sc.nextLine();





                    switch (opt) {



                        case 1:



                            if (role.equals("admin")) {



                                Product p = new Product(); 



                                System.out.println("Product id: ");



                                p.setPid(sc.nextLine());



                                System.out.println("Product Name: ");



                                p.setPname(sc.nextLine());



                                System.out.println("Product type: ");



                                p.setPtype(sc.nextLine());



                                System.out.println("Product price: ");



                                p.setPrice(sc.nextFloat());

                                try 

                                {

                                	System.out.println("Quantity: ");

                                    p.setQuantity(sc.nextInt());

                                    if(p.quantity>50)

                                    {

                                    	throw new ProductOutofStock();

                                    }

                                }

                                    catch(ProductOutofStock e)

                                    {

                                    	e.display();

                                    	

                                    }

                              

                                



                                sc.nextLine(); 

                                inv.add(p);



                                System.out.println("Product added successfully.");



                            } 

                    else {



                                System.out.println("Invalid option. Please choose again.");



                            }



                            break;







                        case 2:



                            if (role.equals("admin")) {



                                System.out.println("Enter Product id to update: ");



                                String Pid = sc.nextLine();



                                Product p = inv.search(Pid);



                                if (p != null) {



                                    System.out.println("Enter new Product information: ");



                                    System.out.println("Product Name: ");



                                    p.setPname(sc.nextLine());



                                    System.out.println("Product type: ");



                                    p.setPtype(sc.nextLine());



                                    System.out.println("Product price: ");



                                    p.setPrice(sc.nextFloat());



                                    System.out.println("Quantity: ");



                                    p.setQuantity(sc.nextInt());



                                    sc.nextLine(); 



                                    inv.update();



                                } else {



                                    System.out.println("Product not found.");



                                }



                            } else {



                                System.out.println("Invalid option. Please choose again.");



                            }



                            break;







                        case 3:



                            if (role.equals("admin") || role.equals("user")) {



                                System.out.println("Enter Product id: ");



                                String Pid = sc.nextLine();



                                Product p = inv.search(Pid);

                                try

                                {

                                	if (p != null) {

                                        System.out.println(p);



                                    } else {



                                        throw new ProductNotFound();



                                    }

                                	

                                }

                                catch(ProductNotFound e)

                                {

                                	e.display();

                                	

                                }



                                



                            } else {



                                System.out.println("Invalid option. Please choose again.");



                            }



                            break;







                        case 4:



                            if (role.equals("admin")) {



                                System.out.println("Enter Product id to remove: ");



                                String Pid = sc.nextLine();



                                inv.remove(Pid);



                                inv.show();



                            } else {



                                System.out.println("Invalid option. Please choose again.");



                            }



                            break;







                        case 5:

						if (role.equals("admin") || role.equals("user")) {

							inv.show();    

						}





                            



                            break;







                        case 6:



                            System.out.println("Logging out...");



                            break;

                    }



                } while (opt != 6);



            } else {



                System.out.println("Invalid role. Please type 'admin' or 'user'.");



            }



        } while (!role.equals("exit"));







        sc.close();



	}

}
