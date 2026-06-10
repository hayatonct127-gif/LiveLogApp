public class JavaPractice {
    public static void main(String[] args) {
        int age = 39;
    
        //条件分岐
        if(age >= 18) {
            System.out.println("あなたは成人です。");
        } else {
            System.out.println("あなたは未成年です。");
        }

        //ループ
        for(int i = 0; i <5; i++) {
            System.out.println(i + "回目のループ");
        }

        int[] scores = {80, 90, 98};
        for(int score : scores) {
            System.out.println("得点: " + score);
        }

        int count = 50;
        while(count < 60) {
            System.out.println("カウント: " + count);
            count++;
        }

        String[] fruits = { "リンゴ", "バナナ", "オレンジ" };
        System.out.println(fruits[0]);
        System.out.println("果物の数：" + fruits.length);

        String artist = "BringMeTheHorizon";
        String keyword = "Bring";
        if(artist.contains(keyword)) {
            System.out.println("検索ヒット：" + artist + "が見つかりました。");
        } else {
            System.out.println("アーティストが見つかりません");
        }

        long targetId = 104;
        long currentId = 105;

        if(targetId != currentId) {
            System.out.println("このデータは削除対象ではありません。");
        }

        String band = "ONE OK ROCK";

        if(band.equals("ONE OK ROCK")) {
            System.out.println("日本のバンドです");
        } else {
            System.out.println("海外のロックバンドです");
        }

        String[] bands = {"MY FIRST STORY",
                            "Linkin Park",
                            "Green Day"
        };

        for(int i = 0; i < bands.length; i++) {
            System.out.println(bands[i]);
        }

        int count4 = 1;

        while(count4 <= 5) {
            System.out.println(count4);
            count4++;
        }

        String band1 = "Nirvana";

        switch(band1) {
            case "ONE OK ROCK":
                System.out.println("日本");
                break;
            case "Nirvana":
                System.out.println("アメリカ");
                break;
            
            default:
                System.out.println("不明");
        }

        for(String bands1 : bands) {
            if(bands1.equals("Nirvana")) {
                continue;
            }
            System.out.println(bands1);
        }

        
        
    }
}