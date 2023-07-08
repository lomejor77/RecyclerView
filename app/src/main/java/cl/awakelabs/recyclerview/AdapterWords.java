package cl.awakelabs.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.awakelabs.recyclerview.databinding.ItemBinding;

public class AdapterWords extends RecyclerView.Adapter <AdapterWords.ViewHolder>{
    private List<String> words;
    @NonNull
    @Override
    public AdapterWords.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWords.ViewHolder holder, int position) {
       String item = words.get(position);
       holder.infoView(item);
    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemBinding itemBinding;
        public ViewHolder(@NonNull ItemBinding binding) {
            super(binding.getRoot());
            itemBinding = binding;
        }
        public void infoView(String words){
            itemBinding.txView.setText(words);
        }
    }


}
