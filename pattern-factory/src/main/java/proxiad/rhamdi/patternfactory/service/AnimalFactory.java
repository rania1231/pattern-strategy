package proxiad.rhamdi.patternfactory.service;

import proxiad.rhamdi.patternfactory.entities.Animal;


public interface AnimalFactory {
    Animal create(String origin, String type);
}
