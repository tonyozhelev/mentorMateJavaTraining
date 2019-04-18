package modelsHomework6;

import modelsHomework6.Contracts.Media;

import java.util.Map;

public class VideoGame extends Media {
    private String supportedOS;
    private boolean isMultiplayer;

    public VideoGame(Map<String, String> args) {
        super(args);
        setSupportedOS(args.get("OS"));
        setMultiplayer(args.get("Multiplayer"));
    }

    public String getSupportedOS() {
        return supportedOS;
    }

    private void setSupportedOS(String supportedOS) {
        this.supportedOS = supportedOS;
    }

    public boolean isMultiplayer() {
        return isMultiplayer;
    }

    private void setMultiplayer(String multiplayer) {
        if (multiplayer.toLowerCase().equals("yes")){
            this.isMultiplayer = true;
        }
    }
}
