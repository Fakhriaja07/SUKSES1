package com.example.sukses1.ui.setoran;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SetoranViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SetoranViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}