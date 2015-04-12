package com.attendmare.linux.attendmare;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

import java.util.LinkedList;

import rx.subjects.BehaviorSubject;

/**
 * Created by linux on 13/4/15.
 */
public class GetCollegeNameAdapter extends BaseAdapter implements Filterable {
    Context context;
    BehaviorSubject<String> textChanged;
    LinkedList<College> resultList;
    GetCollegeNameAdapter(Context context,BehaviorSubject<String> textChanged){
        this.context = context;
        this.textChanged = textChanged;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public Filter getFilter() {
        return null;
    }
}
