import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingsystem = new VotingSystem();
        Person voter = new Person("yeganeh","moghadam");
        ArrayList options = new ArrayList();
        ArrayList days = new ArrayList();
        options.add("yes");
        options.add("no");
        days.add("jome");
        days.add("5shnbe");
        days.add("3shnbe");
        votingsystem.creatVoting("Do u come?",0,options);
        votingsystem.creatVoting("che ruzi?",1,days);
        votingsystem.printVoting(0);
        ArrayList vote1 = new ArrayList();
        vote1.add("yes");
        ArrayList vote2 = new ArrayList();
        vote2.add("jome");
        vote2.add("3shnbe");
        votingsystem.vote(0,voter,vote1);
        votingsystem.vote(0,new Person("Voter","voter"),vote1);
        votingsystem.printVoting(1);
        votingsystem.vote(1,voter,vote2);
        votingsystem.vote(1,new Person("Voter","voter"),vote2);
        votingsystem.printResult();






    }
}
