import java.time.LocalDate;
import java.time.LocalTime;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;
import com.opencsv.bean.CsvDate;

public class MatchResult {

    @CsvBindByName(required=true, column = "Date", locale="fr-FR")
    @CsvDate("dd/MM/yyyy")
    private LocalDate date;

    @CsvBindByName(required=true, column = "Time", locale="fr-FR")
    @CsvDate("HH:mm")
    private LocalTime time;

    @CsvCustomBindByName(
            required=true,
            column = "HomeTeam",
            converter = TeamConverter.class
    )
    private Team homeTeam;

    @CsvCustomBindByName(
            required=true,
            column = "AwayTeam",
            converter=TeamConverter.class
    )
    private Team visitorTeam;

    @CsvBindByName(required=true, column = "FTHG")
    private int homeFullTimeGoals;

    @CsvBindByName(required=true, column = "FTAG")
    private int visitorFullTimeGoals;

    @CsvBindByName(required=true, column = "HTHG")
    private int halfTimeHomeGoals;

    @CsvBindByName(required=true, column = "HTAG")
    private int halfTimeVisitorGoals;


    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getVisitorTeam() {
        return visitorTeam;
    }

    public int getHomeFullTimeGoals() {
        return homeFullTimeGoals;
    }

    public int getVisitorFullTimeGoals() {
        return visitorFullTimeGoals;
    }

    public int getHalfTimeHomeGoals() {
        return halfTimeHomeGoals;
    }

    public int getHalfTimeVisitorGoals() {
        return halfTimeVisitorGoals;
    }

    public String toString(){
        return homeTeam.getName() + " " + homeFullTimeGoals + " -- " + visitorFullTimeGoals + " " + visitorTeam.getName();
    }
}
