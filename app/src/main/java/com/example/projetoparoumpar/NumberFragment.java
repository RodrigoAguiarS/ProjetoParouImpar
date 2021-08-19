package com.example.projetoparoumpar;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import org.jetbrains.annotations.NotNull;

public class NumberFragment extends Fragment implements View.OnClickListener{
    private EditText edtNumber;
    private Button btnResultado;
    private OnParImparList List;
    @Override
    public void onAttach(@NonNull @NotNull Context context) {
        super.onAttach(context);

        if(!(context instanceof OnParImparList)){
            throw new RuntimeException("Não é um OnParImparList");
        }
        List = (OnParImparList) context;
    }
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_number,container, false);
        edtNumber = view.findViewById(R.id.edt_number);
        btnResultado = view.findViewById(R.id.btnResultado);
        btnResultado.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view) {
        if(List != null ){
            int number = Integer.parseInt(edtNumber.getText().toString());
            List.onParImpar(number);
        }
    }
    public interface OnParImparList{
        void onParImpar(int number);
    }
}
