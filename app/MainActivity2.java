import static android.app.ProgressDialog.show;
import static android.content.Intent.getIntent;

import static java.sql.DriverManager.println;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homework4_5.R;

import java.io.File;
import java.util.ArrayList;

public class MainActivity2 {

    Button btn = new Button();

    public void onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState);
        Log.d("testMsg", "onCreate");
        setContentView(R.layout.activity_main2);

        ArrayList<File> filelist =
                (ArrayList<File>)getIntent().getSerializableExtra("FILES_LIST");

//        Intent name = new Intent().getStringExtra();
//        Intent phone = new Intent().getStringExtra();

        TextView textView = new TextView(R.id.textView).findViewById(R.id.textView);
        textView.getText() = "  Your name: $name  \n  Your phone: $phone";
    }

    public void onStart() {
        super.onStart();
        Log.d("testMsg", "onStart");
        btn = (R.id.button2);
        btn.setEnabled(true);
        Toast.makeText(this@MainActivity2, "You are into onStart function", Toast.LENGTH_LONG).show();
        btn.setOnClickListener() {
            onStop();
        }
    }

    public void onResume() {
        super.onResume();
        Log.d("testMsg", "onResume");
        println("You are into onResume function");
        Toast.makeText(this@MainActivity2, "You are into onResume function", Toast.LENGTH_LONG).show();
        btn.setOnClickListener {
            onPause();
        }
    }

    public void onPause() {
        super.onPause();
        Log.d("testMsg", "onPause");
        Toast.makeText(this@MainActivity2, "You are into onPause function", Toast.LENGTH_LONG).show();
        btn.setOnClickListener {
            onStart();
        }
    }

    public void onStop() {
        super.onStop();
        Log.d("testMsg", "onStop");
        Toast.makeText(this@MainActivity2, "You are into onStop function", Toast.LENGTH_LONG).show();
        btn.setOnClickListener {
            onResume();
        }
    }

    public void onRestart() {
        super.onRestart()
        Log.d("testMsg", "onRestart")
        Toast.makeText(this@MainActivity2, "You are into onRestart function", Toast.LENGTH_LONG).show();
        btn.setOnClickListener {
            onDestroy();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d("testMsg", "onDestroy");
        Toast.makeText(this@MainActivity2, "You are into onDestroy function", Toast.LENGTH_LONG).show();
    }

}
