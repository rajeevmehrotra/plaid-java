package com.plaid.client.response.paymentinitiation;

import com.plaid.client.response.BaseResponse;
import java.util.Date;

public final class PaymentTokenCreateResponse extends BaseResponse {
  private String paymentToken;
  private Date paymentTokenExpirationTime;

  public String getPaymentToken() {
    return paymentToken;
  }

  public Date getPaymentTokenExpirationTime() {
    return paymentTokenExpirationTime;
  }
}
