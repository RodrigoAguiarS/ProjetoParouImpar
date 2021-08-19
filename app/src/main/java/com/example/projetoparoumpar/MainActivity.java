package com.example.projetoparoumpar;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements NumberFragment.OnParImparList {
    private ResultFragment resultFragment;
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        resultFragment = (ResultFragment)getSupportFragmentManager().findFragmentById(R.id.frag_result);
    }
    @Override
    public void onParImpar(int number) {
        resultFragment.result(number);
    }
}
