package CMPSC221;

import java.util.ArrayList;

public class ContactInfo {

    public String name;
    public String phoneNumber;
    public String adr_street;
    public String adr_city;
    public String adr_state;
    public int adr_zip;

    public ContactInfo(String name, String phoneNumber,
                       String adr_street, String adr_city, String adr_state,
                       int adr_zip) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.adr_street = adr_street;
        this.adr_city = adr_city;
        this.adr_state = adr_state;
        this.adr_zip = adr_zip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdr_street() {
        return adr_street;
    }

    public void setAdr_street(String adr_street) {
        this.adr_street = adr_street;
    }

    public String getAdr_city() {
        return adr_city;
    }

    public void setAdr_city(String adr_city) {
        this.adr_city = adr_city;
    }

    public String getAdr_state() {
        return adr_state;
    }

    public void setAdr_state(String adr_state) {
        this.adr_state = adr_state;
    }

    public int getAdr_zip() {
        return adr_zip;
    }

    public void setAdr_zip(int adr_zip) {
        this.adr_zip = adr_zip;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adr_street='" + adr_street + '\'' +
                ", adr_city='" + adr_city + '\'' +
                ", adr_state='" + adr_state + '\'' +
                ", adr_zip=" + adr_zip +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<ContactInfo> contacts = new ArrayList<>();
        ContactInfo into = new ContactInfo("Seth", "12345678", "1st st", "citytown", "PA", 12345);
        contacts.add(into);
        contacts.add(new ContactInfo("Olive", "123456677", "1st st", "citytown", "PA", 12345));
        contacts.add(new ContactInfo("Scarlett", "123456677", "1st st", "citytown", "PA", 12345));
        contacts.add(new ContactInfo("Louise", "123456677", "1st st", "citytown", "PA", 12345));

        for(ContactInfo info : contacts) {
            System.out.println(info);
        }

        contacts.forEach(i -> System.out.println(i));
    }
}
