package chap_03;

public class _03_Quiz {
    public static void main(String[] args) {

        String id = "000504-4194051";
        System.out.println(id.substring(0,8));
        System.out.println(id.substring(0,id.indexOf("-")+2));

    }
}
