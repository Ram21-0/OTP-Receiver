package com.example.otpreceiver;

public interface OTPReceiverInterface {

    void onOtpReceived(String otp);
    void onOtpTimeout();
}
