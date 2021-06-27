package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService  
{
@Override
public List<Product> findAll()
{
//creating an object of ArrayList
ArrayList<Product> products = new ArrayList<Product>();
//adding products to the List
products.add(new Product(100, "Mobile", "iPhone", 50000));
products.add(new Product(101, "Smart TV", "LG", 60000));
products.add(new Product(102, "Washing Machine", "Samsung", 9000));
products.add(new Product(103, "Laptop", "HP", 24000));
products.add(new Product(104, "Air Conditioner", "Lloyd", 30000));
products.add(new Product(105, "Refrigerator ", "whirlpool", 10000));
//returns a list of product
//return products;

// sort items by price

System.out.println("Sort by highest price :");

Collections.sort(products, new Comparator<Product>() {
    @Override
    public int compare(Product p1, Product p2) {
        return p2.getPrice() - p1.getPrice();
    }
}); 
return products;
//System.out.println(products);
}
}
