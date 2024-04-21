package com.example.sukses1.ui.riwayat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.sukses1.databinding.FragmentRiwayatBinding;

public class RiwayatFragment extends Fragment {

    private FragmentRiwayatBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RiwayatViewModel riwayatViewModel =
                new ViewModelProvider(this).get(RiwayatViewModel.class);

        binding = FragmentRiwayatBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textRiwayat;
        riwayatViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}