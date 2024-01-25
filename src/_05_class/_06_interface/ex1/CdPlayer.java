package _05_class._06_interface.ex1;

public class CdPlayer implements Music {
    private String album;

    public CdPlayer(String album) {
        this.album = album;
    }

    @Override
    public void play() {
        System.out.println("CD 플레이어에서 " + album + "앨범 재생");
    }

    @Override
    public void stop() {
        System.out.println("CD 플레이어에서 " + album + "앨범 정지");
    }
}
