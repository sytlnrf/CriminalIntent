package com.sytlnrf.shengyitao.criminalitent.crimeFragmentActivity;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.sytlnrf.shengyitao.criminalitent.R;
import com.sytlnrf.shengyitao.criminalitent.crimefragment.CrimeFragment;
import com.sytlnrf.shengyitao.criminalitent.crimefragment.CrimeListFragment;

public class CrimeListActivity extends SingleFragmentActivity implements CrimeListFragment.OnFragmentInteractionListener{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_crime_list);
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_crime_list, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }


    @Override
    public void onFragmentInteraction(String id) {

    }
}
