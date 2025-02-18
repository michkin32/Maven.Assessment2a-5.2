package rocks.zipcode.assessment2.objectorientation.animals;

import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal {
    Long animalId = null;
    Person animalOwner = new Person();

    public Animal() {
    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */
    public Animal(Long id, Person owner) {
        animalId = id;
        animalOwner = owner;
    }

    public Long getId() {
        return animalId;
    }

    public void setId(Long id) {
        animalId = id;
    }

    public Person getOwner() {
        return animalOwner;
    }

    public void setOwner(Person owner) {
        animalOwner = owner;
    }

    public Address getAddress() {
        return animalOwner.getAddress();
    }
}
