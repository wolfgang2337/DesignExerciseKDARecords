public class KDARecord {
    private int gameNumber;
    private int kills;
    private int deaths;
    private int assists;

    public KDARecord(int gameNumber, int kills, int deaths, int assists) {
        this.gameNumber = gameNumber;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
    }

    public String toString() {
        return String.format("In game #%d, you got %d kills, died %d times, and assisted a teammate's kill %d times"
                , gameNumber, kills, deaths, assists);
    }
}
