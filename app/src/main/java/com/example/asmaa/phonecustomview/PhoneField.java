package com.example.asmaa.phonecustomview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.hbb20.CountryCodePicker;

public class PhoneField extends LinearLayout {
    CountryCodePicker countryCodePicker;
    PhoneEditText phoneEditText;
    public PhoneField(Context context) {
        super(context);
        inflate(context,R.layout.phone_field,this);
        prepareView();
    }

    public PhoneField(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        inflate(context,R.layout.phone_field,this);
        prepareView();
    }

    public PhoneField(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflate(context,R.layout.phone_field,this);
        prepareView();
    }
    protected void prepareView() {
        countryCodePicker = findViewById(R.id.countryCodePicker);
        phoneEditText = findViewById(R.id.phoneInput);
        phoneEditText.setCode("+"+countryCodePicker.getSelectedCountryCode());

        countryCodePicker.setOnCountryChangeListener(new CountryCodePicker.OnCountryChangeListener() {
            @Override
            public void onCountrySelected() {
                phoneEditText.setCode("+"+countryCodePicker.getSelectedCountryCode());

            }
        });
    }

    public String getPhoneNumber(){
        return phoneEditText.getPhone();
    }

}
