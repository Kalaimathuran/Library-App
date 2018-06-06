package com.example.icbt.libapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.icbt.libapp.R;
import com.example.icbt.libapp.dialogs.AdminMemberActionDialogFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class AdminDashboardActivity extends AppCompatActivity {




    @OnClick(R.id.btAdmin)
    public  void adminMemberAction(){
       AdminMemberActionDialogFragment adminMemberActionDialogFragment = new AdminMemberActionDialogFragment();
       adminMemberActionDialogFragment.show(getSupportFragmentManager(),"dialogFragment");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);
        ButterKnife.bind(this);

    }


}
