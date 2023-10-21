public class MyIphone {
        public static void main(String[] args) {
            
            DefaultMusicPlayer musicPlayer = new DefaultMusicPlayer();
            DefaultPhone phone = new DefaultPhone();
            DefaultInternetBrowser internetBrowser = new DefaultInternetBrowser();

            iPhone myPhone = new iPhone(musicPlayer, phone, internetBrowser);
            
            myPhone.playMusic();
            myPhone.makeCall();
            myPhone.browseInternet();
        }
    }
    

