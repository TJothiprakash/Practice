import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ManageEvents {
    private List<Event> eventList;

    public boolean addEvent(String eventName, String EventDescription, String eventId) {
        Event event = new Event(eventName, EventDescription, eventId);
        eventList = new ArrayList<Event>();
        //System.out.println(eventList.add(event));
        return eventList.add(event) ? true : false;
    }

    public boolean removeEvent(String eventId) {
        Boolean status = false;
        Iterator<Event> it = eventList.listIterator();
        while (it.hasNext()) {
            // eventId = it.next().getEventId();
            if (eventId.equals(it.next().getEventId())) {
                it.remove();
                status = true;

            }
        }
        return status;
    }

}
