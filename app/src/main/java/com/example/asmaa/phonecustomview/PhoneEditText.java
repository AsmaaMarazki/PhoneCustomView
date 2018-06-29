package com.example.asmaa.phonecustomview;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;

public class PhoneEditText extends ConstraintLayout {
    TextView countryCode;
    EditText phoneNumber;
    public PhoneEditText(Context context) {
        super(context);
        inflate(context,R.layout.phone_edit_text,this);
        prepareView();
    }

    public PhoneEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context,R.layout.phone_edit_text,this);
        prepareView();
    }
    private void prepareView(){
        countryCode=findViewById(R.id.tv_code);
        phoneNumber=findViewById(R.id.edt_phone);
    }
    public String getPhone(){
        return countryCode.getText().toString()+phoneNumber.getText().toString();
    }
    public void setCode(String code){
        countryCode.setText(code);
    }
}
