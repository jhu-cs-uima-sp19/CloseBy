package com.example.closebyswipe;

import android.media.Image;
import android.provider.Settings;
import android.provider.Settings.Secure;

import java.io.Serializable;
import java.util.ArrayList;

public class Chat implements Serializable {
    private int messageSize;
    private String name;
    private String description;
    private ArrayList<User> members;
    private ArrayList<Message> messagelist;
    private double longitude;
    private double latitude;
    private String key;
    private double radius;
    private String imageName;
   // public long longitude;
    //public long latitude;

    public Chat() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Chat(String name, String description, double longitude, double latitude, String key, double radius, String imageName) {
        this.key = key;
        this.name =name;
        this.description = description;
        this.members = new ArrayList<User>();
        this.messagelist = new ArrayList<Message>();
        User me = new User(android.os.Build.SERIAL);
        members.add(me);
        this.longitude = longitude;
        this.latitude = latitude;
        this.radius = radius;
        this.imageName = imageName;
    }

    public void addUser(User user) {
        members.add(user);
    }
    public String getName() {
        return name;
    }
    public double getLongitude() {
        return longitude;
    }
    public double getLatitude() {
        return latitude;
    }
    public void setName(String newName) {
        name = newName;
    }

    public void setDescription(String newDesc){
        description = newDesc;
    }

    public void addMessage(Message newMsg) {
        messagelist.add(newMsg);
    }
    public ArrayList<Message> getMessageList() {
        return messagelist;
    }

    public String getDescription() {
        return description;
    }

    public String getKey() {
        return key;
    }
    public double getRadius() {return radius;}

    public String getImageName() {
        if(imageName == null) {
            return "0.png";
        }
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
