interface MusicPlayer {
    void play();
    void pause();
    void stop();
}
interface Phone {
    void call();
    void answer();
    void hangUp();
}
interface InternetBrowser {
    void openURL();
    void closeURL();
    void navigate();
}

class iPhone {
    private MusicPlayer musicPlayer;
    private Phone phone;
    private InternetBrowser internetBrowser;

    public iPhone(MusicPlayer musicPlayer, Phone phone, InternetBrowser internetBrowser) {
        this.musicPlayer = musicPlayer;
        this.phone = phone;
        this.internetBrowser = internetBrowser;
    }

    public void playMusic() {
        musicPlayer.play();
    }

    public void makeCall() {
        phone.call();
    }

    public void browseInternet() {
        internetBrowser.navigate();
    }
}

class DefaultMusicPlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("o reprodutor de áudio esta tocando");
    }

    @Override
    public void pause() {
       System.out.println("o reprodutor de áudio esta pausado");
    }

    @Override
    public void stop() {
        System.out.println("o reprodutor de áudio esta parado");
    }
}

class DefaultPhone implements Phone {
    @Override
    public void call() {
        System.out.println("em chamada");
    }

    @Override
    public void answer() {
        // método  de atender chamada
    }

    @Override
    public void hangUp() {
        // método  de atender chamada
    }
}

class DefaultInternetBrowser implements InternetBrowser {
    @Override
    public void openURL() {
        System.out.println("abrindo navegador");
    }

    @Override
    public void closeURL() {
        // método para fechar a página do navegador
    }

    @Override
    public void navigate() {
        System.out.println("Navegando");
    }
}
