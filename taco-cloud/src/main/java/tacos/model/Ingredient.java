package tacos.model;

import lombok.Data;

@Data
public class Ingredient {
	private final String id;
	private final String name;
	private final Type type; 
	
	public enum Type{
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}
	
	public Ingredient(String id, String name, Type type) {
        if (id == null || name == null || type == null) {
            throw new IllegalArgumentException("id, name, and type must not be null");
        }
        this.id = id;
        this.name = name;
        this.type = type;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    // toString method
    @Override
    public String toString() {
        return "Ingredient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ingredient that = (Ingredient) o;

        if (!id.equals(that.id)) return false;
        if (!name.equals(that.name)) return false;
        return type == that.type;
    }

    // hashCode method
    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }
}

 
