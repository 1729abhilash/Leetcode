import java.util.ArrayList;
import java.util.List;

public class adf {
    public static void main(String [] args) {
        List<String> permutation=new ArrayList<>();

   String s="a1b2";
        permutations(0,permutation,s,s.length(),"");
System.out.println(permutation);
    }


    static void permutations(int index, List<String> permutation, String question, int length, String answer){

        if(answer.length()==length){
            permutation.add(answer);
            return;
        }

        char c=question.charAt(index);

        if(!(c>=48&&c<=57)){
            for(int i=0;i<2;i++){
                if(i==0)
                    permutations(index+1,permutation,question,length,answer+c);
                else
                    permutations(index+1,permutation,question,length,answer+Character.toUpperCase(c));

            }
        }
        else
            permutations(index+1,permutation,question,length,answer+c);


    }



}



