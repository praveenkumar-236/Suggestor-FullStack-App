package com.example.spring.sample.Repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.spring.sample.Entity.Product;


@Repository
// public interface ProductRepository extends MongoRepository<Product, Integer>  {


public interface ProductRepository extends JpaRepository<Product, Integer>  {

}
// public class ProductRepository{

    // public void createProduct(){

    //     List<Product> list=new ArrayList<Product>();
    //     list=List.of(
    //         new Product(1,"Jeans",32,"blue",333),
    //         new Product(2,"Jeans",32,"blue",333),
    //         new Product(3,"Jeans",32,"blue",333),
    //         new Product(4,"Jeans",32,"blue",333)
    //         );
    // }
//     public List<Product> getAllProduct(){
//         List<Product>list =new ArrayList<Product>();
//         list=List.of(
//             new Product(1,"Cotton","Shirt","XL","Green",500),
//             new Product(2,"Lycra","Pant","L","Yellow",800),
//             new Product(3,"Cotton","Coat","M","Red",1500),
//             new Product(4,"Jeans","Trouser","s","Pink",400),
//             new Product(5,"Leather","Jacket","XLXL","Black",3000),
//             new Product(6,"Cotton" ,"T-shirt","L","Purple",300),
//             new Product(7,"Cotton","Shirt","S","Grey",900),
//             new Product(8,"Cotton","T-shirt","XLXL","Sandal",300),
//             new Product(9,"leather","Sweater","L","OliveGreen",2500),
//             new Product(10,"Cotton","TrackPant","M","Blue",600)

//         );
//         return list;
//     }
// }
