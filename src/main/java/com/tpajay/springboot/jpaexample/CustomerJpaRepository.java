package tpajay.springboot.jpaexample;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CustomerJpaRepository extends CrudRepository<Customer, Long> {

}
