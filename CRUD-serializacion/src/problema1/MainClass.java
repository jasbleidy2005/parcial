package problema1;

public class MainClass {
    public static void main(String[] args) {
        VideoGames games = VideoGames.SPORTS;
        System.out.println(games.getName()+ games.getHowtoplay()+ games.getYearofcreation());
        VideoGames games1 = VideoGames.STRATEGY;
        System.out.println(games1.getName()+ games1.getHowtoplay()+ games1.getYearofcreation());
        VideoGames games2 = VideoGames.MUSICALS;
        System.out.println(games2.getName()+ games2.getHowtoplay()+ games2.getYearofcreation());
        VideoGames games3= VideoGames.ADVENTURE;
        System.out.println(games3.getName()+ games3.getHowtoplay()+ games3.getYearofcreation());
        VideoGames games4 = VideoGames.SIMULATION;
        System.out.println(games4.getName()+ games4.getHowtoplay()+ games4.getYearofcreation());


    }
}
