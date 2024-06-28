package kessia.queyla.raissa.rebeka.plantae;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AdicionarPlantasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_plantas);

        // Localize o botão e configure o OnClickListener
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir a EscolherPlantasActivity
                Intent intent = new Intent(AdicionarPlantasActivity.this, EscolherPlantas.class);
                startActivity(intent);
            }
        });
    }
}
