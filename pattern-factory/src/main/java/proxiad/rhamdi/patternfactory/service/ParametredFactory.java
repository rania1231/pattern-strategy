package proxiad.rhamdi.patternfactory.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import proxiad.rhamdi.patternfactory.entities.Animal;
import proxiad.rhamdi.patternfactory.entities.Cat;
import proxiad.rhamdi.patternfactory.entities.Dog;
import proxiad.rhamdi.patternfactory.repo.AnimalRepo;

@Service
@Transactional
@AllArgsConstructor
public class ParametredFactory implements AnimalFactory {
    private AnimalRepo animalRepo;
    @Override
    public Animal create(String origin, String type) {

        if(type.equals("Dog")) {
          return this.animalRepo.save(
                  Dog.builder()
                          .origin(origin)
                          .type(type)
                          .build());
        }else if(type.equals("Cat")) {
            return this.animalRepo.save(
                    Cat.builder()
                            .origin(origin)
                            .type(type)
                            .build()
            );
        }else {
            throw new RuntimeException("Unsupported property type, we only support Dog and Cat");
        }
    }
}
