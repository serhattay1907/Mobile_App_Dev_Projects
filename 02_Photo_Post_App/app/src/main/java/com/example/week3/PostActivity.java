package com.example.week3;

<<<<<<< HEAD
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
=======
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
>>>>>>> 1b26614bc5f5ef4ce05cd2a83dae07f638c64b44
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PostActivity extends AppCompatActivity {
<<<<<<< HEAD
    static final int CAPTURE_IMAGE = 0;
    ImageView img;
    EditText txtMesage;

    ImageButton btnOk;

    ImageButton btnCancel;

=======
>>>>>>> 1b26614bc5f5ef4ce05cd2a83dae07f638c64b44

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_post);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
<<<<<<< HEAD

        txtMesage = findViewById(R.id.txtMessage);
        img = findViewById(R.id.imgView);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, CAPTURE_IMAGE);
            }

        });

        btnOk = findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putCharSequence("msg", txtMesage.getText());
                bundle.putParcelable("bitmap",((BitmapDrawable)img.getDrawable()).getBitmap());
                intent.putExtras(bundle);
                setResult(PostActivity.RESULT_OK, intent);
                finish();
            }
        });


        btnCancel = findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(PostActivity.RESULT_CANCELED);
                finish();
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode,
                                    int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CAPTURE_IMAGE && resultCode == PostActivity.RESULT_OK) {
            Bundle bundle = data.getExtras();
            Bitmap bitmap = (Bitmap) bundle.get("data");
            img.setImageBitmap(bitmap);
        }
=======
>>>>>>> 1b26614bc5f5ef4ce05cd2a83dae07f638c64b44
    }
}