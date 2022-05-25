import java.util.HashMap;
import java.util.Map;

public class RecordKeeper {
    private Map<Integer, KDARecord> KDAMap;
    private int totalKills;
    private int totalDeaths;
    private int totalAssists;

    public RecordKeeper() {
        KDAMap = new HashMap<>();
        totalKills = 0;
        totalDeaths = 0;
        totalAssists = 0;
    }

    public void addGame(int gameNumber, int kills, int deaths, int assists) {
        if(!KDAMap.containsKey(gameNumber)) {
            KDAMap.put(gameNumber, new KDARecord(gameNumber, kills, deaths, assists));
            totalKills += kills;
            totalDeaths += deaths;
            totalAssists += assists;
        } else {
            System.out.println("Records already contain game #" + gameNumber);
        }
    }

    public String getRecord(int gameNumber) {
        if(KDAMap.containsKey(gameNumber)) {
            return KDAMap.get(gameNumber).toString();
        } else {
            System.out.println("No record found");
            return null;
        }
    }

    public String toString() {
        return String.format("Your overall record is %d kills, %d deaths, and %d assists.", totalKills, totalDeaths, totalAssists);
    }
}
