import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    private String question;
    private int type;
    private ArrayList<Person> voters;
    private HashMap<String , HashSet<Vote>> polls;

    public Voting(int t ,String q){
        question = q;
        type = t;
        voters = new ArrayList<>();
        polls = new HashMap<>();
    }

    public void creatChoice(String c){
        if(polls.isEmpty()){
            polls.put(c , new HashSet<Vote>());
        }
            else{
                if(polls.containsKey(c))
                    System.out.println("tekrari");
                else{

                polls.put(c,new HashSet<Vote>());
                }
            }
    }

    public int getType() {
        return type;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<Person> getVoters() {
        return voters;
    }

    public HashMap<String, HashSet<Vote>> getPolls() {
        return polls;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setVoters(ArrayList<Person> voters) {
        this.voters = voters;
    }

    public void setPolls(HashMap<String, HashSet<Vote>> polls) {
        this.polls = polls;
    }

    public boolean vote(int ya, Person p , String s ){
        boolean output = false ;
        if(ya == 0){

        int i = 0 ;
        boolean a = polls.containsKey(s);
        if(a){
            i++;
            JalaliCalendar d = new JalaliCalendar(1399,8,07);
            String date =  d.toString();
            Vote v = new Vote(p,date);
             HashSet<Vote> vv = new HashSet<>();
                     vv.add(v);
            polls.replace(s,vv);
           output = true;
        }
        if(i!=0) {
            if (voters.isEmpty()) {
                voters.add(p);
            } else {
                if (voters.contains(p)) {
                    System.out.println("Already exist");
                    output = false;
                } else
                    voters.add(p);
            }
        }
        }
        if(ya== 1){
            int i = 0 ;
            boolean a = polls.containsKey(s);
            if(a){
                i++;
                JalaliCalendar d = new JalaliCalendar(1399,8,07);
                String date =  d.toString();
                Vote v = new Vote(p,date);
                HashSet<Vote> vv = new HashSet<>();
                vv.add(v);
                polls.replace(s,vv);
                output = true;
            }
            if(i!=0) {
                    voters.add(p);


            }}

    return  output;}


    public void printResult(){
        polls.entrySet().forEach(stringHashSetEntry -> System.out.println(stringHashSetEntry.getKey()+ "" + stringHashSetEntry.getValue()));
    }
}
