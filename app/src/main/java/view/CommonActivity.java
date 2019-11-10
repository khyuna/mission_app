package view;

import android.view.Menu;
import android.view.MenuItem;

import com.example.hyuna.missionapp.R;

import androidx.appcompat.app.AppCompatActivity;

public class CommonActivity extends AppCompatActivity {
    /**
     * 공통 Activity
     * 공통 UI 구현
     * @param menu
     * @return
     */
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
