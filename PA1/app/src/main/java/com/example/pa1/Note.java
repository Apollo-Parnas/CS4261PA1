package com.example.pa1;

public class Note {
    public String title;
    public String content;

    public Note() {
        // Default constructor required for calls to DataSnapshot.getValue(Note.class)
    }

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
