import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */
  //This function is Written by me
    public static List<Integer> dynamicArray(int n, List<List<Integer>> list) {
    // Write your code here
   List<List<Integer>> a=new ArrayList<>();
   for(int i=0;i<n;i++)
   a.add(new ArrayList<Integer>());
   
    int lastAnswer=0,idx=0;
    List<Integer> answer=new ArrayList<Integer>();
            for(int j=0;j<list.size();j++){

                int q=list.get(j).get(0);
                idx=((list.get(j).get(1)^lastAnswer)%n);
                if(q==1){
                    a.get(idx).add(list.get(j).get(list.get(j).size()-1));
                }else if(q==2){
                lastAnswer=a.get(idx).get(list.get(j).get(list.get(j).size()-1)%a.get(idx).size());
                    answer.add(lastAnswer);
                }
            }
            System.out.print(a);
            return answer;
       
         
    }

}

public class dynamic_array {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.dynamicArray(n, queries);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
