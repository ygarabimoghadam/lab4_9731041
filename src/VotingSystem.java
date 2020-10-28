import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class VotingSystem {
   private ArrayList <Voting > votingList;
   private   ArrayList<Integer> counters;
   private HashMap<String, Integer> vvv = new HashMap<>();
   private int z  =0;
   private int m = 0 ;

    public VotingSystem(){

        votingList = new ArrayList<>();
        counters = new ArrayList<>();
    }

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    public void setVotingList(ArrayList<Voting> votingList) {
        this.votingList = votingList;
    }

    public void setVvv(HashMap<String, Integer> vvv) {
        this.vvv = vvv;
    }

    public void creatVoting(String q, int i, ArrayList options) {
        int j = 0;
        Voting v1 = new Voting(i,q);
        for(Object o : options){
            String s  = o.toString();
            v1.creatChoice(s);
            j++;
        }
        votingList.add(v1);
        counters.add(j);
    }

    public void printVoting(int i) {

                System.out.println(votingList.get(i).getQuestion());
               Set<Object>  sets = Collections.singleton(votingList.get(i).getPolls().keySet());
               for(Object o : sets ){
                   System.out.println(o);
               }
            }



    public void vote(int i, Person voter, ArrayList vote1) {
        Voting v = votingList.get(i);
        int j = v.getType();
        if (j == 0) {

            String s = vote1.get(0).toString();
            boolean w = v.getPolls().containsKey(s);
            if (w) {
                boolean o = v.vote(i,voter, s);
                if (o) {
                    z++;
                    vvv.put(s, z);


                }
            }
        }
        if (j == 1) {
            int xx = 0;
            int d = 0;
            for (d = 0; d <= j; d++) {
                String q = vote1.get(d).toString();
                boolean yy = v.getPolls().containsKey(q);
                if (yy) {
                    v.vote(i,voter, q);
                    xx++;
                    vvv.put(q,xx);
                }
            }
        }
    }

    public void printResult() {
        int y = 0;
        for(y = 0 ; y <votingList.size() ; y++){
           String ques= votingList.get(y).getQuestion();
            System.out.println(ques);
            Set<String> w =  votingList.get(y).getPolls().keySet();
           Set<String> aa = vvv.keySet();

           for(String s : w){
                boolean x = vvv.containsKey(s);
                if(x){
                    int a =vvv.get(s);
                    System.out.println(a);
                    }}
        }
}}
