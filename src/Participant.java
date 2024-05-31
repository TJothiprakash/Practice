public class Participant {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String collegeName;
    private String email;
    private long mobileNo;

 /*   public Participant(){

    }*/

    @Override
    public String toString() {
        return "Participant{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getAge() {
        return age;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public Participant(int age, String collegeName, String email, String firstName, String gender, String lastName, long mobileNo) {
        this.age = age;
        this.collegeName = collegeName;
        this.email = email;
        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
    }

}
