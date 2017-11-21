package com.example.yws.simplepin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * 自定义显示栏目
 */

public class SimplePinAdapter extends ArrayAdapter<SimplePin>{

    private int resourceId;
    public SimplePinAdapter(Context context, int textViewResourceId, List<SimplePin> movies){
        super(context,textViewResourceId,movies);
        resourceId = textViewResourceId;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        SimplePin simplePin = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView company = view.findViewById(R.id.company);
        TextView category = view.findViewById(R.id.category);
        TextView pingType = view.findViewById(R.id.pingType);
        TextView jobTitle = view.findViewById(R.id.jobTitle);
        TextView location = view.findViewById(R.id.location);
        TextView time = view.findViewById(R.id.time);
        TextView link = view.findViewById(R.id.link);
        TextView email = view.findViewById(R.id.email);
        TextView requireMents = view.findViewById(R.id.requireMents);



        company.setText("公司名称："+ simplePin.getCompany());
        category.setText("职位类别："+ simplePin.getCategory());
        pingType.setText("招聘类型："+ simplePin.getPingType());
        jobTitle.setText("岗位名称："+ simplePin.getJobTitle());
        location.setText("地点："+ simplePin.getLocation());
        time.setText("时间："+ simplePin.getTime());
        link.setText("链接："+ simplePin.getLink());
        email.setText("邮箱:"+ simplePin.getEmail());
        requireMents.setText("岗位要求："+simplePin.getRequireMents());
        //requireMents.setText("岗位要求："+simplePin.getRequireMents());
//        String s = " ";
//        for(int i = 0;i < simplePin.getRequireMents().length;i++){
//            s += simplePin.getRequireMents()[i];
//        }
//        requireMents.setText(s);
        return view;
    }
}
