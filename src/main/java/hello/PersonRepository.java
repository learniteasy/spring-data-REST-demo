package hello;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * At runtime, Spring Data REST will create an implementation of this interface
 * automatically. Then it will use the @RepositoryRestResource annotation to
 * direct Spring MVC to create RESTful endpoints at /people
 * 
 * @author arahee001c
 *
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

	List<Person> findByLastName(@Param("name") String name);

}