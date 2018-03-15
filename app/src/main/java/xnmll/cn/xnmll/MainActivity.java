package xnmll.cn.xnmll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Button btn = (Button)this.findViewById(R.id.button2);
        btn.setOnClickListener(new MyOnClickListener());
    }
    private class MyOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this,"hello",Toast.LENGTH_LONG).show();
        }
    }
}
