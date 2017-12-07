package com.example.user.android_assignment_8_1;
//Package objects contain version information about the implementation and specification of a Java package.
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    //public is a method and fields can be accessed by the members of any class.
    //class is a collections of objects.
    //created MainActivity and extends with AppCompatActivity which is Parent class.

    ListView listView;
    //Android ListView is a view which groups several items and display them in vertical scrollable list.
    ArrayAdapter adapter;
    //By default, ArrayAdapter creates a view for each array item by calling toString(),
    // on each item and placing the contents in a TextView.

    String[] arr = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    //storing the data in string 

    @Override
    //we use override to tells the compiler that the following method overrides a method of its superclass.
    protected void onCreate(Bundle savedInstanceState) {
        //protected can be accessed by within the package and class and subclasses
        //The Void class is an uninstantiable placeholder class to hold a reference to the Class object
        //representing the Java keyword void.
        //The savedInstanceState is a reference to a Bundle object that is passed into the onCreate method of every Android Activity
        // Activities have the ability, under special circumstances, to restore themselves to a previous state using the data stored in this bundle.
        super.onCreate(savedInstanceState);
        //Android class works in same.You are extending the Activity class which have onCreate(Bundle bundle) method in which meaningful code is written
        //So to execute that code in our defined activity. You have to use super.onCreate(bundle)
        setContentView(R.layout.activity_main);
        //R means Resource
        //layout means design
        //main is the xml you have created under res->layout->main.xml
        //Whenever you want to change your current Look of an Activity or when you move from one Activity to another .
        //he other Activity must have a design to show . So we call this method in onCreate and this is the second statement to set
        //the design

        listView = (ListView) findViewById(R.id.lv);
        //Android ListView is a view which groups several items and display them in vertical scrollable list.
        adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, arr);
        listView.setAdapter(adapter);
        //The list items are automatically inserted to the list using an,
        // Adapter that pulls content from a source such as an array or database.
    }

        public void Ascending (View view) {
        Arrays.sort(arr);

        adapter.notifyDataSetChanged();
        Toast.makeText(this, "Month in ascending order", Toast.LENGTH_LONG).show();
            //Ascending:it handles the ascending order by clicking this button
            //It shows a toast aslo
    }

    public void Descending(View view) {
        Arrays.sort(arr, Collections.<String>reverseOrder());
        //here will sort the given string array into reverse order using collections
        adapter.notifyDataSetChanged();
        Toast.makeText(this, "Month in descending order", Toast.LENGTH_LONG).show();
        //Descending:it handles the descending order by clicking this button
        //It shows a toast aslo
    }
}

