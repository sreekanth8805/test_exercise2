package com.example.demo;

public class Product {


private int id;
private String description;
private int price;
private String brand;

//default constructor
public Product()
{
	
}
//constructor using fields
public Product(int id, String description, String brand,int price ) 
{
super();
this.id = id;
this.description = description;
this.price = price;
this.brand = brand;
}
//getters and setters
public int getId() 
{
return id;
}
public void setId(int id) 
{
this.id = id;
}
public String getDescription() 
{
return description;
}
public void setdescription(String description) 
{
this.description = description;
}
public String getBrand() 
{
return brand;
}
public void setBrand(String brand) 
{
this.brand = brand;
}
public int getPrice() 
{
return price;
}
public void setPrice(int price) 
{
this.price = price;
}
}