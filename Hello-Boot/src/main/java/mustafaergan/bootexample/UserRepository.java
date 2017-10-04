package mustafaergan.bootexample;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<ExampleEntity, Long> {

}
