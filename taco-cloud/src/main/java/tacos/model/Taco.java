package tacos.model;

import java.util.List;
import java.util.Objects;
import lombok.Data;

@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;

    // Constructor
    public Taco(String name, List<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public Taco() {
		// TODO Auto-generated constructor stub
	}

	// Getters
    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    // toString method
    @Override
    public String toString() {
        return "Taco{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taco taco = (Taco) o;
        return Objects.equals(name, taco.name) &&
                Objects.equals(ingredients, taco.ingredients);
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, ingredients);
    }
}
