package com.example.spring.sample.Controller;

import java.net.URI;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.spring.sample.Suggestion;
import com.example.spring.sample.Entity.Request;
import com.example.spring.sample.Service.ProductService;
import com.example.spring.sample.Entity.Product;
// import com.example.spring.sample.Service.ServiceImp;

@CrossOrigin(origins = "*")


@RestController
public class Controller {
	
	private static final URI Suggestion = null;
	
	@Autowired
	private ProductService Service;
	
	@GetMapping("/view")
    public List<Product> findAllProducts() {
    return Service.getAllProduct();

}
	
	// @GetMapping("/view")
	// public ResponseEntity<?> getAllProduct(){
	// 	List<Product> slist = ProductService.getAllProduct();
	// 	if(slist.size()==0) {
	// 		return new ResponseEntity<> (HttpStatus.NOT_FOUND);
	// 	}
	// 	return new ResponseEntity<List<Product>>(slist, HttpStatus.OK) ;
	// }
	
	// @PostMapping("/add")
	// public ResponseEntity<String> getAllResponseEntity(@RequestBody Map<String, Request> request) {
	// 	RestTemplate restTemp = new RestTemplate();
	// 	ResponseEntity<String> result = restTemp.postForEntity(Suggestion, request, String.class);
	// 	return result;
	// }
}
