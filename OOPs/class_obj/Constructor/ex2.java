
public class ex2 {

    private int day;
    private String month;
    private int year;

    public ex2(int d, String str, int yr) {
        day = d;
        month = str;
        year = yr;
    }

    public void showDate1() {
        System.out.println("Today : " + day + "/" + month + "/" + year);
    }

    public void showDate2() {
        System.out.println("My birthday : " + day + "/" + month + "/" + year);
    }

}
