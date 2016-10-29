package poly.pom.trythespinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import poly.pom.trythespinner.adapter.MyArrayAdapter;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.sp_member)
    Spinner spMember;
    private String[] memberList = {"A", "B", "C"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ArrayList<String> memberArrayList = new ArrayList<>(Arrays.asList(memberList));
        MyArrayAdapter adapter = new MyArrayAdapter(this, memberArrayList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spMember.setAdapter(adapter);

    }
}
