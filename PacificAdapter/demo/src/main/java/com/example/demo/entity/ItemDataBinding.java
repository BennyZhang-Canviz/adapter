package com.example.demo.entity;

import com.example.demo.R;
import com.example.demo.databinding.ItemDataBindingBinding;
import com.pacific.adapter.SimpleItem;
import com.pacific.adapter.ViewHolder;

public class ItemDataBinding extends SimpleItem {
    private String title;

    public ItemDataBinding(String title) {
        this.title = title;
    }

    @Override
    public int getLayout() {
        return R.layout.item_data_binding;
    }

    @Override
    public void bind(ViewHolder holder) {
        ItemDataBindingBinding binding = holder.binding();
        binding.text.setText(title);
        holder.attachOnClickListener(R.id.text);
    }
}
