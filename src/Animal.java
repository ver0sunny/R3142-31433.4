import java.util.Objects;

public class Animal {
    private String name;
    private PhysicalForm physic;
    private MovingTypes speed;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() { return this.name;}

    public void setForm(PhysicalForm form) { physic = form; }
    public void setMovingSpeed(MovingTypes speed) { this.speed = speed;}


    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object ex) {
        if (this == ex) return true;
        if (this.getClass() != ex.getClass() || ex == null) return false;
        Animal other = (Animal) ex;
        if (name == other.name) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Math.abs(Objects.hash(this.name));
    }


    public MovingTypes getSpeed() { return this.speed; }
    public void setSpeed(MovingTypes speed) { this.speed = speed; }
}

