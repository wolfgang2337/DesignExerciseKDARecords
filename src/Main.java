public class Main {
    public static void main(String[] args) {
        RecordKeeper rk = new RecordKeeper();
        rk.addGame(1, 1, 3, 2);
        rk.addGame(4, 2, 3, 5);
        rk.addGame(2, 5, 1, 8);
        System.out.println(rk.toString());
        rk.addGame(2, 1,1,1);
        System.out.println(rk.toString());
        System.out.println(rk.getRecord(1));
        System.out.println(rk.getRecord(50000));
    }
}
