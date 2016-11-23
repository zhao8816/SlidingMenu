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
		//获取slidingMenu
		SlidingMenu slidingMenu = getSlidingMenu();
		//设置左侧侧滑菜单
		setBehindContentView(R.layout.left_fragment);
		//设置滑动模式
		slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		slidingMenu.setMode(SlidingMenu.LEFT);
		//设置正文宽度
		slidingMenu.setBehindOffset(200);
		//初始化Fragment
		initFragment();
	}

	//初始化Fragment
	private void initFragment() {
		// TODO Auto-generated method stub
		FragmentManager supportFragmentManager = getSupportFragmentManager();
		FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
		//replace的意思是，新建一个fragment（new LeftFragment()），放到指定的布局上（R.id.left_fragment），
		//该布局提前已经设置过了，即，用作左侧侧滑菜单的布局。
		beginTransaction.replace(R.id.left_fragment, new LeftFragment()).commit();
	}
}
