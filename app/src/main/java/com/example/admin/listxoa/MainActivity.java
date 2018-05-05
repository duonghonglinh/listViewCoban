package com.example.admin.listxoa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//
//    ListView list;
//    ArrayList<String> course;
//    Button btn1,btn2;
//    EditText edtMonHoc;


//
//    //khai bao vi tri click
//    int vitri = -1;


    ListView lvTraiCay;
    ArrayList<traicay> arrayTraiCay;
    traicayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//
//        list = findViewById(R.id.lv);
//        btn1 = findViewById(R.id.btn1);
//        btn2 = findViewById(R.id.btn2);
//        edtMonHoc = findViewById(R.id.edtMonHoc);
//
//
//        //khoi tao mag
//        course = new ArrayList<>();
//
//
//        course.add("hello");
//        course.add("hi");
//
//        //khoi tao arrayAdapter
//        final ArrayAdapter adapter = new ArrayAdapter(this,
//                android.R.layout.simple_list_item_1,
//                course);
//
//
//        list.setAdapter(adapter);
//
//
//        // btn them chuoi
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String monhoc = edtMonHoc.getText().toString();
//                course.add(monhoc);
//
//                //cap nhat giao dien adapter
//                adapter.notifyDataSetChanged();
//
//            }
//        });
//
//
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                edtMonHoc.setText(course.get(position));
//                vitri = position;
//
//            }
//        });
//
//
//        //btn cap nhat
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                //gan gia tri
//                course.set(vitri, edtMonHoc.getText().toString());
//
//                //cap nhat noi dung trong adapter
//                adapter.notifyDataSetChanged();
//
//            }
//        });
//
//
//        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//
//                course.remove(position);
//
//                //cap nhat noi dung trong adapter
//                adapter.notifyDataSetChanged();
//
//                return false;
//            }
//        });
//

        AnhXa();


        adapter = new traicayAdapter(this,R.layout.dong_trai_cay, arrayTraiCay);
        lvTraiCay.setAdapter(adapter);

    }


    public void AnhXa(){
        lvTraiCay = findViewById(R.id.lv);
        arrayTraiCay = new ArrayList<>();

        arrayTraiCay.add(new traicay("dau tay","dalat", R.drawable.hinh1));
        arrayTraiCay.add(new traicay("dau tuoi", "nui cao", R.drawable.hinh2));
        arrayTraiCay.add(new traicay("chuoi", "tren cao nguyen", R.drawable.hinh3));


    }
}
