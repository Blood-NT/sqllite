package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONObject;

public class getdatalayout extends AppCompatActivity {

    @Override
    ArrayList<> datagit;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getdatalayout);
        getdata();
    }

    private void getdata() {

        getDATA task = new getDATA();
        String result;
        try {
            result = task.execute("https://laputakennel.com/wp-content/uploads/2023/nolan/img_truyen/all.json").get();
            JSONArray jsonArray = new JSONArray(result);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String idd = jsonObject.getString("id");
                String name = jsonObject.getString("name");
                String link = jsonObject.getString("link");
                String tacgia = jsonObject.getString("tacgia");
                mang_truyen.add(new truyennn(name, idd, link, tacgia));
            }

            truyen_adapter tmpadapter_truyen = new truyen_adapter(
                    show_truyen.this,
                    R.layout.truyen_item,
                    mang_truyen
            );
            show_truyen.setAdapter(tmpadapter_truyen);

        } catch (Exception e) {
            e.printStackTrace();

    }
}
}