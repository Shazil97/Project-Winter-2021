public class Student {


    private String firstname;
    private String lastname;
    private int stdnumber;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setStdnumber(int stdnumber) {
        this.stdnumber = stdnumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getStdnumber() {
        return stdnumber;
    }

    public Student(String firstname, String lastname, int stdnumber){
          setFirstname(firstname);
          setLastname(lastname);
          setStdnumber(stdnumber);

}





}

