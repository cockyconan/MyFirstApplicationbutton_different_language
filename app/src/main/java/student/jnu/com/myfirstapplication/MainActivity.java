package student.jnu.com.myfirstapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.test.mock.MockContext;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //通过id获取textview空间并且修改文本
        TextView main_text;
        main_text = (TextView) findViewById(R.id.text_view_hello_world);
        //main_text.setText(getResources().getString(R.string.new_text_ex_3));
        //利用资源ID获得字符串
        String textname="new_text_ex_3";
        int textstringid= getApplicationContext().getResources().getIdentifier(textname,"string", getApplicationContext().getPackageName());
        main_text.setText(this.getString(textstringid));


    }



}
