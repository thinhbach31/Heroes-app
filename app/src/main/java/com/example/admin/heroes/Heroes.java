package com.example.admin.heroes;

public class Heroes {
    private int mImage;
    private String mName;

    public Heroes(int mImage, String mName) {
        this.mImage = mImage;
        this.mName = mName;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
