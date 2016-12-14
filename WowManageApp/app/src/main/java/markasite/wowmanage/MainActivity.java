package markasite.wowmanage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/**so I guess the first thing we want users to do is add account details that will be saved
 * for now we will have an internal account the users simply puts in their battletag - but later on we can add battlenet support
 * i saw some information on this but this should do for now*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
