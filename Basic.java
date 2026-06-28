import java.util.ArrayList;
import java.util.List;

public class Basic {
    public static void main(String[] args) {
        String bandName = "BRING ME THE HORIZON";
        int liveCount = 35;
        boolean active = true;
        
        System.out.println(bandName);
        System.out.println(liveCount);
        System.out.println(active);

        String band = "Linkin Park";
        
        boolean activeBand = true;

        String name = "ONE OK ROCK";
        int member = 4;
        System.out.println(name);
        System.out.println(member);

        if(band.equals("ONE OK ROCK")) {
            System.out.println("日本のロックバンドです");
        } else if(band.equals("Linkin Park")) {
            System.out.println("アメリカのロックバンドです");
        } else {
            System.out.println("イギリスのロックバンドです");
        }

        String country = "日本";
        int memberCount = 4;

        if(country.equals("日本") && memberCount >= 4) {
            System.out.println("日本の4ピースロックバンドです");
        }

        if(bandName.equals("BRING ME THE HORIZON")|| bandName.equals("The Beatles")) {
            System.out.println("イギリスのロックバンドです");
        }

        boolean actives = true;

        if(!actives) {
            System.out.println("活動休止しています");
        }

        String keyword = "";
        if(keyword.isEmpty()) {
            System.out.println("入力してください");
        }

        if(name == null || name.isEmpty()) {
            System.out.println("必須項目です");
        } 
        
        if(country.equals("日本")) {
            System.out.println("国内バンド");
        } else {
            System.out.println("海外バンド");
        }
        memberCount = 5;
        active = true;

        if(memberCount >= 4 && active) {
            System.out.println("活動中の大型バンド");
        }
        band = "ONE OK ROCK";

        if(band.equals("ONE OK ROCK") || band.equals("Nirvana")) {
            System.out.println("有名ロックバンド");
        }

        String[] bands = {
                    "ワンオク",
                    "Nirvana",
                    "Green Day",
                    "Linkin Park"
        };
        for(int i = 0; i < bands.length; i++ ) {
            System.out.println(bands[i]);
        }

        for(String bandsName : bands) {
            System.out.println(bandsName);
        }
        //List
        List<String> teams = new ArrayList<>();
        teams.add("チェルシー");
        teams.add("リヴァプール");
        teams.add("ドルトムント");

        System.out.println(teams.get(1));

        System.out.println(teams.size());

        teams.remove(1);

        for(String team : teams) {
            System.out.println(team);
        }

    }
}
