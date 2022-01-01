public class stringTimes{

    public static void main(String[] args) {
        run("hi",2);
    }
    static void run(String str,int num){
    
        String ans = " ";
    for (int i = 0; i < num; i++) {
        ans = str + ans;
    }
    
    System.out.println(ans);
    
    }
    
    }