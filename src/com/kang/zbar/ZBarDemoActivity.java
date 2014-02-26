package com.kang.zbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class ZBarDemoActivity extends Activity implements OnClickListener {
	private EditText et_edit;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// �ı������
		et_edit = (EditText) findViewById(R.id.editText1);

		// ɨ�谴ť
		findViewById(R.id.button1).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		Intent intent = new Intent();
		intent.setClass(this, CameraTestActivity.class);
		startActivityForResult(intent, 0);

	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		//���ص�����������
		String code = data.getStringExtra("Code");

		//�����ı��������
		et_edit.setText(code);

		super.onActivityResult(requestCode, resultCode, data);
	}
}