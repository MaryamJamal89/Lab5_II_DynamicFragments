package com.example.lab5_ii_dynamicfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ADDA(View v){
        FragmentA frag1=new FragmentA();
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.add(R.id.group,frag1,"A");
        ft.commit();
    }

    public void ADDB(View v){
        FragmentB frag2=new FragmentB();
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.add(R.id.group,frag2,"B");
        ft.commit();
    }

    public void removeA(View v){
        FragmentA frag1=(FragmentA)getSupportFragmentManager().findFragmentByTag("A");
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        if(frag1!=null){
            ft.remove(frag1);
            ft.commit();
        }else
        {
            Toast.makeText(this, "Fragment A was not added before", Toast.LENGTH_SHORT).show();
        }
    }

    public void removeB(View v){
        FragmentB frag1=(FragmentB)getSupportFragmentManager().findFragmentByTag("B");
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        if(frag1!=null){
            ft.remove(frag1);
            ft.commit();
        }else
        {
            Toast.makeText(this, "Fragment B was not added before", Toast.LENGTH_SHORT).show();
        }
    }

    public void replaceAwithB(View v){
        FragmentB f2=new FragmentB();
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.group,f2,"B");
        ft.commit();
    }

    public void replaceBwithA(View v){
        FragmentA f1=new FragmentA();
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.group,f1,"A");
        ft.commit();
    }

    public void AttachA(View v){
        FragmentA frag1=(FragmentA)getSupportFragmentManager().findFragmentByTag("A");
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        if(frag1!=null){
            ft.attach(frag1);
            ft.commit();
        }
    }

    public void detachA(View v){
        FragmentA frag1=(FragmentA)getSupportFragmentManager().findFragmentByTag("A");
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        if(frag1!=null){
            ft.detach(frag1);
            ft.commit();
        }
    }
}