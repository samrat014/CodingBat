import java.util.concurrent.ForkJoinPool;

public class countXX {
    
    public static void main(String[] args) {
        run("xxxxxx");
    }
static void run(String str){

    int count =0 ;

    for (int i = 0; i < str.length()-1; i++) {
             
            if( str.substring(i,i+2).equals("xx")){
                count++;

        }
    }
    System.out.println(count);
}

}

