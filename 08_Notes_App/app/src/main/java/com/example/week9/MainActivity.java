package com.example.week9;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentTransaction;

import java.sql.Date;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    boolean displayingEditor = false;
    Note editingNote;
    ArrayList<Note> notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        notes = retrieveNotes();
        if (savedInstanceState != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.container, NoteFragment.newInstance(notes));
        }

    }

    private ArrayList<Note> retrieveNotes(){
    }

    @Override
    public void onNoteSelected(Note note) {
        this.note = note;
        displayingEditor = true;
    }

}