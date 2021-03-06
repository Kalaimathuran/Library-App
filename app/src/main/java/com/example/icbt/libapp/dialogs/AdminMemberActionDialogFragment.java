package com.example.icbt.libapp.dialogs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.icbt.libapp.Activities.CreateUserActivity;
import com.example.icbt.libapp.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class AdminMemberActionDialogFragment extends BottomSheetDialogFragment {


    @OnClick(R.id.btCreateUser)
    public void startCreateUserActivity(){
        Intent intent = new Intent(getActivity(), CreateUserActivity.class);
        startActivity(intent);
    }




    public AdminMemberActionDialogFragment(){

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_bottomsheet,container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this,view);
    }
}
