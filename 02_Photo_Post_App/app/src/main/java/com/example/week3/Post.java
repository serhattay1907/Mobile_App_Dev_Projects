package com.example.week3;
<<<<<<< HEAD
=======
import android.graphics.Bitmap;
>>>>>>> 1b26614bc5f5ef4ce05cd2a83dae07f638c64b44
import android.location.Location;


public class Post {
    private String message;
    private Location location;
    private int image;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

<<<<<<< HEAD
    public int getImage() {
=======
    public Bitmap getImage() {
>>>>>>> 1b26614bc5f5ef4ce05cd2a83dae07f638c64b44
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

