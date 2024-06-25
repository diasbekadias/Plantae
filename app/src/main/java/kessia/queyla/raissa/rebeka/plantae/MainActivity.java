package kessia.queyla.raissa.rebeka.plantae;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_DISPLAY_LENGTH = 2000; // Duração da tela de logo (2 segundos)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            // Delay de 3 segundos
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Iniciar a Activity principal (adicionar_plantas)
                    Intent intent = new Intent(MainActivity.this, AdicionarPlantasActivity.class);
                    startActivity(intent);
                    finish(); // Fechar a MainActivity (Splash)
                }
            }, 3000); // 3000 milissegundos = 3 segundos
        }
    }
