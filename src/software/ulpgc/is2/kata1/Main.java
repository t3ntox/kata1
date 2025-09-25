package software.ulpgc.is2.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Felipe", LocalDate.of(2000, 12, 12));
        System.out.println(person);
    }
}
