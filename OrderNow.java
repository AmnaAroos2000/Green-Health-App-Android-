package com.amna.greenhealth;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class OrderNow extends AppCompatActivity {

    //declaring variables
    DatabaseHelper mydb;
    EditText editId, editName, editAddress, editFoodName, editFoodCount;
    Button btnAddData, btnViewAll, btnUpdateData, btnDeleteData;
    ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_now);
        mydb = new DatabaseHelper(this);

        editId = findViewById(R.id.deleteORupdate);
        editName = findViewById(R.id.name);
        editAddress = findViewById(R.id.address);
        editFoodName = findViewById(R.id.food);
        editFoodCount = findViewById(R.id.count);
        btnAddData = findViewById(R.id.submit);
        btnViewAll = findViewById(R.id.view);
        btnUpdateData = findViewById(R.id.update);
        btnDeleteData = findViewById(R.id.delete);
        backButton = findViewById(R.id.imageButton2);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderNow.this, Dashboard.class);
                startActivity(intent);
            }
        });

        //declaring methods
        addData();
        viewAll();
        updateData();
        deleteData();
    }

    //inserting data within database
    public void addData(){
        btnAddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = mydb.insertData(editName.getText().toString(), editAddress.getText().toString(), editFoodName.getText().toString(), editFoodCount.getText().toString());
                if(isInserted == true)
                    Toast.makeText(OrderNow.this,"Your Order Placed Successfully", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(OrderNow.this,"Your Order Not Placed, Please Try Again", Toast.LENGTH_LONG).show();

            }
        });
    }

    //retrieving data
    public  void viewAll(){
        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor results = mydb.getAllData();
                if (results.getCount()==0){
                    showMessage("Error Message : ", "No Data Available in the Database");
                    return;
                }

                StringBuffer buffer = new StringBuffer();
                while(results.moveToNext()){
                    buffer.append("ID : " + results.getString(0)+"\n");
                    buffer.append("Full Name : " + results.getString(1)+"\n");
                    buffer.append("Address : " + results.getString(2)+"\n");
                    buffer.append("Food Name : " + results.getString(3)+"\n");
                    buffer.append("Food Count : " + results.getString(4)+"\n\n");

                    showMessage("List of Data ", buffer.toString());
                }
            }
        });
    }

    //displaying message
    public void showMessage(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

    //updating data
    public void updateData(){
        btnUpdateData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isUpdata = mydb.updateData(editId.getText().toString(), editName.getText().toString(), editAddress.getText().toString(),
                        editFoodName.getText().toString(), editFoodCount.getText().toString());
                if(isUpdata == true)
                    Toast.makeText(OrderNow.this,"Your Order Updated Successfully", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(OrderNow.this,"Your Order Not Updated, Please Try Again", Toast.LENGTH_LONG).show();
            }

        });
    }

    //deleting data from database
    public void deleteData(){
        btnDeleteData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer deletedataraws = mydb.deleteData(editId.getText().toString());
                if(deletedataraws>0)
                    Toast.makeText(OrderNow.this,"Your Order Deleted Successfully", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(OrderNow.this,"Your Order Not Deleted, Please Try Again", Toast.LENGTH_LONG).show();
            }
        });
    }

}
