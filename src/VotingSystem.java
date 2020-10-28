import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class VotingSystem {
    ArrayList <Voting > votingList;
    ArrayList<Integer> counters;
    HashMap<String, Integer> vvv = new HashMap<>();

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
        for(int z : counters ){
            z++;
            if(z==i){
                System.out.println(votingList.get(i).getQuestion());
                votingList.get(i).getPolls().keySet();
            }
        }
    }

    public void vote(int i, Person voter, ArrayList vote1) {
        Voting v = votingList.get(i);
        int j = v.getType();
        int z = 0;
        if (j == 0) {
            String s = vote1.get(0).toString();
            if (votingList.get(i).getPolls().containsKey(s)) {
                v.vote(voter, s);
                z++;

                vvv.put(s, z);
            }
        }
        if (j == 1) {
            int d = 0;
            for (d = 0; d <= j; d++) {
                String s = vote1.get(0).toString();
                if (votingList.get(i).getPolls().containsKey(s)) {
                    v.vote(voter, s);
                    z++;

                    vvv.put(s, z);
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
            for(String s : w){
                if(vvv.containsKey(s)){
                    int a =vvv.get(s);
                    System.out.println(a);
                }
            }
        }
    }
}
