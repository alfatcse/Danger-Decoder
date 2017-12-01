package com.example.alfat.dangerdecoder;





        import android.os.Bundle;
        import android.app.Activity;
        import android.content.Intent;
        import android.view.Menu;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.Toast;
        import android.widget.AdapterView.OnItemClickListener;
        import android.os.*;
public class MainActivity extends Activity {
    String division[]={"Bagerhat","Bandarban","Barghuna","Barisal","Bhola","Bogra",
            "Bramanbaria","Chandpur","Chapainawabgonj","Chittagonj",
            "Chuadanga","Comilla","Coxs bazar","Dhaka","Dinajpur","Faridpur",
            "Feni","Gaibandha","Gazipur","Gopalgonj","Habigong","Jamalpur",
            "Jessore","Jhalokathi","Jinaydah","Joypurhat","khagrasori",
            "Khulna","Kishoregonj","Kurigram","Kushtia","Lalmonirhat",
            "Laxmipur","Madaripur","Magura","Manikgonj","Maymensing",
            "Meherpur","Moulibazar","Munshigonj","Naogaon","Narayangonj",
            "Narsingdi","Natore","Netrokona","Nilphamari","Noakhali","Norail",
            "Pabna","Panchagarh","Patuakhali","Pirojpur","Rajbari","Rajshahi",
            "Rangamati","Rangpur","Satkhira","Shariatpur","Sherpur","Sirajgonj",
            "Sunamgonj","Sylhet","Thakurgaon","Tangail"};
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView1);
        list.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, division));

        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {

                Intent i=new Intent(MainActivity.this, Information.class);
                i.putExtra("name", division[arg2]);
                startActivity(i);

            }
        });
    }

}
