async-socket-android
=====================

Android socket client for asynchronous communication, using AsyncTask.

Usage
=====

The AsyncConnection class is an AsyncTask that can be used to open a socket connection with a server and to write/read data asynchronously.


The socket connection is initiated in the background thread of the AsyncTask which will stay alive reading data in a while loop until disconnect() method is called from outside or the connection has been lost.


When the socket reads data it sends it to the ConnectionHandler via didReceiveData() method in the same thread of AsyncTask.

To write data to the server call write() method from outside thread. As the intput and output streams are separate there will be no problem with synchronisation. 


A useful tip: if you wish to avoid connection timeout to happen while the application is inactive try to write some meaningless data periodically as a heartbeat. 

A useful tip: if you wish to keep the connection alive for longer that the activity  life cycle than consider using services.