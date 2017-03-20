package com.drapoguz.pushr.ui.main.personalrecords;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.drapoguz.pushr.R;
import com.drapoguz.pushr.ui.base.BaseActivity;
import com.drapoguz.pushr.ui.base.BaseFragment;

import javax.inject.Inject;

public class MainPersonalRecordsFragment extends BaseFragment
        implements MainPersonalRecordsContract.View {

    // Data
    @Inject
    MainPersonalRecordsPresenter mPresenter;


    // UI Elements
    private TextView mTxtIterationRecord;
    private TextView mTxtTrainingRecord;
    private TextView mTxtDayRecord;


    // Constructors
    public MainPersonalRecordsFragment() {

    }


    // Fragment Lifecycle
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRetainInstance(true);

        ((BaseActivity) getActivity()).getActivityComponent().inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.fragment_main_personal_records, container, false);

        registerViewElements(fragmentView);

        mPresenter.attachView(this);

        mPresenter.getData();

        return fragmentView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        mPresenter.detachView();

        unregisterViewElements();
    }


    // UI
    protected void registerViewElements(View rootView) {

        mTxtIterationRecord = (TextView) rootView.findViewById(R.id.txt_iteration_record);
        mTxtTrainingRecord = (TextView) rootView.findViewById(R.id.txt_training_record);
        mTxtDayRecord = (TextView) rootView.findViewById(R.id.txt_day_record);
    }

    protected void unregisterViewElements() {

        mTxtIterationRecord = null;
        mTxtTrainingRecord = null;
        mTxtDayRecord = null;
    }


    // MainPersonalRecordsContract.View
    public void setData() {

        mTxtIterationRecord.setText(Integer.toString(mPresenter.getIterationRecord()));

        mTxtTrainingRecord.setText(Integer.toString(mPresenter.getTrainingRecord()));

        mTxtDayRecord.setText(Integer.toString(mPresenter.getDayRecord()));
    }
}
