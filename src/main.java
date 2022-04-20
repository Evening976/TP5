import com.opencsv.bean.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {
        List<MatchResult> mResults = readDataFile("src/F1_2021_2022.csv");
        Championship chmp = new Championship("Ligue 1 2020/21, France");

        for (MatchResult result : mResults) {
            chmp.add(result.getHomeTeam());
            chmp.add(result.getVisitorTeam());
            chmp.add(result);
        }

        System.out.println(chmp);
    }


    public static List<MatchResult> readDataFile(String fileName)
            throws IOException
    {
        CsvToBean<MatchResult> csvToBean =
                new CsvToBeanBuilder(new FileReader(fileName))
                        .withSeparator(',')
                        .withType(MatchResult.class)
                        .build();
        return csvToBean.parse();
    }
}
