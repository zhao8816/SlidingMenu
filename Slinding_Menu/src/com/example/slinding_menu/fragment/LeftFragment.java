package com.example.slinding_menu.fragment;

import com.example.slinding_menu.MainActivity;
import com.example.slinding_menu.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class LeftFragment extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = View.inflate(getActivity(), R.layout.left_activity, null);
		ListView listview = (ListView) view.findViewById(R.id.listview);
		//���listview��Ŀ����ת����ҳ��
		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				MainActivity activity = (MainActivity) getActivity();
				//toggle()��������˼�ǣ������ǰ�ǹأ��ǾͿ��������ǰ�ǿ����Ǿ͹ء�
				activity.getSlidingMenu().toggle();
			}
		});
		return view;
	}
}
