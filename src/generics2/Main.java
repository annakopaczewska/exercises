package generics2;

public class Main {
    public static void main(String[] args) {
       FootballPlayer joe = new FootballPlayer("Joe");
       BaseballPlayer pat = new BaseballPlayer("Pat");
       SoccerPlayer robert = new SoccerPlayer("Robert");

       Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
       adelaideCrows.addPlayer(joe);
//       adelaideCrows.addPlayer(pat);
//       adelaideCrows.addPlayer(robert);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<> ("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<> ("this won't work");
        brokenTeam.addPlayer(robert);

        Team<FootballPlayer> melbourne = new Team<> ("Melbourne");
       FootballPlayer banks = new FootballPlayer("Gordon");
       melbourne.addPlayer(banks);

       Team<FootballPlayer> hawthorn = new Team<>("Hawthron");
       Team<FootballPlayer> fremantle = new Team<>("Fremantle");

       hawthorn.matchResult(fremantle,1,0);
       hawthorn.matchResult(adelaideCrows,3,0);

       adelaideCrows.matchResult(fremantle,2,1);
    }
}
