package dispensaryspring.example.dispensaryspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dispensaryspring.example.dispensaryspring.model.ProductModel;


public interface ProductRepository extends JpaRepository<ProductModel, Integer>{

}
