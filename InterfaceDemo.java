interface Camera {
    void takePhoto();

}
interface MusicPlayer {
    void playMusic();

}

class Smartphone implements Camera, MusicPlayer {
    public void takePhoto() {
        System.out.println("Taking a photo");
    }

    public void playMusic() {
        System.out.println("Playing Music");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Camera c = new Smartphone();
        MusicPlayer m = new Smartphone();

        c.takePhoto();
        m.playMusic();
    }
}
