package tacos;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Taco {
    private Long id;
    private String name;
    private List<IngredientRef> ingredients;
    private Date createdAt = new Date();
}


