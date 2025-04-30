package proxiad.rhamdi.patternfactory.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@AllArgsConstructor
@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String origin;
    protected  String type;
}
