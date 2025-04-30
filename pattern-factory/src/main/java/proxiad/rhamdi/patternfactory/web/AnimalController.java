package proxiad.rhamdi.patternfactory.web;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proxiad.rhamdi.patternfactory.dto.AnimalDto;
import proxiad.rhamdi.patternfactory.entities.Animal;
import proxiad.rhamdi.patternfactory.service.AnimalFactory;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
@AllArgsConstructor
public class AnimalController {
    private AnimalFactory animalFactory;
    @PostMapping("/animal")
    public ResponseEntity<?> createAnimal(@RequestBody AnimalDto parameters ) {

      Animal animal=  this.animalFactory.create(parameters.getOrigin(), parameters.getType());
      return new ResponseEntity<>(animal, HttpStatus.CREATED);
    }
}
