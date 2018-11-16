package app.snapchef.com.base;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;

import app.snapchef.com.base.R;

public class AccountView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_account_view);
       // getSupportActionBar().setTitle("Account");

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        bottomNav.getMenu().getItem(0).setChecked(true);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener(){
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent intent = null;
            switch (item.getItemId()) {
                case R.id.navigation_account:
                    intent = new Intent(getApplicationContext(), AccountView.class);
                    break;

                case R.id.navigation_home:
                    intent  = new Intent(getApplicationContext(), HomeView.class);
                    break;

                case R.id.navigation_search:
                    // intent = new Intent(getApplicationContext(), .class);
                    break;

                case R.id.navigation_add:
                    //intent = new Intent(getApplicationContext(), NewRecipeView.class);
                    break;


                case R.id.navigation_text_search:
                    // intent = new Intent(getApplicationContext(), .class);
                    break;
            }

            startActivity(intent);
            return true;
        }
    };
}