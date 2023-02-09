package IST242.inclass;

public class Goldfish extends Pet {

    public Goldfish(String name, int age) throws IllegalArgumentException {
        super(name, age);
    }

    @Override
    public Response doTrick(Command command) {
        if (command == Command.JUMP_THROUGH_FIRE_HOOLAHOOP) {
            return Response.JUMPS_THROUGH_FIREY_HOOP;
        } else {
            return Response.DOES_NOTHING;
        }
    }
}
