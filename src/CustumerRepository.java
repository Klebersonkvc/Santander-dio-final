import com.santander.devweek.model.Customer;

import com.santander.devweek.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustumerRepository extends JpaRepository<Customer, Long> {
    
}
