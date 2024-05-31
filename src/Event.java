public class Event {

    private String eventId;
    private  String evenName;
    private String eventDescription;
    private int participationfees;

    public int getParticipationfees() {
        return participationfees;
    }

    @Override
    public String toString() {
        return "Event{" +
                "evenName='" + evenName + '\'' +
                ", eventId='" + eventId + '\'' +
                ", eventDescription='" + eventDescription + '\'' +
                ", participationfees=" + participationfees +
                '}';
    }

    public void setParticipationfees(int participationfees) {
        this.participationfees = participationfees;
    }

    public Event(String evenName, String eventDescription, String eventId) {
        this.evenName = evenName;
        this.eventDescription = eventDescription;
        this.eventId = eventId;
    }

    public void setEvenName(String evenName) {
        this.evenName = evenName;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEvenName() {
        return evenName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public String getEventId() {
        return eventId;
    }

}
