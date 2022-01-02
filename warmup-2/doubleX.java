public class doubleX {
    public static void main(String[] args) {
    run("axxbb");
}

// incomplete

static void run(String str ){
String a = "false";
for (int i = 0; i < str.length()-1;i++) {
if( str.substring(i,i+2).equals("xx")){
a = "true";
break;
}
}
System.out.println(a);
}} 