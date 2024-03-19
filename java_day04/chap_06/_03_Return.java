package chap_06;

public class _03_Return {

    public static String getPhoneNumber() {
        String phoneNumber = "010-1234-5678";
        return phoneNumber;
    }

    public static String getAdress() {
        return "서울시 어딘가";
    }

    public static String getActivities() {
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        String contactNumber = getPhoneNumber();
        System.out.println(contactNumber);

        String adress = getAdress();
        System.out.println(adress);

        System.out.println(getActivities());
    }
}
