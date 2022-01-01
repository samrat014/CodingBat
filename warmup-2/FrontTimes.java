public class FrontTimes {
    
    public static void main(String[] args) {
        run("Chocolate", 2);
    }
    static void run(String str , int num){

        String threewords = str.substring(0,3); 
        
        String sum = "";
        for (int i = 0; i < num; i++) {
        sum = sum + threewords;
        }
        System.out.println(sum);
    
    }

}
