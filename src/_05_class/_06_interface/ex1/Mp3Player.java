package _05_class._06_interface.ex1;

public class Mp3Player implements Music {
    private String song;

    public Mp3Player(String song) {
        this.song = song;
    }

    @Override
    public void play() {
        System.out.println("MP3 플레이어에서 " + song + "음악 재생");
    }

    @Override
    public void stop() {
        System.out.println("MP3 플레이어에서 " + song + "음악 정지");
    }
}
