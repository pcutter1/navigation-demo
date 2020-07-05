package edu.cnm.deepdive.navigationdemo;

import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import edu.cnm.deepdive.navigationdemo.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity implements SecondFragment.OnFragmentInteractionListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {


    }

  }

