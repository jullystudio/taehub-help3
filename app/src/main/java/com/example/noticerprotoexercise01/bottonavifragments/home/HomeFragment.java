package com.example.noticerprotoexercise01.bottonavifragments.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.noticerprotoexercise01.EditActivity;
import com.example.noticerprotoexercise01.R;

public class HomeFragment extends Fragment {

    Button Button_Edit;

    private HomeViewModel homeViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);
            }
        });

        Button_Edit = (Button)root.findViewById(R.id.button_edit);
        Button_Edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //Intent 사용시, Fragment에서는 this 사용을 할 수 없으므로 getActivity를 사용해야 한다.
                Intent intent = new Intent(getActivity(), EditActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }


}