package com.example.mobileproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class KwangSearchListAdapter extends BaseAdapter {
    private Context mContext;
    private List<KwangItem> mData = new ArrayList<>();


    public KwangSearchListAdapter(Context context) {
        this.mContext = context;
    }


    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int pos = position; //ListView 위치 기억 (첫 번째는 pos=0)
        Context context = parent.getContext();

        if (convertView == null) {
            //LayoutInflater 생성
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.kwang_item_search, parent, false);
        }
        //표시할 이미지 및 텍스트를 변수에 저장
        TextView title = (TextView) convertView.findViewById(R.id.tv1);
        TextView img = (TextView) convertView.findViewById(R.id.tv2);


        KwangItem listViewItem = mData.get(position);

        //아이템 내 각 위젯에 데이터 반영
        title.setText(listViewItem.getTitle());
        img.setText(listViewItem.getImg());

        //리스트뷰 위젯 클릭이벤트
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return convertView;
    }
    public void addItem(String title, String cont){
        KwangItem item = new KwangItem();

        item.setTitle(title);
        item.setImg(cont);

        mData.add(item);
    }
}