package com.example.sukses1.ui.setoran;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.sukses1.databinding.FragmentSetoranBinding;

public class SetoranFragment extends Fragment {

    private FragmentSetoranBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SetoranViewModel setoranViewModel =
                new ViewModelProvider(this).get(SetoranViewModel.class);

        binding = FragmentSetoranBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSetoran;

        setoranViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}