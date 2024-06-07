import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class ManageEvents {
    private List<Event> eventList;
    private DBConnection dbConnection;


    public boolean addEvent(String eventName, String eventDescription, String eventId) {
        Event event = new Event(eventName, eventDescription, eventId);

        String query = "INSERT INTO event (eventName, eventDescription, eventId) VALUES (?, ?, ?)";

        // creaete a connection object to save data in the database
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }

        try (Connection conn = dbConnection.getConnection()) {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, eventName);
            preparedStatement.setString(2, eventDescription);
            preparedStatement.setString(3, eventId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("data not saved", e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return true;
    }
//
//    public boolean removeEvent(String eventId) {
//        Boolean status = false;
//
//        Iterator<Event> it = eventList.listIterator();
//        while (it.hasNext()) {
//            // eventId = it.next().getEventId();
//            if (eventId.equals(it.next().getEventId())) {
//                it.remove();
//                status = true;
//
//            }
//        }
//        return status;
//    }

    public boolean removeEvent(String eventId) {
        Boolean status = false;

        // Retrieve events from the database
        boolean events = retrieveEventsFromDB(eventId);


//
//        // Iterate through the events and remove the one with the specified ID
//        for (Event event : events) {
//            if (eventId.equals(event.getEventId())) {
//
//                events.remove(event);
//                status = true;
//                break;
//            }
//        }

        return status;
    }

    // Method to retrieve events from the database
    private boolean retrieveEventsFromDB(String eventId) {
        String query = "SELECT * FROM event;";
        try (Connection conn = dbConnection.getConnection()) {
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();
            List<Event> events = new ArrayList<>();
            while (resultSet.next()) {
                Event event = new Event(resultSet.getString("eventName"), resultSet.getString("eventDescription"), resultSet.getString("eventId"));
               // events.add(event);
                if(eventId.equals(event.getEventId())){
                    String query1 = "Delete from event where eventId = "+ eventId;
                    PreparedStatement deletest= conn.prepareStatement(query1);
                    deletest.executeQuery();
                    return true;
                }
                System.out.println(event.getEventId());
            }


            //return events;
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving events from database", e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }


}
