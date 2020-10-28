import java.util.Objects;


public class Vote {
    private Person person;
    private String date;

    public Vote(Person p, String d){
        person = p;
        date = d;
    }

    public Person getPerson() {
        return person;
    }

    public String getDate() {
        return date;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(person, vote.person) &&
                Objects.equals(date, vote.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, date);
    }
}

