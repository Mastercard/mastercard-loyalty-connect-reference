# loyalty-connect-client

Mastercard Loyalty Connect Service
- API version: 1.0
  - Build date: 2019-11-12T16:02:42.822+05:30[Asia/Calcutta]

Rest Service for linking payment cards with loyalty programme

  For more information, please visit [https://developer.mastercard.com](https://developer.mastercard.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.mastercard.developer</groupId>
  <artifactId>loyalty-connect-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.mastercard.developer:loyalty-connect-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/loyalty-connect-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.mastercard.developer.loyalty_connect_client.*;
import com.mastercard.developer.loyalty_connect_client.auth.*;
import com.mastercard.developer.loyalty_connect_client.model.*;
import com.mastercard.developer.loyalty_connect_client.api.LoyaltyConnectApi;

import java.io.File;
import java.util.*;

public class LoyaltyConnectApiExample {

    public static void main(String[] args) {
        
        LoyaltyConnectApi apiInstance = new LoyaltyConnectApi();
        String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | Unique reference key for a member
        String loyaltyConnectReferenceId = "\"f962ad86-d408-467c-8b74-14983569d36c\""; // String | Unique reference key for the connection of a loyalty ID and payment card
        String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
        try {
            apiInstance.deleteLoyaltyConnect(memberReferenceId, loyaltyConnectReferenceId, xMerchantKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoyaltyConnectApi#deleteLoyaltyConnect");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://api.mastercard.com/mlc/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*LoyaltyConnectApi* | [**deleteLoyaltyConnect**](docs/LoyaltyConnectApi.md#deleteLoyaltyConnect) | **DELETE** /members/{member_reference_id}/loyalty-connects/{loyalty_connect_reference_id} | Disconnects a specific payment card and Loyalty ID for a member
*LoyaltyConnectApi* | [**enrollLoyaltyConnect**](docs/LoyaltyConnectApi.md#enrollLoyaltyConnect) | **POST** /members/{member_reference_id}/loyalty-connects | Connects payment card and Loyalty ID for a member
*LoyaltyConnectApi* | [**getLoyaltyConnect**](docs/LoyaltyConnectApi.md#getLoyaltyConnect) | **GET** /members/{member_reference_id}/loyalty-connects/{loyalty_connect_reference_id} | Get a specific Loyalty ID and payment card connection details for a member
*LoyaltyConnectApi* | [**getLoyaltyConnects**](docs/LoyaltyConnectApi.md#getLoyaltyConnects) | **GET** /members/{member_reference_id}/loyalty-connects | Get payment card and Loyalty ID connection details for a member
*MemberApi* | [**deleteMember**](docs/MemberApi.md#deleteMember) | **DELETE** /members/{member_reference_id} | Delete a member
*MemberApi* | [**enrollMember**](docs/MemberApi.md#enrollMember) | **POST** /members | Enroll a member
*MemberApi* | [**getMember**](docs/MemberApi.md#getMember) | **GET** /members/{member_reference_id} | Get a Member
*MemberApi* | [**updateMember**](docs/MemberApi.md#updateMember) | **PUT** /members/{member_reference_id} | Update a member
*MemberMerchantApi* | [**deleteMemberMerchantLoyaltyProgram**](docs/MemberMerchantApi.md#deleteMemberMerchantLoyaltyProgram) | **DELETE** /members/{member_reference_id}/loyalty-programs/{member_merchant_reference_id} | Disconnect a loyalty program for a member
*MemberMerchantApi* | [**getAllMemberMerchantLoyaltyProgram**](docs/MemberMerchantApi.md#getAllMemberMerchantLoyaltyProgram) | **GET** /members/{member_reference_id}/loyalty-programs | Get loyalty programs for a member
*MemberMerchantApi* | [**getMemberMerchantLoyaltyProgram**](docs/MemberMerchantApi.md#getMemberMerchantLoyaltyProgram) | **GET** /members/{member_reference_id}/loyalty-programs/{member_merchant_reference_id} | Get details for a specific Merchant Loyalty Program
*MemberMerchantApi* | [**joinOrConnectMerchantLoyaltyProgram**](docs/MemberMerchantApi.md#joinOrConnectMerchantLoyaltyProgram) | **POST** /members/{member_reference_id}/loyalty-programs | Enroll a member in a Merchant Loyalty Program
*MerchantApi* | [**getMerchants**](docs/MerchantApi.md#getMerchants) | **GET** /merchants | Get Merchants
*PaymentCardApi* | [**deletePaymentCard**](docs/PaymentCardApi.md#deletePaymentCard) | **DELETE** /members/{member_reference_id}/payment-cards/{payment_card_reference_id} | Disconnects a payment card for a member
*PaymentCardApi* | [**enrollPaymentCard**](docs/PaymentCardApi.md#enrollPaymentCard) | **POST** /members/{member_reference_id}/payment-cards | Connect payment card for a member
*PaymentCardApi* | [**getPaymentCardDetails**](docs/PaymentCardApi.md#getPaymentCardDetails) | **GET** /members/{member_reference_id}/payment-cards/{payment_card_reference_id} | Get payment card details for a member
*PaymentCardApi* | [**getPaymentCards**](docs/PaymentCardApi.md#getPaymentCards) | **GET** /members/{member_reference_id}/payment-cards | Get all payment cards for a member
*PaymentCardApi* | [**updatePaymentCard**](docs/PaymentCardApi.md#updatePaymentCard) | **PUT** /members/{member_reference_id}/payment-cards/{payment_card_reference_id} | Update a payment card for a member
*TransactionApi* | [**getLoyaltyId**](docs/TransactionApi.md#getLoyaltyId) | **POST** /loyalty-ids/searches | Get loyalty id


## Documentation for Models

 - [DetailItem](docs/DetailItem.md)
 - [EnrollLoyaltyConnectResponse](docs/EnrollLoyaltyConnectResponse.md)
 - [Error](docs/Error.md)
 - [ErrorItem](docs/ErrorItem.md)
 - [Errors](docs/Errors.md)
 - [LoyaltyConnect](docs/LoyaltyConnect.md)
 - [LoyaltyConnectResponse](docs/LoyaltyConnectResponse.md)
 - [Member](docs/Member.md)
 - [MemberDetails](docs/MemberDetails.md)
 - [MemberMerchantLoyaltyDetails](docs/MemberMerchantLoyaltyDetails.md)
 - [MemberMerchantResponse](docs/MemberMerchantResponse.md)
 - [MemberResponse](docs/MemberResponse.md)
 - [Merchant](docs/Merchant.md)
 - [MerchantLoyaltyProgram](docs/MerchantLoyaltyProgram.md)
 - [MerchantLoyaltyProgramResponse](docs/MerchantLoyaltyProgramResponse.md)
 - [MerchantLoyaltyProgramSearchResponse](docs/MerchantLoyaltyProgramSearchResponse.md)
 - [PaymentCard](docs/PaymentCard.md)
 - [PaymentCardDetails](docs/PaymentCardDetails.md)
 - [PaymentCardResponse](docs/PaymentCardResponse.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionResponse](docs/TransactionResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

apisupport@mastercard.com

