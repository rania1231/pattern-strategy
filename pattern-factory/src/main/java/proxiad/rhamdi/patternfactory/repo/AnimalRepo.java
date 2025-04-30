package proxiad.rhamdi.patternfactory.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proxiad.rhamdi.patternfactory.entities.Animal;

@Repository
public interface AnimalRepo extends JpaRepository<Animal, Long > {
}
