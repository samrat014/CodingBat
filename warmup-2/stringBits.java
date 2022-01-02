public class stringBits {
    
    public static void main(String[] args) {
        run("hello");
    }
static void run(String str){

    String ans = "";
    for(int i = 0 ; i<str.length();i++){
      
      if(i % 2 == 0){
      ans = ans + str.substring(i,i+1);
      }
    }
    System.out.println(ans);
}
}

