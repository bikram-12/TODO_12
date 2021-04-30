package gcit.edu.todo_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void donut(View view) {
        Toast.makeText(this, "you have order donut!", Toast.LENGTH_SHORT).show();
    }

    public void icecream(View view) {
        Toast.makeText(this, "you have order Ice cream!", Toast.LENGTH_SHORT).show();

    }

    public void froyo(View view) {
        Toast.makeText(this, "you have order Froyo!", Toast.LENGTH_SHORT).show();

    }

    public void call(View view) {
        Uri uri = Uri.parse("tel: ");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }
}