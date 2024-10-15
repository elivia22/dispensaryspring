//package dispensaryspring.example.dispensaryspring.service.impl;
//
//import dispensaryspring.example.dispensaryspring.model.ProductModel;
//import dispensaryspring.example.dispensaryspring.repository.ProductRepository;
//import dispensaryspring.example.dispensaryspring.service.ProductService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductServiceImpl__ implements ProductService {
//
////    ProductRepository productRepository;
////
////    public ProductServiceImpl__(ProductRepository productRepository) {
////        this.productRepository = productRepository;
////    }
////
////    @Override
////    public List<ProductModel> getAllProducts() {
////        return productRepository.findAll();
////    }
////
////    @Override
////    public ProductModel getProduct(Integer product_id) {
////
////        return productRepository.findById(product_id).orElse(null);
////    }
////
////    @Override
////    public String createProduct(ProductModel product) {
////        //logics
////        productRepository.save(product);
////        return "success create";
////    }
////
////    @Override
////    public String deleteProduct(Integer product_id) {
////        productRepository.deleteById(product_id);
////        return "success delete"+product_id;
////    }
////
////    @Override
////    public ProductModel updateProduct(ProductModel product) {
////        ProductModel existingProduct = productRepository.findById(product.getProduct_id()).orElse(null);
////        assert existingProduct != null;
////        existingProduct.setProduct_balance(product.getProduct_balance());
////        existingProduct.setProduct_description(product.getProduct_description());
////        existingProduct.setProduct_quantity(product.getProduct_quantity());
////        existingProduct.setProduct_description(product.getProduct_description());
////        existingProduct.setProduct_sale_price(product.getProduct_sale_price());
////        return productRepository.save(existingProduct);
////    }
//
//}
