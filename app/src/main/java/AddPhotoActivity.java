import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import java.util.ArrayList;

import kessia.queyla.raissa.rebeka.plantae.R;

public class AddPhotoActivity extends AppCompatActivity {

    private static final int PICK_IMAGE = 1;
    private ImageButton imageButton;
    private Button btnChoosePhoto;
    private ArrayList<Uri> plantList; // Lista de plantas (representadas por URIs de imagem)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_photo);

        imageButton = findViewById(R.id.imageButton);
        btnChoosePhoto = findViewById(R.id.btnChoosePhoto);
        plantList = new ArrayList<>();

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseImage();
            }
        });

        btnChoosePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPlantToList();
            }
        });
    }

    private void chooseImage() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, PICK_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE && resultCode == RESULT_OK && data != null) {
            Uri selectedImage = data.getData();
            imageButton.setImageURI(selectedImage);
            imageButton.setTag(selectedImage); // Usar a tag para armazenar o URI da imagem selecionada
        }
    }

    private void addPlantToList() {
        Uri selectedImage = (Uri) imageButton.getTag();
        if (selectedImage != null) {
            plantList.add(selectedImage);
            // Exibir uma mensagem ou atualizar a UI para confirmar a adição
        } else {
            // Exibir uma mensagem solicitando ao usuário que escolha uma imagem
        }
    }
}
