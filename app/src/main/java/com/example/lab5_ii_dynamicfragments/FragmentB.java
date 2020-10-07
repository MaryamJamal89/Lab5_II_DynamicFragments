package com.example.lab5_ii_dynamicfragments;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentB extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("tag","FragmentB onActivityCreated");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("tag","FragmentB onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("tag","FragmentB onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("tag","FragmentB onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("tag","FragmentB onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("tag","FragmentB onDetach");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_b, container, false);
    }
}