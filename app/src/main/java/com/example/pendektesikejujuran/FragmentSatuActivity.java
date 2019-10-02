package com.example.pendektesikejujuran;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentSatuActivity extends Fragment {

    View adhan;
    EditText edtText1;
    TextView txtView1;
    Button btn1;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        adhan = inflater.inflate(R.layout.activity_fragment_satu, container,false);
        edtText1 = adhan.findViewById(R.id.editText1);
        txtView1 = adhan.findViewById(R.id.textView1);
        btn1 = adhan.findViewById(R.id.button1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = edtText1.getText().toString();
                input = input.toLowerCase();
                String[] arrayInput = input.split(" ");
                String hasil = "";
                for (int i = arrayInput.length-1; i > 0; i--){
                    System.out.println(arrayInput[i]);
                    if (arrayInput[i].equals("bohong")){
                        arrayInput[i-1] = malek(arrayInput[i-1]);
                    }
                    hasil = arrayInput[0];
                }
                txtView1.setText(hasil);
            }
        });

        return adhan;
    }

    public String malek(String inputan){
        String result = "";

        if (inputan.equals("bohong")){
            result = "jujur";
        }
        else {
            result = "bohong";
        }

        return result;
    }

}
