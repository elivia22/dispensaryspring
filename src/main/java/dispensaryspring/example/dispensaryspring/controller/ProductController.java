package dispensaryspring.example.dispensaryspring.controller;

import dispensaryspring.example.dispensaryspring.model.ProductModel;
import dispensaryspring.example.dispensaryspring.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }

    @GetMapping("/id/{product_id}")
    public ProductModel getProduct(@PathVariable("product_id") Integer product_id) {

        return productService.getProduct(product_id);
    }

    @GetMapping("/all")
    public List<ProductModel> getAllProduct() {

        return productService.getAllProducts();
    }


    @PostMapping("/create")
    public String createProduct(@RequestBody ProductModel product) {

        productService.createProduct(product);
        return "Successful Created Product";
    }

    @PutMapping("/update")
    public String updateProduct(@RequestBody ProductModel product) {

        productService.updateProduct(product);
        return "Successful Updated Product";
    }

    @DeleteMapping("/delete/id/{product_id}")
    public String deleteProduct(@PathVariable("product_id") Integer product_id) {

        productService.deleteProduct(product_id);
        return "Successful Deleted Product";
    }
}
