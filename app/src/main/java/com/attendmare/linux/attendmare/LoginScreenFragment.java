package com.attendmare.linux.attendmare;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;

/**
 * Created by linux on 12/4/15.
 */
public class LoginScreenFragment extends Fragment implements LoginScreenView,AdapterView.OnItemClickListener{


    View view;
    private AutoCompleteTextView autoCompleteTextView;
    

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = super.onCreateView(inflater, container, savedInstanceState);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initializeViews(view);
    }


    public void initializeViews(View view){
        autoCompleteTextView = (AutoCompleteTextView) view.findViewById(R.id.auto_complete_text_view);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        autoCompleteTextView.setText("selected");
    }
}
