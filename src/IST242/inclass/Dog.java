package IST242.inclass;

public class Dog extends Pet {

    boolean likesFetch;

    public Dog(String name, int age) throws IllegalArgumentException {
        this(name, age, false);
    }

    @Override
    public Response doTrick(Command command) {
        if (command == Command.SIT) {
            return Response.SITS;
        } else if (command == Command.FETCH && likesFetch) {
            return Response.FETCHES;
        } else {
            return Response.DOES_NOTHING;
        }
    }

    public boolean isLikesFetch() { return likesFetch; }

    public Dog(String name, int age, boolean likesFetch) throws IllegalArgumentException {
        super(name, age);
        this.likesFetch = likesFetch;
    }
}
