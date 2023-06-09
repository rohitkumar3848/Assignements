import java.util.*;
class topKFrequentWords {
    public static List<String> topKFrequent(String[] words, int k) {
        List<String> l1=new ArrayList<>();
        Queue<Map.Entry<String,Integer>> q1=new PriorityQueue<>((a,b)->(a.getValue()==b.getValue()
                                                                           ?(a.getKey().compareToIgnoreCase(b.getKey()))
                                                                           :b.getValue()-a.getValue()));
        Map<String,Integer> h1=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            Integer r=h1.get(word);
            if(r==null){
                h1.put(word,1);
            }
            else{
                h1.put(word,r+1);
            }
        }
        for(Map.Entry<String,Integer> e1:h1.entrySet()){
                q1.add(e1);
        }
        while(k>0){
            l1.add(q1.poll().getKey());
            k--;
        }
        return l1;
    }
    public static void main(String[] args) {
        String words[] = {"i","love","leetcode","i","love","coding"};
         int k = 2;
         System.out.println(topKFrequent(words,k));
    }
}