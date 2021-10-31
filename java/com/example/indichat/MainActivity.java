package com.example.indichat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.indichat.Activity_Opmenu.archive;
import com.example.indichat.Activity_Opmenu.logout;
import com.example.indichat.Activity_Opmenu.new_group;
import com.example.indichat.Activity_Opmenu.setting;
import com.example.indichat.Activity_Opmenu.starred_msg;
import com.example.indichat.adapter.op_state_adapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tablayout;
    TabItem tab_camara,tab_chat,tab_status,tab_call;
    ViewPager2 viewpage;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemid;
        Intent temp=null;

        itemid =item.getItemId();
        if(itemid==R.id.menu_ng){
            temp=new Intent(MainActivity.this, new_group.class);
        }
        if(itemid==R.id.menu_archive){
            temp=new Intent(MainActivity.this, archive.class);
        }
        if(itemid==R.id.menu_starred){
            temp=new Intent(MainActivity.this, starred_msg.class);
        }
        if(itemid==R.id.menu_setting){
            temp=new Intent(MainActivity.this, setting.class);
        }
        if(itemid==R.id.menu_lg){
            temp=new Intent(MainActivity.this, logout.class);
        }
        startActivity(temp);
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        tablayout=findViewById(R.id.tablayout);
        tab_camara=findViewById(R.id.tab_camara);
        tab_chat=findViewById(R.id.tab_chat);
        tab_status=findViewById(R.id.tab_status);
        tab_call=findViewById(R.id.tab_call);
        viewpage=findViewById(R.id.viewpage);

        op_state_adapter adp=new op_state_adapter(getSupportFragmentManager(),getLifecycle());
        viewpage.setAdapter(adp);


        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpage.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }


        });
    viewpage.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
        @Override
        public void onPageSelected(int position) {
            tablayout.selectTab(tablayout.getTabAt(position));
            super.onPageSelected(position);


        }
    });
    }


}