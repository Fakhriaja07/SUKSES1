package com.example.sukses1.ui.beranda;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BerandaViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BerandaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Beranda");
    }

    public LiveData<String> getText() {
        return mText;
    }
}