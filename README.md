# RobotFace

To generate various Robot face expressions, we send push notifications using MQTT.
In order to generate various expressions, you need to send across MQTT messages to the topic _commands_

## Setup

1) Clone this repository
2) Open this in Android Studio
3) Install Mosquitto MQTT Broker (_brew install mosquitto_ should suffice)
4) Change *only* the IP address in _Constants.java_ file in Android Studio
5) Install the app on the phone
6) Start _mosquitto_ by issuing the command _*mosquitto*_ on terminal
7) Open another Terminal. 
8) Enter command _mosquitto_pub -t commands -m 1_ to generate neutral blink
9) Enter command _mosquitto_pub -t commands -m 2_ to generate expectant blink
10) Enter command _mosquitto_pub -t commands -m 3_ to generate the third expression
