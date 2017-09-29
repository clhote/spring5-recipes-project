package clhote.spring.repositories;

import clhote.spring.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by CLH3623 on 29/09/2017.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
