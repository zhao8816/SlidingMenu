package com.example.slinding_menu;

import com.example.slinding_menu.fragment.LeftFragment;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends SlidingFragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//��ȡslidingMenu
		SlidingMenu slidingMenu = getSlidingMenu();
		//�������໬�˵�
		setBehindContentView(R.layout.left_fragment);
		//���û���ģʽ
		slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		slidingMenu.setMode(SlidingMenu.LEFT);
		//�������Ŀ��
		slidingMenu.setBehindOffset(200);
		//��ʼ��Fragment
		initFragment();
	}

	//��ʼ��Fragment
	private void initFragment() {
		// TODO Auto-generated method stub
		FragmentManager supportFragmentManager = getSupportFragmentManager();
		FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
		//replace����˼�ǣ��½�һ��fragment��new LeftFragment()�����ŵ�ָ���Ĳ����ϣ�R.id.left_fragment����
		//�ò�����ǰ�Ѿ����ù��ˣ������������໬�˵��Ĳ��֡�
		beginTransaction.replace(R.id.left_fragment, new LeftFragment()).commit();
	}
}
