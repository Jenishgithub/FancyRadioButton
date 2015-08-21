package com.example.fancyradiobutton;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity implements OnCheckedChangeListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		((RadioGroup) findViewById(R.id.fancy_radio_group))
				.setOnCheckedChangeListener(this);
		((RadioGroup) findViewById(R.id.standard_radio_group))
				.setOnCheckedChangeListener(this);
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		String groupName = "";
		if (group.getId() == R.id.standard_radio_group) {
			groupName += "Standard radio group: ";
		} else {
			groupName += "Fancy radio group: ";
		}
		RadioButton rb = (RadioButton) findViewById(checkedId);
		Toast.makeText(this, groupName + rb.getText(), Toast.LENGTH_LONG)
				.show();
	}

}
