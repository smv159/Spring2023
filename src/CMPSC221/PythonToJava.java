package CMPSC221;

import java.util.ArrayList;

//class CMPSC221.PythonToJava:
public class PythonToJava {

    //#This is a comment
    /*
    '''multilines'''
     */

    //bankAccount = 10.0
    double bankAccount = 10.0;
    //age = 40
    int age = 40;
    //self.name = "Seth"
    String name = "Seth";
    //initial = "S"
    char initial = 'S';
    //isEmpty = True
    boolean isEmpty = true;

    //names = ["Seth", "steve", "Amy"]
    public ArrayList<String> names = new ArrayList<>();

    public PythonToJava() {
        isEmpty = false;
        name = "";

    }

    PythonToJava(double ba, String name, int age, char init){
        bankAccount = ba;
        this.name = name;
        this.age = age;
        initial = init;
        isEmpty = true;
        names = new ArrayList<>();

        for(int i = 0; i < 100; i+=5) {

        }

    }

    /*
    def onlyS(self):
        for i in self.names:
            if i[0] == "S":
                print(i)
     */
    public void onlyS() {
        //for (String i : names)
        for (String i : this.names){
            if (i.startsWith("S")) {
                System.out.println(i);
            }
        }
        System.out.println(initial);

    }

    double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static void test() {
        PythonToJava ptj = new PythonToJava();
        ptj.initial = 0;
    }

    public String toString() {
        return "bankAccount = " + this.bankAccount + ",\n" +
                "age = " + age + ",\n" +
                "name = " + this.name + ",\n" +
                "initial = " + this.initial + ",\n" +
                "isEmpty = " + (isEmpty ? "True" : "False") + ",\n";
    }



    }

