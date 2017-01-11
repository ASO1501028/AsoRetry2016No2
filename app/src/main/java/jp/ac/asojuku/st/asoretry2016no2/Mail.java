package jp.ac.asojuku.st.asoretry2016no2;

/**
 * Created by AHKNT on 2017/01/11.
 */

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mail extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
        Button btnSend = (Button) this.findViewById(R.id.button);
        btnSend.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        EditText edit01 = (EditText)findViewById(R.id.editText);
        String title = edit01.getText().toString();
        Resources res = getResources();
        Uri uri = Uri.parse("mailto:" + res.getString(R.string.mail_to).toString());
        Intent intent=new Intent(Intent.ACTION_SENDTO, uri);
        intent.putExtra(Intent.EXTRA_SUBJECT, title);
        startActivity(intent);
    }

}
