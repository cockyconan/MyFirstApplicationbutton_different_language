package student.jnu.com.myfirstapplication;

import android.support.annotation.IdRes;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.test.mock.MockContext;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import static student.jnu.com.myfirstapplication.R.string.language_cn;


/**
 * Created by chen on 2019/9/10.
 */

public class ChangeLanguageMainActivity extends AppCompatActivity {




    private Button btn;
    private TextView datext;
    private EditText edit_t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language_activity_main);

        btn=(Button)findViewById(R.id.button_change_language);
        datext=(TextView)findViewById(R.id.text_view_language);
        edit_t=(EditText)findViewById(R.id.edit_text_country);
        class lan_click implements View.OnClickListener
        {
            public void onClick(View V)
            {
                String language;
                language=edit_t.getText().toString();
                String subprev ="language_";
                String prev="change_";
                subprev=subprev+language;
                int textstringid= getApplicationContext().getResources().getIdentifier(subprev,"string", getApplicationContext().getPackageName());
                if(textstringid>0) {
                    datext.setText(getString(textstringid));
                    prev = prev + subprev;
                    textstringid = getApplicationContext().getResources().getIdentifier(prev, "string", getApplicationContext().getPackageName());
                    btn.setText(getString(textstringid));
                }

            }


        }
        btn.setOnClickListener(new lan_click());
    }

}





