package IST242;

public class Breed {
    String breedName;
    String origin;

    public Breed(String breedName, String origin) {
        this.breedName = breedName;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Breed{" +
                "breedName='" + breedName + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
