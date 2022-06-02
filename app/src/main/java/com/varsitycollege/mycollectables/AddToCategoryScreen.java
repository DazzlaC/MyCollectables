package com.varsitycollege.mycollectables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AddToCategoryScreen extends AppCompatActivity {

    String itemName, itemDescription;
    Character itemRarity, selectCategory;

    EditText itemNameUserInput;
    EditText itemDescriptionUserInput;
    Spinner rarityUserInput;
    Spinner selectCategoryUserInput;

    Button addToSubmitButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_category_screen);

        itemNameUserInput = (EditText) findViewById(R.id.itemNameUserInput);
        itemDescriptionUserInput = (EditText) findViewById(R.id.itemDescriptionUserInput);

        rarityUserInput = (Spinner) findViewById(R.id.rarityUserInput);
        selectCategoryUserInput = (Spinner) findViewById(R.id.rarityUserInput);

        addToSubmitButton = (Button) findViewById(R.id.addToSubmitButton);
        addToSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                itemName = itemNameUserInput.getText().toString();
                itemDescription = itemDescriptionUserInput.getText().toString();

                //itemRarity = rarityUserInput.getSelectedItem().

            }
        });


    }
}
