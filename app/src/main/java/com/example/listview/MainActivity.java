package com.example.listview;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.view.View;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
public class MainActivity extends AppCompatActivity {
    TextView text;
    ListView list;
    String[] item={"Preeti Deswal  ","Abhishek Deswal","Payal Rawat","Kamana Malik","Aman Malik"};
    String[] subitem={"\n\t\t\t-Roll.No 154 \n\t\t\t-MCA 5th Sem \n\t\t\t-Leet Student"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView) findViewById(R.id.list1);
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this,
            android.R.layout.simple_list_item_1,item);
        list.setAdapter(adapter);
        text=(TextView) findViewById(R.id.text1);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String textn="position: "+position +"\nData:- "+item[position]+"\nSubData:- "+subitem[position];
                text.setText(textn);
            }
        });
    }
}