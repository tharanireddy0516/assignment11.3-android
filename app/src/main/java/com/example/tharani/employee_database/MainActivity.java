package com.example.tharani.employee_database;
/*import is libraries imported for writing the code
* AppCompatActivity is base class for activities
* Bundle handles the orientation of the activity
*/
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/*onCreate is the first method in the life cycle of an activity
   * savedInstance passes data to super class,data is pull to store state of application
   * setContentView is used to set layout for the activity
   *  R is a resource and it is auto generate file
   * activity_main assign an integer value

   */
public class MainActivity extends AppCompatActivity {
    //Declaring variables
    TextView name,age;
    ImageView imageView;
    private Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database=new Database(this); // Creating database object


        /*
        BitmapFactory creates Bitmap objects from various sources, including files, streams,
        and byte-arrays.
         */
        //Creating and Initializing object of Employee class
        /*A Drawable resource is a general concept for a graphic which can be drawn. The simplest was is bitmap
         * can be represented in Android via a BitmapDrawable class. */
        Employee employee=new Employee("Abdul kalam",83,(BitmapFactory.decodeResource(getResources()
                ,R.drawable.apj)));
        //image was stored i =n drawable folder and converting to bitmap format using Bitmap factory

        //Calling open method() to open the data base
        database.open();
        // Calling employee_Details() method of Employee class
        database.employee_Details(employee);
        Employee emp=database.getEmployee_Details(); // Creating object

        //Initializing variables by ID
        name= findViewById(R.id.name);
        name.setText(emp.getEmployeeName());
        age= findViewById(R.id.age);
        age.setText(String.valueOf(emp.getEmployeeAge()));
        imageView= findViewById(R.id.imageView);

        // setImageBitmap Sets a Bitmap as the content of this ImageView.
        imageView.setImageBitmap(emp.imageInByte);
    }
}
