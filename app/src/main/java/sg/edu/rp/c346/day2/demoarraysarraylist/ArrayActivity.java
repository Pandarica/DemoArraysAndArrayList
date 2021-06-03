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
        ArrayList<String> a1 = new ArrayList<String>();

        a1.add("Quick");
        a1.add("Brown");
        a1.add("Fox");

        //delete
        a1.remove("Fox");

        //update
        a1.set(1, "Silver");

        //add
        a1.add("Happy ending");

        System.out.println("Size is : " + a1.size());

        String msg = "";
        for(int i = 0; i < a1.size(); i++) {
            msg += a1.get(i) + "\n";
        }

        System.out.println(msg);
        tv.setText(msg);


        //OR

        //String [] array = new String [3];

        //array[0] = "Quick";
        //array[1] = "Brown";
        //array[2] = "Fox";

        //delete
        //array[1] = null;

        //update
        //array[2] = "durian";

        //add
        //array[1] = "mango";

        //System.out.println("Size is : " + array.length);

        //String msg = "";
        //for (int i = 0; i < array.length; i ++){
            //msg += array[i] + "\n";
        //}

        //System.out.println(msg);
        //tv.setText(msg);
    }
}