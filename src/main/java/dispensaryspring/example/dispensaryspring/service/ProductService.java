package dispensaryspring.example.dispensaryspring.service;

import java.util.List;

import dispensaryspring.example.dispensaryspring.model.ProductModel;
import dispensaryspring.example.dispensaryspring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

//    public ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductModel getProduct(Integer product_id) {

        return productRepository.findById(product_id).orElse(null);
    }

    public String createProduct(ProductModel product) {
        //logics
        productRepository.save(product);
        return "success create";
    }

    public String deleteProduct(Integer product_id) {
        productRepository.deleteById(product_id);
        return "success delete"+product_id;
    }

    public ProductModel updateProduct(ProductModel product) {
        ProductModel existingProduct = productRepository.findById(product.getProduct_id()).orElse(null);
        assert existingProduct != null;
        existingProduct.setProduct_balance(product.getProduct_balance());
        existingProduct.setProduct_description(product.getProduct_description());
        existingProduct.setProduct_quantity(product.getProduct_quantity());
        existingProduct.setProduct_description(product.getProduct_description());
        existingProduct.setProduct_sale_price(product.getProduct_sale_price());
        return productRepository.save(existingProduct);
    }
}
