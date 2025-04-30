package proxiad.rhamdi.patternfactory.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@Builder
@NoArgsConstructor
@ToString
public class AnimalDto {
    String origin;
    String type;
}
