package com.mra.imagechooserhtml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mra.imagechooserhtml.utils.RequestPermission;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void changeActivity(View view) {
        switch (view.getId()) {
            case R.id.btn_choose_file:
                if (RequestPermission.newInstance(this, new String[]{RequestPermission.STORAGE}).request())
                    startActivity(new Intent(getApplicationContext(), FileChooserActivity.class));
                break;

            case R.id.btn_record_voice:
                if (RequestPermission.newInstance(this, new String[]{RequestPermission.VOICE_RECORD}).request())
                    startActivity(new Intent(getApplicationContext(), VoiceRecorderActivity.class));
                break;
        }
    }

}