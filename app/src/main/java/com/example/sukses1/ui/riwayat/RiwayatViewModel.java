package com.example.sukses1.ui.riwayat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RiwayatViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public RiwayatViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}