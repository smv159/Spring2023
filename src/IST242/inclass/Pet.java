package IST242.inclass;

public abstract class Pet {

    //Enums for Command and Response
    enum Command {SIT, FETCH, JUMP_THROUGH_FIRE_HOOLAHOOP}

    enum Response {
        SITS,
        FETCHES,
        DOES_NOTHING,
        JUMPS_THROUGH_FIREY_HOOP
    }

    private String name;
    private int age;


    public Pet(String name, int age) throws IllegalArgumentException {
        this.name = name;
        if (age <= 0) {
            throw new IllegalArgumentException(
                    "age must be positive (and nonzero)");
        }
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    abstract public Response doTrick(Command command);

    @Override
    public String toString() {
        return "pet " + getClass().getSimpleName().toLowerCase() +
        ": " + name + ", age: " + age;
    }
}
