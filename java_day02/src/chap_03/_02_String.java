package chap_03;

public class _02_String {
    public static void main(String[] args) {

        String s = "I like Java and Python and C.";

        System.out.println(s.replace("and",","));
        System.out.println(s.substring(7)); //인덱스 기준 7부터 시작(이전 내용은 삭제)
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); //시작 위치부터 끝 위치 직전까지


        //공백제거

        s  = "                     I love Java.";

        System.out.println(s.trim());



        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2));

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); //위에랑 아래랑 다름 서로 다른 메모리 공간에 존재하는 데이터
        System.out.println(s2.equalsIgnoreCase("PYTHON")); //대소문자 상관없이 구분

        // \t = 텝 \n=줄바꿈 \\ =역슬래시
        System.out.println("단비가 \"냐옹\"이라고 했어요");

    }
}
