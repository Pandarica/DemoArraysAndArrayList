package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);

        tv = findViewById(R.id.textView1);

        //continue view the code in the worksheet
        String [] array = new String [3];

        array[0] = "Quick";
        array[1] = "Brown";
        array[2] = "Fox";

        //delete
        array[1] = null;

        //update
        array[2] = "durian";

        //add
        array[1] = "mango";

        System.out.println("Size is : " + array.length);

        String msg = "";
        for (int i = 0; i < array.length; i ++){
            msg += array[i] + "\n";
        }

        System.out.println(msg);
        tv.setText(msg);
    }
}