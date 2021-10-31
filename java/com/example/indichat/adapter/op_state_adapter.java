package com.example.indichat.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.indichat.Fragments.call_fragment;
import com.example.indichat.Fragments.camera_fragment;
import com.example.indichat.Fragments.chat_fragment;
import com.example.indichat.Fragments.status_fragment;

public class op_state_adapter extends FragmentStateAdapter {
    private Context context;

    public op_state_adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new camera_fragment();
            case 1:
                return new chat_fragment();
            case 2:
                return new status_fragment();
            case 3:
                return new call_fragment();
            default:
                return null;

        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
