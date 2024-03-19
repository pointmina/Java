package chap_03;

public class _01_String {
    public static void main(String[] args) {

        String s = "I like Java and Python and C.";
        System.out.println(s);

        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java")); //처음에 일치하는 위치 정보
        System.out.println(s.lastIndexOf("and")); //마지막에 일치하는 위치 정보
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true 아니면 false
    }
}
