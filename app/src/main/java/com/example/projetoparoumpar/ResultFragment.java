package com.example.projetoparoumpar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import org.jetbrains.annotations.NotNull;

public class ResultFragment extends Fragment {
    private TextView txtResult;
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, container, false);
        txtResult = view.findViewById(R.id.txt_result);
        return view;
    }
    public void result(int number){
        if(number % 2 == 0){
            txtResult.setText(String.format("O Número %d é Par!",number));
        }
        else{
            txtResult.setText(String.format("O Número %d é Ímpar!",number));
        }
    }
}
