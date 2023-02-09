package IST242;

public class Dog {
    private String name;
    Breed breed;
    public String birth;
    public String death;

    public Dog(String name, Breed bread, String birth) {
        this.name = name;
        breed = bread;
        this.birth = birth;
        death = "";
    }

    Dog() {
        name = "";
        breed = null;
        birth = "";
        death = "";
    }

    public void setName(String n) { name = n; }
    public String getName() { return name; }

    /**
     * Returns whether the dog is dead or alive
     * 
     * @return true if death is set
     */
    public boolean isDead() {
        return !death.isEmpty();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", birth='" + birth + '\'' +
                ", death='" + death + '\'' +
                '}';
    }
//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("Dog{");
//        sb.append("name='").append(name).append('\'');
//        sb.append(", breed=").append(breed);
//        sb.append(", birth='").append(birth).append('\'');
//        sb.append(", death='").append(death).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }
    /*
    Could use inner class but wouldnt

    private class Breeds {

    }

     */

    public void testReturn() {
        int x = 0;

        x = x + 1;
        x += 1;
        x++;



        if (breed == null) {
            return;
        } else {
            System.out.println("This dog has a breed");
        }

        System.out.println((breed == null ? "" : "This dog has a breed"));


    }

    public int testIntReturn() {

        return 0;
    }

    public int testIntReturn(int number) {
        switch(number) {
            case 5:
                System.out.println("its five");
                break;
            case 10:
                ;
            case 15:
                ;
            default:
                ;
        }
        if (number == 5) {
            System.out.println("its five");
        }
        if (number == 10) {
            ;
        }
        if (number == 15) {
            ;
        } else {

        }



        return number;
    }

}
