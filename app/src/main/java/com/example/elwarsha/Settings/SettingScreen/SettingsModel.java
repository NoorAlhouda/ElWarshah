package com.example.elwarsha.Settings.SettingScreen;

public class SettingsModel {



    String SettText;
    int SettImage;
    String SettId;

    public SettingsModel(String settText, int settImage, String settId) {
        SettText = settText;
        SettImage = settImage;
        SettId = settId;
    }

    public String getSettText() {
        return SettText;
    }

    public int getSettImage() {
        return SettImage;
    }

    public String getSettId() {
        return SettId;
    }
}
