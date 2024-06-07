import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static ManageEvents manageEvents;

    public static void main(String[] args) {
        manageEvents = new ManageEvents();
       // System.out.println(manageEvents.addEvent("PPT", "Presentation", "TT01"));
        System.out.println(manageEvents.removeEvent("TT01"));

    }
}