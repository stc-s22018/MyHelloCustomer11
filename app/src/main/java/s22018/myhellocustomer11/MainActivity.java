package s22018.myhellocustomer11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタン・オブジェクトの用意
        Button btClick = findViewById(R.id.btShow);
        //リスナ・オブジェクトの用意
        MyHelloCustomer listener = new  MyHelloCustomer();
        //ボタンにリスナを設定
        btClick.setOnClickListener(listener);

        //クリアボタンであるButtonオブジェクトを取得
        Button btClear = findViewById(R.id.btLive);
        //クリアボタンにリスナを取得
        btClear.setOnClickListener(listener);

        Button btClear2 = findViewById(R.id.btName);
        //クリアボタンにリスナを取得
        btClear2.setOnClickListener(listener);
    }

    private class MyHelloCustomer implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            EditText input = findViewById(R.id.etLive);
            EditText input2 = findViewById(R.id.etName);


            int id = v.getId();

            if (id == R.id.btShow) {
                String inputStr = input.getText().toString();
                String inputStr2 = input2.getText().toString();
                String inputStr3 = inputStr+ "にお住いの" + inputStr2 + "さん、こんにちは！";
                Toast.makeText(MainActivity.this,inputStr3,Toast.LENGTH_LONG).show();


            } else if (id == R.id.btLive) {
                input.setText("");
            } else if (id == R.id.btName) {
                input2.setText("");
            }
        }
    }
}