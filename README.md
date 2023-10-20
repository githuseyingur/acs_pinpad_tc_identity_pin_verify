## Verify TC Identity Card PIN from ACS Smartcard Reader

We need APDU commands for pin verification. These APDU commands vary according to the type of the card. Since the card we will use is a TC ID card, we need to work with IAS-specific APDU commands. These values are as follows:  <br> <br>
<img src="https://github.com/githuseyingur/acs_pinpad_verify_tc_identity_pin/assets/120099096/bc0b3008-705f-4519-b1a2-58ac06731a7b"  width="620" height ="355"> <br> <br> <br>
Since a 6-digit pin will be entered, we need to enter a minimum value of 6 and a maximum value of 6, that is  <ins>0606</ins>, in the <ins>Pin Extra Digit</ins> field. The data in the 'abData' section is important. This data is CLA, INS, P1, P2 and L*p* (length of the pin to be entered) respectively. <br><br>

#### abData : CLA, INS, P1, P2, Lp
<br> 


***CLA (Class Byte):*** &nbsp; &nbsp;The class indicates the type of operation to be performed, e.g. whether it is a basic operation or a special operation. For example, the CLA byte "00" often represents basic operations, while the CLA byte "80" may represent special operations.

***INS (Instruction Byte):*** &nbsp; &nbsp;The INS byte specifies the specific instruction to be executed. This byte tells the board what operation to perform.

***P1 (Parameter 1):***  &nbsp;  &nbsp;  The P1 byte indicates whether the command is associated with a specific parameter. For example, in a command to change a PIN code, the P1 byte can specify which PIN to change.

***P2 (parameter 2):***  &nbsp;  &nbsp;  The P2 byte, used in conjunction with P1, specifies how the command is further associated with additional parameters. It is particularly used for more specific commands. For example, if the P1 byte indicates that a PIN is to be changed, the P2 byte can specify what operation is to be performed (e.g. changing the PIN code).



<br> <br>

<img src="https://github.com/githuseyingur/acs_pinpad_verify_tc_identity_pin/assets/120099096/a4655562-0b74-4959-aedb-f2b147470331"  width="360" height ="580">
<img src="https://github.com/githuseyingur/acs_pinpad_verify_tc_identity_pin/assets/120099096/bbf5fcc1-ea1d-47e2-b3c9-7bcab493205e"  width="360" height ="580">

<br> <br>

<img src="https://github.com/githuseyingur/acs_pinpad_verify_tc_identity_pin/assets/120099096/17d1de26-ba15-4cf6-99ad-abfb6b7d51ff"  width="280" height ="580">
<img src="https://github.com/githuseyingur/acs_pinpad_verify_tc_identity_pin/assets/120099096/99a1f8b1-0f37-4daa-b921-9a144f32f2f6"  width="360" height ="580">
<br>
!! Pictures will be updated.
<br> <br>

#### Response : *90 00* (Successful)
A response is returned as a result of the pin verification process.   <br>
If this response is *90 00*, it means that the pin verification process was successful.


Complete list of APDU responses : https://www.eftlab.com/knowledge-base/complete-list-of-apdu-responses

<br> <br>
<br> <br>

##### Thanks to Muhammed Hoşgör : https://github.com/muhammedhosgor
