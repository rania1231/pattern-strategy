package proxiad.rhamdi.patternfactory.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Entity

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@ToString
public class Dog extends Animal {

}
