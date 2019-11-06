package view;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.hyuna.missionapp.R;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.top_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.settings :
                //환경설정 버튼
                break;

            case  R.id.logout:
                //로그아웃 버튼
                break;
            default :
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
