package com.varsitycollege.mycollectables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoriesScreen extends AppCompatActivity {

    private Button addCategoryBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories_screen);

        addCategoryBtn = (Button) findViewById(R.id.addCategoryFromCategoriesScreenBtn);
        addCategoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addCategory();
            }
        });
    }

    public void addCategory(){
        Intent intent = new Intent(this, AddNewCategory.class);
        startActivity(intent);
    }
}