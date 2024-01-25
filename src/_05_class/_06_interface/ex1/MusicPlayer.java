package _05_class._06_interface.ex1;

public class MusicPlayer {
    public static void main(String[] args) {
        // MP3 플레이어 객체 생성 및 음악 재생
        Mp3Player mp3Player = new Mp3Player("아이유 블루밍");
        mp3Player.play();
        mp3Player.stop();

        // CD 플레이어
        CdPlayer cdPlayer = new CdPlayer("아이유 꽃갈피");
        cdPlayer.play();
        cdPlayer.stop();
    }
}
