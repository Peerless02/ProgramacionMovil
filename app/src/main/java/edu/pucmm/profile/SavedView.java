package edu.pucmm.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import edu.pucmm.profile.databinding.ActivitySavedViewBinding;

public class SavedView extends AppCompatActivity {

    private ActivitySavedViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        binding = ActivitySavedViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();

        if (intent != null) {
            String nombreRecibido = intent.getStringExtra("CLAVE_NOMBRE");
            String idRecibido = intent.getStringExtra("CLAVE_ID");
            String carreraRecibida = intent.getStringExtra("CLAVE_CARRERA");

            if (nombreRecibido != null) {
                binding.lblSaludo.setText("Hola, " + nombreRecibido);
                binding.lblUserName.setText(nombreRecibido);
            }
            if (idRecibido != null) binding.lblIDUser.setText(idRecibido);
            if (carreraRecibida != null) binding.lblCareerUser.setText(carreraRecibida);

            binding.btnEdit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });


//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        }
    }


}
