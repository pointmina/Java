package chap_06;

public class _Quiz_06 {
//, String id, String phone
    public static String getHiddenData(String a, int b){
       String result =  a.substring(0,b);
        for (int i = b; i < a.length(); i++) {
            result += "*";
        }
        return result;
    }

    public static void main(String[] args) {
        String name = "김민아"; //length = 3 b 1
        String id = "123456-654321";
        String phone = "010-1234-5678";

        System.out.println(getHiddenData(name, 1));
    }
}
